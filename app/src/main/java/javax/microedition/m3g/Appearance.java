package javax.microedition.m3g;

public class Appearance {
    private CompositingMode compositing;
    private PolygonMode polygon;
    private Fog fog;
    private Material material;
    private final Texture2D[] textures = new Texture2D[2];

    public void setCompositingMode(CompositingMode m) { compositing = m; }
    public CompositingMode getCompositingMode() { return compositing; }
    public void setPolygonMode(PolygonMode m) { polygon = m; }
    public PolygonMode getPolygonMode() { return polygon; }
    public void setFog(Fog f) { fog = f; }
    public Fog getFog() { return fog; }
    public void setMaterial(Material m) { material = m; }
    public Material getMaterial() { return material; }

    public void setTexture(int unit, Texture2D t) {
        if (unit < 0 || unit >= textures.length) throw new IndexOutOfBoundsException();
        textures[unit] = t;
    }
    public Texture2D getTexture(int unit) {
        if (unit < 0 || unit >= textures.length) throw new IndexOutOfBoundsException();
        return textures[unit];
    }
}
