package javax.microedition.m3g;

public class Background {
    private int color = 0x00000000;
    private boolean colorClear = true;
    private boolean depthClear = true;

    public void setColor(int argb) { color = argb; }
    public int getColor() { return color; }
    public void setColorClearEnable(boolean e) { colorClear = e; }
    public boolean isColorClearEnabled() { return colorClear; }
    public void setDepthClearEnable(boolean e) { depthClear = e; }
    public boolean isDepthClearEnabled() { return depthClear; }
}
