package javax.microedition.m3g;

/** Luz de JSR-184 (ambiente, direccional, omni, spot). Se evalua por cara en Graphics3D. */
public class Light {
    public static final int AMBIENT = 128;
    public static final int DIRECTIONAL = 129;
    public static final int OMNI = 130;
    public static final int SPOT = 131;

    private int mode = DIRECTIONAL;
    private int color = 0xFFFFFF;
    private float intensity = 1f;
    private float constAtt = 1f, linAtt = 0f, quadAtt = 0f;
    private float spotAngle = 45f, spotExponent = 0f;

    public void setMode(int m) {
        if (m < AMBIENT || m > SPOT) throw new IllegalArgumentException("mode");
        mode = m;
    }
    public int getMode() { return mode; }

    public void setColor(int rgb) { color = rgb & 0xFFFFFF; }
    public int getColor() { return color; }

    public void setIntensity(float i) { intensity = i; }
    public float getIntensity() { return intensity; }

    public void setAttenuation(float c, float l, float q) {
        if (c < 0f || l < 0f || q < 0f || (c == 0f && l == 0f && q == 0f)) throw new IllegalArgumentException("attenuation");
        constAtt = c; linAtt = l; quadAtt = q;
    }
    public float getConstantAttenuation() { return constAtt; }
    public float getLinearAttenuation() { return linAtt; }
    public float getQuadraticAttenuation() { return quadAtt; }

    public void setSpotAngle(float a) {
        if (a < 0f || a > 90f) throw new IllegalArgumentException("angle");
        spotAngle = a;
    }
    public float getSpotAngle() { return spotAngle; }

    public void setSpotExponent(float e) {
        if (e < 0f || e > 128f) throw new IllegalArgumentException("exponent");
        spotExponent = e;
    }
    public float getSpotExponent() { return spotExponent; }
}
