package javax.microedition.m3g;

public class VertexBuffer {
    private VertexArray positions;
    private float posScale = 1f;
    private final float[] posBias = new float[3];
    private final VertexArray[] tex = new VertexArray[2];
    private final float[] texScale = new float[] { 1f, 1f };
    private final float[][] texBias = new float[2][3];
    private VertexArray colors;
    private VertexArray normals;
    private int defaultColor = 0xFFFFFFFF;

    public void setPositions(VertexArray a, float scale, float[] bias) {
        positions = a;
        posScale = scale;
        for (int i = 0; i < 3; i++) posBias[i] = (bias != null && i < bias.length) ? bias[i] : 0f;
    }

    public void setTexCoords(int index, VertexArray a, float scale, float[] bias) {
        if (index < 0 || index >= tex.length) throw new IndexOutOfBoundsException();
        tex[index] = a;
        texScale[index] = scale;
        for (int i = 0; i < 3; i++) texBias[index][i] = (bias != null && i < bias.length) ? bias[i] : 0f;
    }

    public void setColors(VertexArray a) { colors = a; }
    public void setNormals(VertexArray a) { normals = a; }
    public void setDefaultColor(int argb) { defaultColor = argb; }
    public int getDefaultColor() { return defaultColor; }

    public int getVertexCount() { return positions == null ? 0 : positions.getVertexCount(); }
    public VertexArray getColors() { return colors; }
    public VertexArray getNormals() { return normals; }

    VertexArray positions() { return positions; }
    float getPositionScale() { return posScale; }
    float[] getPositionBias() { return posBias; }
    VertexArray texCoords(int i) { return tex[i]; }
    float getTexCoordScale(int i) { return texScale[i]; }
    float[] getTexCoordBias(int i) { return texBias[i]; }
    VertexArray colors() { return colors; }
}
