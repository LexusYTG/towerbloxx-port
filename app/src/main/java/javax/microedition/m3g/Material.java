package javax.microedition.m3g;

/**
 * Material de JSR-184. El especular no se evalua (el rasterizador es plano por cara).
 * lightMask es una extension: bit i = la luz i-esima (orden de addLight) afecta a este material.
 */
public class Material {
    public static final int AMBIENT = 1024;
    public static final int DIFFUSE = 2048;
    public static final int EMISSIVE = 4096;
    public static final int SPECULAR = 8192;

    private int ambient = 0x333333, diffuse = 0xFFFFFF, emissive = 0x000000, specular = 0x000000;
    private float shininess = 0f;
    private boolean tracking = false;
    private int trackMask = 0;
    private int lightMask = -1;

    public void setColor(int target, int argb) {
        if ((target & (AMBIENT | DIFFUSE | EMISSIVE | SPECULAR)) == 0) throw new IllegalArgumentException("target");
        int rgb = argb & 0xFFFFFF;
        if ((target & AMBIENT) != 0) ambient = rgb;
        if ((target & DIFFUSE) != 0) diffuse = rgb;
        if ((target & EMISSIVE) != 0) emissive = rgb;
        if ((target & SPECULAR) != 0) specular = rgb;
    }

    public int getColor(int target) {
        switch (target) {
            case AMBIENT: return ambient;
            case DIFFUSE: return diffuse;
            case EMISSIVE: return emissive;
            case SPECULAR: return specular;
            default: throw new IllegalArgumentException("target");
        }
    }

    public void setShininess(float s) {
        if (s < 0f || s > 128f) throw new IllegalArgumentException("shininess");
        shininess = s;
    }
    public float getShininess() { return shininess; }

    /** Si esta activo, el color de vertice reemplaza a los componentes de mask (AMBIENT|DIFFUSE|...). */
    public void setVertexColorTrackingEnable(boolean e) { tracking = e; }
    public boolean isVertexColorTrackingEnabled() { return tracking; }

    /** Extension: que componentes sigue el color de vertice cuando el tracking esta activo. */
    public void setVertexColorTrackingMask(int mask) { trackMask = mask; }
    public int getVertexColorTrackingMask() { return trackMask; }

    public void setLightMask(int mask) { lightMask = mask; }
    public int getLightMask() { return lightMask; }
}
