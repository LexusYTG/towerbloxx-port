package javax.microedition.m3g;

public class PolygonMode {
    public static final int CULL_BACK = 160;
    public static final int CULL_FRONT = 161;
    public static final int CULL_NONE = 162;
    public static final int SHADE_FLAT = 164;
    public static final int SHADE_SMOOTH = 165;
    public static final int WINDING_CCW = 168;
    public static final int WINDING_CW = 169;

    private int culling = CULL_BACK;
    private int shading = SHADE_SMOOTH;
    private int winding = WINDING_CCW;
    private boolean twoSided = false;
    private boolean localCamera = false;
    private boolean perspective = false;

    public void setCulling(int c) {
        if (c < CULL_BACK || c > CULL_NONE) throw new IllegalArgumentException();
        culling = c;
    }
    public int getCulling() { return culling; }
    public void setShading(int s) {
        if (s != SHADE_FLAT && s != SHADE_SMOOTH) throw new IllegalArgumentException();
        shading = s;
    }
    public int getShading() { return shading; }
    public void setWinding(int w) {
        if (w != WINDING_CCW && w != WINDING_CW) throw new IllegalArgumentException();
        winding = w;
    }
    public int getWinding() { return winding; }
    public void setTwoSidedLightingEnable(boolean e) { twoSided = e; }
    public boolean isTwoSidedLightingEnabled() { return twoSided; }
    public void setLocalCameraLightingEnable(boolean e) { localCamera = e; }
    public boolean isLocalCameraLightingEnabled() { return localCamera; }
    public void setPerspectiveCorrectionEnable(boolean e) { perspective = e; }
    public boolean isPerspectiveCorrectionEnabled() { return perspective; }
}
