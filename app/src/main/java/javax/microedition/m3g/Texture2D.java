package javax.microedition.m3g;

public class Texture2D {
    public static final int FILTER_BASE_LEVEL = 208;
    public static final int FILTER_LINEAR = 209;
    public static final int FILTER_NEAREST = 210;
    public static final int FUNC_ADD = 224;
    public static final int FUNC_BLEND = 225;
    public static final int FUNC_DECAL = 226;
    public static final int FUNC_MODULATE = 227;
    public static final int FUNC_REPLACE = 228;
    public static final int WRAP_CLAMP = 240;
    public static final int WRAP_REPEAT = 241;

    private Image2D image;
    private int blending = FUNC_MODULATE;
    private int wrapS = WRAP_REPEAT, wrapT = WRAP_REPEAT;
    private int levelFilter = FILTER_BASE_LEVEL, imageFilter = FILTER_NEAREST;
    private int blendColor = 0;

    public Texture2D(Image2D image) { setImage(image); }

    public void setImage(Image2D image) {
        if (image == null) throw new NullPointerException();
        this.image = image;
    }
    public Image2D getImage() { return image; }

    public void setBlending(int func) {
        if (func < FUNC_ADD || func > FUNC_REPLACE) throw new IllegalArgumentException();
        blending = func;
    }
    public int getBlending() { return blending; }

    public void setBlendColor(int rgb) { blendColor = rgb & 0xFFFFFF; }
    public int getBlendColor() { return blendColor; }

    public void setWrapping(int s, int t) {
        if ((s != WRAP_CLAMP && s != WRAP_REPEAT) || (t != WRAP_CLAMP && t != WRAP_REPEAT))
            throw new IllegalArgumentException();
        wrapS = s; wrapT = t;
    }
    public int getWrappingS() { return wrapS; }
    public int getWrappingT() { return wrapT; }

    public void setFiltering(int level, int img) { levelFilter = level; imageFilter = img; }
    public int getLevelFilter() { return levelFilter; }
    public int getImageFilter() { return imageFilter; }
}
