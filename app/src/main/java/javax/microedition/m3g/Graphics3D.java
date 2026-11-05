package javax.microedition.m3g;

import java.util.Arrays;
import javax.microedition.lcdui.Graphics;

/**
 * Rasterizador por software (modo inmediato de JSR-184).
 * Dibuja en un buffer propio ARGB y lo vuelca al Graphics en releaseTarget().
 * Si no hubo clear() el buffer arranca transparente y se compone encima de lo que
 * ya estaba dibujado (el juego pinta 2D y 3D sobre el mismo Graphics).
 */
public final class Graphics3D {
    public static final int ANTIALIAS = 2;
    public static final int DITHER = 4;
    public static final int TRUE_COLOR = 8;
    public static final int OVERWRITE = 16;

    private static Graphics3D instance;

    public static synchronized Graphics3D getInstance() {
        if (instance == null) instance = new Graphics3D();
        return instance;
    }

    private static final CompositingMode DEFAULT_CM = new CompositingMode();
    private static final PolygonMode DEFAULT_PM = new PolygonMode();

    private Graphics3D() {}

    private Graphics target;
    private boolean depthEnabled;
    private boolean opaqueBase;
    private boolean viewportSet;
    private int vx, vy, vw, vh;
    private int[] color = new int[0];
    private float[] depth = new float[0];

    private final Transform proj = new Transform();
    private final Transform view = new Transform();
    private final Transform mvp = new Transform();
    private final Transform model = new Transform();

    // vertices en espacio de recorte: x,y,z,w,u,v,r,g,b,a
    private float[] verts = new float[0];
    private final float[] polyA = new float[8 * 10];
    private final float[] polyB = new float[8 * 10];
    private final float[] sx = new float[8], sy = new float[8], sz = new float[8], siw = new float[8];
    private final float[] su = new float[8], sv = new float[8];
    private final float[] sr = new float[8], sg = new float[8], sb = new float[8], sa = new float[8];

    // estado del render en curso
    private CompositingMode fCm;
    private PolygonMode fPm;
    private Texture2D fTex;
    private boolean fTextured;
    private Fog fFog;

    // ---- luces (en espacio de ojo, capturadas al agregarlas) ----
    private static final class LightSlot {
        Light l;
        float px, py, pz;   // posicion (omni/spot)
        float dx, dy, dz;   // direccion en la que alumbra (direccional/spot), normalizada
    }
    private final java.util.ArrayList<LightSlot> lights = new java.util.ArrayList<LightSlot>();
    private final Transform tmpT = new Transform();
    private float[] eye = new float[0];          // posiciones en espacio de ojo (x,y,z por vertice)
    private boolean fLit;
    private Material fMat;
    private boolean litActive;                   // la cara actual trae mul/add propios
    private final float[] lightMul = new float[3];
    private final float[] lightAdd = new float[3];

    public void bindTarget(Object t) { bindTarget(t, true, 0); }

    public synchronized void bindTarget(Object t, boolean depthBuffer, int hints) {
        if (target != null) throw new IllegalStateException("ya hay un target");
        if (t == null) throw new NullPointerException();
        if (!(t instanceof Graphics)) throw new IllegalArgumentException("target no soportado");
        target = (Graphics) t;
        depthEnabled = depthBuffer;
        if (!viewportSet) {
            vx = 0; vy = 0;
            vw = target.getClipWidth();
            vh = target.getClipHeight();
        }
        ensureBuffers();
        Arrays.fill(color, 0);
        opaqueBase = false;
        if (depthEnabled) Arrays.fill(depth, Float.MAX_VALUE);
    }

    public synchronized void releaseTarget() {
        if (target == null) return;
        if (vw > 0 && vh > 0) target.drawRGB(color, 0, vw, vx, vy, vw, vh, !opaqueBase);
        target = null;
    }

    public synchronized void setViewport(int x, int y, int w, int h) {
        if (w <= 0 || h <= 0 || w > 2048 || h > 2048) throw new IllegalArgumentException("viewport");
        vx = x; vy = y; vw = w; vh = h;
        viewportSet = true;
        if (target != null) ensureBuffers();
    }

    public synchronized void setCamera(Camera c, Transform t) {
        if (c == null) proj.setIdentity(); else c.getProjection(proj);
        if (t == null) {
            view.setIdentity();
        } else {
            view.set(t);
            view.invert();
        }
    }

    /** Agrega una luz; t es luz->mundo (null = identidad). Devuelve su indice. */
    public synchronized int addLight(Light l, Transform t) {
        if (l == null) throw new NullPointerException();
        LightSlot s = new LightSlot();
        fillSlot(s, l, t);
        lights.add(s);
        return lights.size() - 1;
    }

    public synchronized void setLight(int index, Light l, Transform t) {
        if (l == null) throw new NullPointerException();
        if (index < 0 || index >= lights.size()) throw new IndexOutOfBoundsException();
        fillSlot(lights.get(index), l, t);
    }

    public synchronized void resetLights() { lights.clear(); }

    public synchronized int getLightCount() { return lights.size(); }

    private void fillSlot(LightSlot s, Light l, Transform t) {
        tmpT.set(view);
        if (t != null) tmpT.postMultiply(t);
        final float[] m = tmpT.m;
        s.l = l;
        s.px = m[3]; s.py = m[7]; s.pz = m[11];
        // la luz alumbra hacia -Z de su sistema local
        float x = -m[2], y = -m[6], z = -m[10];
        float len = (float) Math.sqrt(x * x + y * y + z * z);
        if (len < 1e-6f) { x = 0f; y = 0f; z = -1f; len = 1f; }
        s.dx = x / len; s.dy = y / len; s.dz = z / len;
    }

    public synchronized void clear(Background bg) {
        if (target == null) throw new IllegalStateException("no hay target");
        int n = vw * vh;
        int c = 0;
        boolean cc = true, dc = true;
        if (bg != null) {
            c = bg.getColor();
            cc = bg.isColorClearEnabled();
            dc = bg.isDepthClearEnabled();
        }
        if (cc) {
            Arrays.fill(color, 0, n, 0xFF000000 | (c & 0x00FFFFFF));
            opaqueBase = true;
        }
        if (dc && depthEnabled) Arrays.fill(depth, 0, n, Float.MAX_VALUE);
    }

    private void ensureBuffers() {
        int n = Math.max(0, vw) * Math.max(0, vh);
        if (color.length != n) color = new int[n];
        if (depthEnabled && depth.length != n) depth = new float[n];
    }

    public void render(VertexBuffer vb, IndexBuffer ib, Appearance ap, Transform tr, int scope) {
        render(vb, ib, ap, tr);
    }

    public synchronized void render(VertexBuffer vb, IndexBuffer ib, Appearance ap, Transform tr) {
        if (target == null) throw new IllegalStateException("no hay target");
        if (vb == null || ib == null || ap == null) throw new NullPointerException();
        VertexArray pa = vb.positions();
        if (pa == null) throw new IllegalStateException("faltan posiciones");
        if (!(ib instanceof TriangleStripArray)) throw new IllegalArgumentException("indice no soportado");
        if (vw <= 0 || vh <= 0) return;
        TriangleStripArray strips = (TriangleStripArray) ib;

        fCm = ap.getCompositingMode();
        if (fCm == null) fCm = DEFAULT_CM;
        fPm = ap.getPolygonMode();
        if (fPm == null) fPm = DEFAULT_PM;
        fTex = ap.getTexture(0);
        fFog = ap.getFog();
        fMat = ap.getMaterial();
        fLit = fMat != null && !lights.isEmpty();

        if (tr == null) model.setIdentity(); else model.set(tr);
        mvp.set(proj);
        mvp.postMultiply(view);
        mvp.postMultiply(model);
        final float[] mm = mvp.m;
        float[] em = null;
        if (fLit) {
            tmpT.set(view);
            tmpT.postMultiply(model);
            em = tmpT.m;
        }

        final int n = pa.getVertexCount();
        if (verts.length < n * 10) verts = new float[n * 10];
        if (fLit && eye.length < n * 3) eye = new float[n * 3];
        final float[] pd = pa.data();
        final int pc = pa.getComponentCount();
        final float ps = vb.getPositionScale();
        final float[] pb = vb.getPositionBias();

        VertexArray ta = vb.texCoords(0);
        float[] td = ta != null ? ta.data() : null;
        int tc = ta != null ? ta.getComponentCount() : 0;
        float ts = vb.getTexCoordScale(0);
        float[] tb = vb.getTexCoordBias(0);
        fTextured = fTex != null && td != null && fTex.getImage() != null;

        VertexArray ca = vb.colors();
        float[] cd = ca != null ? ca.data() : null;
        int cc = ca != null ? ca.getComponentCount() : 0;
        boolean cbyte = ca != null && ca.getComponentType() == 1;
        int dcol = vb.getDefaultColor();
        float dr = (dcol >> 16) & 255, dg = (dcol >> 8) & 255, db = dcol & 255, da = (dcol >>> 24) & 255;

        for (int i = 0; i < n; i++) {
            int o = i * 10;
            int pi = i * pc;
            float x = pd[pi] * ps + pb[0];
            float y = pd[pi + 1] * ps + pb[1];
            float z = (pc > 2 ? pd[pi + 2] * ps : 0f) + pb[2];
            verts[o]     = mm[0] * x + mm[1] * y + mm[2] * z + mm[3];
            verts[o + 1] = mm[4] * x + mm[5] * y + mm[6] * z + mm[7];
            verts[o + 2] = mm[8] * x + mm[9] * y + mm[10] * z + mm[11];
            verts[o + 3] = mm[12] * x + mm[13] * y + mm[14] * z + mm[15];
            if (em != null) {
                int e3 = i * 3;
                eye[e3]     = em[0] * x + em[1] * y + em[2] * z + em[3];
                eye[e3 + 1] = em[4] * x + em[5] * y + em[6] * z + em[7];
                eye[e3 + 2] = em[8] * x + em[9] * y + em[10] * z + em[11];
            }
            if (fTextured) {
                int ti = i * tc;
                verts[o + 4] = td[ti] * ts + tb[0];
                verts[o + 5] = td[ti + 1] * ts + tb[1];
            } else {
                verts[o + 4] = 0f;
                verts[o + 5] = 0f;
            }
            if (cd != null) {
                int ci = i * cc;
                float r = cd[ci], g = cd[ci + 1], b = cd[ci + 2];
                float a = cc > 3 ? cd[ci + 3] : 255f;
                if (cbyte) {
                    if (r < 0f) r += 256f;
                    if (g < 0f) g += 256f;
                    if (b < 0f) b += 256f;
                    if (a < 0f) a += 256f;
                }
                verts[o + 6] = r; verts[o + 7] = g; verts[o + 8] = b; verts[o + 9] = a;
            } else {
                verts[o + 6] = dr; verts[o + 7] = dg; verts[o + 8] = db; verts[o + 9] = da;
            }
        }

        final int[] idx = strips.indexArray();
        final int[] sl = strips.stripArray();
        int pos = 0;
        for (int s = 0; s < sl.length; s++) {
            int len = sl[s];
            for (int k = 0; k + 2 < len; k++) {
                int ia = idx[pos + k], ib2 = idx[pos + k + 1], ic = idx[pos + k + 2];
                if ((k & 1) == 1) { int t = ib2; ib2 = ic; ic = t; }
                if (ia < 0 || ib2 < 0 || ic < 0 || ia >= n || ib2 >= n || ic >= n) continue;
                litActive = fLit && lightFace(ia, ib2, ic);
                drawTriangle(ia, ib2, ic);
            }
            pos += len;
        }
    }

    /**
     * Ilumina una cara (plana) en espacio de ojo. Deja en lightMul/lightAdd el factor a aplicar
     * al color de vertice (0..255). Devuelve false si la cara es degenerada.
     */
    private boolean lightFace(int ia, int ib, int ic) {
        final float[] e = eye;
        int a = ia * 3, b = ib * 3, c = ic * 3;
        float ax = e[a], ay = e[a + 1], az = e[a + 2];
        float ux = e[b] - ax, uy = e[b + 1] - ay, uz = e[b + 2] - az;
        float vx = e[c] - ax, vy = e[c + 1] - ay, vz = e[c + 2] - az;
        float nx = uy * vz - uz * vy, ny = uz * vx - ux * vz, nz = ux * vy - uy * vx;
        float nl = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);
        if (nl < 1e-9f) return false;
        nx /= nl; ny /= nl; nz /= nl;
        float cx = (ax + e[b] + e[c]) * (1f / 3f);
        float cy = (ay + e[b + 1] + e[c + 1]) * (1f / 3f);
        float cz = (az + e[b + 2] + e[c + 2]) * (1f / 3f);
        // la cara siempre mira hacia el ojo (iluminacion a dos caras): el ojo esta en el origen
        if (nx * cx + ny * cy + nz * cz > 0f) { nx = -nx; ny = -ny; nz = -nz; }

        float amR = 0f, amG = 0f, amB = 0f, dfR = 0f, dfG = 0f, dfB = 0f;
        final int mask = fMat.getLightMask();
        for (int i = 0, cnt = lights.size(); i < cnt; i++) {
            if (i < 32 && (mask & (1 << i)) == 0) continue;
            LightSlot s = lights.get(i);
            Light l = s.l;
            int lc = l.getColor();
            float k = l.getIntensity();
            float lr = ((lc >> 16) & 255) * (1f / 255f) * k;
            float lg = ((lc >> 8) & 255) * (1f / 255f) * k;
            float lb = (lc & 255) * (1f / 255f) * k;
            int mode = l.getMode();
            if (mode == Light.AMBIENT) {
                amR += lr; amG += lg; amB += lb;
                continue;
            }
            float ndl, att = 1f;
            if (mode == Light.DIRECTIONAL) {
                ndl = -(nx * s.dx + ny * s.dy + nz * s.dz);
            } else {
                float tx = s.px - cx, ty = s.py - cy, tz = s.pz - cz;
                float d2 = tx * tx + ty * ty + tz * tz;
                float d = (float) Math.sqrt(d2);
                if (d < 1e-6f) continue;
                tx /= d; ty /= d; tz /= d;
                att = 1f / (l.getConstantAttenuation() + l.getLinearAttenuation() * d
                        + l.getQuadraticAttenuation() * d2);
                if (mode == Light.SPOT) {
                    float cs = -(tx * s.dx + ty * s.dy + tz * s.dz);
                    float cut = (float) Math.cos(Math.toRadians(l.getSpotAngle()));
                    if (cs < cut || cs <= 0f) continue;
                    float ex = l.getSpotExponent();
                    if (ex > 0f) att *= (float) Math.pow(cs, ex);
                }
                ndl = nx * tx + ny * ty + nz * tz;
            }
            if (ndl <= 0f) continue;
            float f = ndl * att;
            dfR += lr * f; dfG += lg * f; dfB += lb * f;
        }

        boolean trk = fMat.isVertexColorTrackingEnabled();
        int tm = trk ? fMat.getVertexColorTrackingMask() : 0;
        boolean trA = (tm & Material.AMBIENT) != 0, trD = (tm & Material.DIFFUSE) != 0;
        int ma = fMat.getColor(Material.AMBIENT), md = fMat.getColor(Material.DIFFUSE);
        int me = fMat.getColor(Material.EMISSIVE);
        float er = ((me >> 16) & 255), eg = ((me >> 8) & 255), eb = (me & 255);
        float mulR = 0f, mulG = 0f, mulB = 0f, addR = er, addG = eg, addB = eb;
        if (trA) { mulR += amR; mulG += amG; mulB += amB; }
        else {
            addR += ((ma >> 16) & 255) * amR; addG += ((ma >> 8) & 255) * amG; addB += (ma & 255) * amB;
        }
        if (trD) { mulR += dfR; mulG += dfG; mulB += dfB; }
        else {
            addR += ((md >> 16) & 255) * dfR; addG += ((md >> 8) & 255) * dfG; addB += (md & 255) * dfB;
        }
        lightMul[0] = mulR; lightMul[1] = mulG; lightMul[2] = mulB;
        lightAdd[0] = addR; lightAdd[1] = addG; lightAdd[2] = addB;
        return true;
    }

    private void drawTriangle(int ia, int ib, int ic) {
        final float[] v = verts;
        int oa = ia * 10, ob = ib * 10, oc = ic * 10;
        float wa = v[oa + 3], wb = v[ob + 3], wc = v[oc + 3];
        // rechazo trivial contra los 6 planos
        if (v[oa] < -wa && v[ob] < -wb && v[oc] < -wc) return;
        if (v[oa] > wa && v[ob] > wb && v[oc] > wc) return;
        if (v[oa + 1] < -wa && v[ob + 1] < -wb && v[oc + 1] < -wc) return;
        if (v[oa + 1] > wa && v[ob + 1] > wb && v[oc + 1] > wc) return;
        if (v[oa + 2] > wa && v[ob + 2] > wb && v[oc + 2] > wc) return;
        if (v[oa + 2] < -wa && v[ob + 2] < -wb && v[oc + 2] < -wc) return;

        System.arraycopy(v, oa, polyA, 0, 10);
        System.arraycopy(v, ob, polyA, 10, 10);
        System.arraycopy(v, oc, polyA, 20, 10);
        if (litActive) {
            for (int q = 0; q < 3; q++) {
                int o = q * 10;
                polyA[o + 6] = polyA[o + 6] * lightMul[0] + lightAdd[0];
                polyA[o + 7] = polyA[o + 7] * lightMul[1] + lightAdd[1];
                polyA[o + 8] = polyA[o + 8] * lightMul[2] + lightAdd[2];
            }
        }
        int n = clipNear(polyA, 3, polyB);
        if (n < 3) return;
        for (int i = 0; i < n; i++) {
            int o = i * 10;
            float iw = 1f / polyB[o + 3];
            siw[i] = iw;
            sx[i] = (polyB[o] * iw * 0.5f + 0.5f) * vw;
            sy[i] = (0.5f - polyB[o + 1] * iw * 0.5f) * vh;
            sz[i] = polyB[o + 2] * iw * 0.5f + 0.5f;
            su[i] = polyB[o + 4];
            sv[i] = polyB[o + 5];
            sr[i] = polyB[o + 6];
            sg[i] = polyB[o + 7];
            sb[i] = polyB[o + 8];
            sa[i] = polyB[o + 9];
        }
        for (int i = 1; i + 1 < n; i++) raster(0, i, i + 1);
    }

    /** Recorta contra el plano cercano (z + w >= 0). Devuelve la cantidad de vertices. */
    private static int clipNear(float[] in, int n, float[] out) {
        int m = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            float di = in[i * 10 + 2] + in[i * 10 + 3];
            float dj = in[j * 10 + 2] + in[j * 10 + 3];
            boolean ii = di >= 0f, jj = dj >= 0f;
            if (ii) {
                System.arraycopy(in, i * 10, out, m * 10, 10);
                m++;
            }
            if (ii != jj) {
                float t = di / (di - dj);
                for (int k = 0; k < 10; k++) {
                    out[m * 10 + k] = in[i * 10 + k] + t * (in[j * 10 + k] - in[i * 10 + k]);
                }
                m++;
            }
        }
        return m;
    }

    private void raster(int a, int b, int c) {
        final float x0 = sx[a], y0 = sy[a], x1 = sx[b], y1 = sy[b], x2 = sx[c], y2 = sy[c];
        final float area = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (area == 0f) return;
        // en pantalla (y hacia abajo) una cara antihoraria en NDC tiene area negativa
        boolean front = fPm.getWinding() == PolygonMode.WINDING_CCW ? area < 0f : area > 0f;
        int cull = fPm.getCulling();
        if (cull == PolygonMode.CULL_BACK && !front) return;
        if (cull == PolygonMode.CULL_FRONT && front) return;

        int minX = Math.max(0, (int) Math.floor(Math.min(x0, Math.min(x1, x2))));
        int maxX = Math.min(vw - 1, (int) Math.ceil(Math.max(x0, Math.max(x1, x2))));
        int minY = Math.max(0, (int) Math.floor(Math.min(y0, Math.min(y1, y2))));
        int maxY = Math.min(vh - 1, (int) Math.ceil(Math.max(y0, Math.max(y1, y2))));
        if (minX > maxX || minY > maxY) return;

        final float inv = 1f / area;
        float px = minX + 0.5f, py = minY + 0.5f;
        float l0r = ((x2 - x1) * (py - y1) - (y2 - y1) * (px - x1)) * inv;
        float l1r = ((x0 - x2) * (py - y2) - (y0 - y2) * (px - x2)) * inv;
        float l2r = ((x1 - x0) * (py - y0) - (y1 - y0) * (px - x0)) * inv;
        final float d0x = -(y2 - y1) * inv, d0y = (x2 - x1) * inv;
        final float d1x = -(y0 - y2) * inv, d1y = (x0 - x2) * inv;
        final float d2x = -(y1 - y0) * inv, d2y = (x1 - x0) * inv;

        final float z0 = sz[a], z1 = sz[b], z2 = sz[c];
        final boolean persp = fPm.isPerspectiveCorrectionEnabled();
        final float iw0 = siw[a], iw1 = siw[b], iw2 = siw[c];
        final float u0 = persp ? su[a] * iw0 : su[a];
        final float u1 = persp ? su[b] * iw1 : su[b];
        final float u2 = persp ? su[c] * iw2 : su[c];
        final float t0 = persp ? sv[a] * iw0 : sv[a];
        final float t1 = persp ? sv[b] * iw1 : sv[b];
        final float t2 = persp ? sv[c] * iw2 : sv[c];
        final float r0 = sr[a], r1 = sr[b], r2 = sr[c];
        final float g0 = sg[a], g1 = sg[b], g2 = sg[c];
        final float b0 = sb[a], b1 = sb[b], b2 = sb[c];
        final float a0 = sa[a], a1 = sa[b], a2 = sa[c];

        final int[] col = color;
        final float[] dep = depth;
        final boolean depthTest = depthEnabled && fCm.isDepthTestEnabled();
        final boolean depthWrite = depthEnabled && fCm.isDepthWriteEnabled();
        final boolean colorWrite = fCm.isColorWriteEnabled();
        final int mode = fCm.getBlending();
        final float thr = fCm.getAlphaThreshold() * 255f;

        final Fog fog = fFog;
        final boolean fogOn = fog != null;
        final boolean fogLin = fogOn && fog.getMode() == Fog.LINEAR;
        final float fogNear = fogOn ? fog.getNearDistance() : 0f;
        final float fogFar = fogOn ? fog.getFarDistance() : 1f;
        final float fogInv = fogOn && fogFar != fogNear ? 1f / (fogFar - fogNear) : 0f;
        final float fogDen = fogOn ? fog.getDensity() : 0f;
        final int fc = fogOn ? fog.getColor() : 0;
        final float fogR = (fc >> 16) & 255, fogG = (fc >> 8) & 255, fogB = fc & 255;

        int[] tp = null;
        int tw = 0, th = 0, wrapS = 0, wrapT = 0, func = 0;
        if (fTextured) {
            Image2D im = fTex.getImage();
            tp = im.pixels();
            tw = im.getWidth();
            th = im.getHeight();
            wrapS = fTex.getWrappingS();
            wrapT = fTex.getWrappingT();
            func = fTex.getBlending();
        }

        for (int y = minY; y <= maxY; y++) {
            float l0 = l0r, l1 = l1r, l2 = l2r;
            int row = y * vw;
            for (int x = minX; x <= maxX; x++, l0 += d0x, l1 += d1x, l2 += d2x) {
                if (l0 < 0f || l1 < 0f || l2 < 0f) continue;
                float z = l0 * z0 + l1 * z1 + l2 * z2;
                if (z < 0f || z > 1f) continue;
                int idx = row + x;
                if (depthTest && z > dep[idx]) continue;

                float r = l0 * r0 + l1 * r1 + l2 * r2;
                float g = l0 * g0 + l1 * g1 + l2 * g2;
                float bl = l0 * b0 + l1 * b1 + l2 * b2;
                float al = l0 * a0 + l1 * a1 + l2 * a2;

                if (tp != null) {
                    float uu, vv;
                    if (persp) {
                        float iw = l0 * iw0 + l1 * iw1 + l2 * iw2;
                        float k = 1f / iw;
                        uu = (l0 * u0 + l1 * u1 + l2 * u2) * k;
                        vv = (l0 * t0 + l1 * t1 + l2 * t2) * k;
                    } else {
                        uu = l0 * u0 + l1 * u1 + l2 * u2;
                        vv = l0 * t0 + l1 * t1 + l2 * t2;
                    }
                    int tx = (int) Math.floor(uu * tw);
                    int ty = (int) Math.floor(vv * th);
                    if (wrapS == Texture2D.WRAP_REPEAT) { tx %= tw; if (tx < 0) tx += tw; }
                    else { if (tx < 0) tx = 0; else if (tx >= tw) tx = tw - 1; }
                    if (wrapT == Texture2D.WRAP_REPEAT) { ty %= th; if (ty < 0) ty += th; }
                    else { if (ty < 0) ty = 0; else if (ty >= th) ty = th - 1; }
                    int tpx = tp[ty * tw + tx];
                    float ta = tpx >>> 24, tr = (tpx >> 16) & 255, tg = (tpx >> 8) & 255, tb = tpx & 255;
                    switch (func) {
                        case Texture2D.FUNC_REPLACE:
                            r = tr; g = tg; bl = tb; al = ta;
                            break;
                        case Texture2D.FUNC_DECAL: {
                            float k = ta / 255f;
                            r = r * (1f - k) + tr * k;
                            g = g * (1f - k) + tg * k;
                            bl = bl * (1f - k) + tb * k;
                            break;
                        }
                        case Texture2D.FUNC_ADD:
                            r = Math.min(255f, r + tr);
                            g = Math.min(255f, g + tg);
                            bl = Math.min(255f, bl + tb);
                            al = al * ta / 255f;
                            break;
                        default: // MODULATE y BLEND
                            r = r * tr / 255f;
                            g = g * tg / 255f;
                            bl = bl * tb / 255f;
                            al = al * ta / 255f;
                            break;
                    }
                }

                if (thr > 0f && al < thr) continue;

                if (fogOn) {
                    float d = 1f / (l0 * iw0 + l1 * iw1 + l2 * iw2);   // distancia en el eje de vista
                    float f;
                    if (fogLin) f = (fogFar - d) * fogInv;
                    else f = (float) Math.exp(-fogDen * d);
                    if (f < 1f) {
                        if (f < 0f) f = 0f;
                        r = fogR + (r - fogR) * f;
                        g = fogG + (g - fogG) * f;
                        bl = fogB + (bl - fogB) * f;
                    }
                }

                if (colorWrite) {
                    int ir = r <= 0f ? 0 : (r >= 255f ? 255 : (int) r);
                    int ig = g <= 0f ? 0 : (g >= 255f ? 255 : (int) g);
                    int ib = bl <= 0f ? 0 : (bl >= 255f ? 255 : (int) bl);
                    int ia = al <= 0f ? 0 : (al >= 255f ? 255 : (int) al);
                    col[idx] = blend(col[idx], ir, ig, ib, ia, mode);
                }
                if (depthWrite) dep[idx] = z;
            }
            l0r += d0y; l1r += d1y; l2r += d2y;
        }
    }

    /**
     * Mezcla un pixel. El canal alfa del buffer es cobertura (0 = nada dibujado):
     * por eso la bandera alphaWrite del juego no se aplica.
     */
    private static int blend(int dst, int sr, int sg, int sb, int sa, int mode) {
        if (mode == CompositingMode.REPLACE) return 0xFF000000 | (sr << 16) | (sg << 8) | sb;
        int dA = dst >>> 24, dR = (dst >> 16) & 255, dG = (dst >> 8) & 255, dB = dst & 255;
        if (dA == 0) {
            int oa = (mode == CompositingMode.ALPHA || mode == CompositingMode.ALPHA_ADD) ? sa : 255;
            return (oa << 24) | (sr << 16) | (sg << 8) | sb;
        }
        int rr, rg, rb, ra = dA;
        switch (mode) {
            case CompositingMode.ALPHA: {
                int inv = 255 - sa;
                ra = sa + dA * inv / 255;
                if (ra <= 0) return dst;
                rr = (sr * sa * 255 + dR * dA * inv) / (ra * 255);
                rg = (sg * sa * 255 + dG * dA * inv) / (ra * 255);
                rb = (sb * sa * 255 + dB * dA * inv) / (ra * 255);
                break;
            }
            case CompositingMode.ALPHA_ADD:
                rr = dR + sr * sa / 255;
                rg = dG + sg * sa / 255;
                rb = dB + sb * sa / 255;
                break;
            case CompositingMode.MODULATE:
                rr = sr * dR / 255;
                rg = sg * dG / 255;
                rb = sb * dB / 255;
                break;
            default: // MODULATE_X2
                rr = sr * dR * 2 / 255;
                rg = sg * dG * 2 / 255;
                rb = sb * dB * 2 / 255;
                break;
        }
        if (rr > 255) rr = 255;
        if (rg > 255) rg = 255;
        if (rb > 255) rb = 255;
        if (ra > 255) ra = 255;
        return (ra << 24) | (rr << 16) | (rg << 8) | rb;
    }
}
