package javax.microedition.m3g;

public class Image2D {
    public static final int ALPHA = 96;
    public static final int LUMINANCE = 97;
    public static final int LUMINANCE_ALPHA = 98;
    public static final int RGB = 99;
    public static final int RGBA = 100;

    private final int format;
    private final int width;
    private final int height;
    private final int[] argb;

    public Image2D(int format, Object image) {
        if (image == null) throw new NullPointerException();
        if (!(image instanceof javax.microedition.lcdui.Image)) throw new IllegalArgumentException("image");
        check(format);
        javax.microedition.lcdui.Image img = (javax.microedition.lcdui.Image) image;
        this.format = format;
        this.width = img.getWidth();
        this.height = img.getHeight();
        this.argb = new int[width * height];
        img.getRGB(argb, 0, width, 0, 0, width, height);
        for (int i = 0; i < argb.length; i++) {
            int p = argb[i];
            int a = p >>> 24, r = (p >> 16) & 255, g = (p >> 8) & 255, b = p & 255;
            switch (format) {
                case RGB: a = 255; break;
                case LUMINANCE: { int l = (r * 77 + g * 151 + b * 28) >> 8; r = l; g = l; b = l; a = 255; break; }
                case LUMINANCE_ALPHA: { int l = (r * 77 + g * 151 + b * 28) >> 8; r = l; g = l; b = l; break; }
                case ALPHA: r = 255; g = 255; b = 255; break;
                default: break;
            }
            argb[i] = (a << 24) | (r << 16) | (g << 8) | b;
        }
    }

    public Image2D(int format, int width, int height) {
        check(format);
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();
        this.format = format;
        this.width = width;
        this.height = height;
        this.argb = new int[width * height];
        java.util.Arrays.fill(argb, 0xFFFFFFFF);
    }

    private static void check(int f) {
        if (f < ALPHA || f > RGBA) throw new IllegalArgumentException("formato");
    }

    public int getFormat() { return format; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    int[] pixels() { return argb; }
}
