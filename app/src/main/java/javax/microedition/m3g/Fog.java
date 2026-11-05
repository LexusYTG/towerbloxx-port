package javax.microedition.m3g;

/** Niebla de JSR-184. Se aplica por pixel en Graphics3D (distancia en espacio de ojo). */
public class Fog {
    public static final int EXPONENTIAL = 80;
    public static final int LINEAR = 81;

    private int mode = LINEAR;
    private int color = 0;
    private float near = 0f, far = 1f;
    private float density = 1f;

    public void setMode(int m) {
        if (m != EXPONENTIAL && m != LINEAR) throw new IllegalArgumentException("mode");
        mode = m;
    }
    public int getMode() { return mode; }

    public void setColor(int rgb) { color = rgb & 0xFFFFFF; }
    public int getColor() { return color; }

    public void setLinear(float near, float far) { this.near = near; this.far = far; }
    public float getNearDistance() { return near; }
    public float getFarDistance() { return far; }

    public void setDensity(float d) {
        if (d < 0f) throw new IllegalArgumentException("density");
        density = d;
    }
    public float getDensity() { return density; }
}
