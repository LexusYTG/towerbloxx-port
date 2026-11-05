package javax.microedition.m3g;

public class CompositingMode {
    public static final int ALPHA = 64;
    public static final int ALPHA_ADD = 65;
    public static final int MODULATE = 66;
    public static final int MODULATE_X2 = 67;
    public static final int REPLACE = 68;

    private int blending = REPLACE;
    private boolean depthTest = true, depthWrite = true, colorWrite = true, alphaWrite = true;
    private float alphaThreshold = 0f;
    private float offsetFactor = 0f, offsetUnits = 0f;

    public void setBlending(int mode) {
        if (mode < ALPHA || mode > REPLACE) throw new IllegalArgumentException();
        blending = mode;
    }
    public int getBlending() { return blending; }
    public void setDepthTestEnable(boolean e) { depthTest = e; }
    public boolean isDepthTestEnabled() { return depthTest; }
    public void setDepthWriteEnable(boolean e) { depthWrite = e; }
    public boolean isDepthWriteEnabled() { return depthWrite; }
    public void setColorWriteEnable(boolean e) { colorWrite = e; }
    public boolean isColorWriteEnabled() { return colorWrite; }
    public void setAlphaWriteEnable(boolean e) { alphaWrite = e; }
    public boolean isAlphaWriteEnabled() { return alphaWrite; }
    public void setAlphaThreshold(float t) {
        if (t < 0f || t > 1f) throw new IllegalArgumentException();
        alphaThreshold = t;
    }
    public float getAlphaThreshold() { return alphaThreshold; }
    public void setDepthOffset(float factor, float units) { offsetFactor = factor; offsetUnits = units; }
    public float getDepthOffsetFactor() { return offsetFactor; }
    public float getDepthOffsetUnits() { return offsetUnits; }
}
