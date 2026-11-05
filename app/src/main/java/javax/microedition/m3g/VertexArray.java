package javax.microedition.m3g;

public class VertexArray {
    private final int count;
    private final int comps;
    private final int size;
    private final float[] data;

    public VertexArray(int numVertices, int numComponents, int componentSize) {
        if (numVertices < 1 || numVertices > 65535) throw new IllegalArgumentException("numVertices");
        if (numComponents < 2 || numComponents > 4) throw new IllegalArgumentException("numComponents");
        if (componentSize != 1 && componentSize != 2) throw new IllegalArgumentException("componentSize");
        count = numVertices;
        comps = numComponents;
        size = componentSize;
        data = new float[numVertices * numComponents];
    }

    public void set(int firstVertex, int numVertices, byte[] values) {
        if (values == null) throw new NullPointerException();
        if (size != 1) throw new IllegalStateException("el arreglo es de short");
        check(firstVertex, numVertices, values.length);
        int n = numVertices * comps, o = firstVertex * comps;
        for (int i = 0; i < n; i++) data[o + i] = values[i];
    }

    public void set(int firstVertex, int numVertices, short[] values) {
        if (values == null) throw new NullPointerException();
        if (size != 2) throw new IllegalStateException("el arreglo es de byte");
        check(firstVertex, numVertices, values.length);
        int n = numVertices * comps, o = firstVertex * comps;
        for (int i = 0; i < n; i++) data[o + i] = values[i];
    }

    private void check(int first, int num, int len) {
        if (num < 0 || first < 0 || first + num > count || len < num * comps)
            throw new IllegalArgumentException();
    }

    public int getVertexCount() { return count; }
    public int getComponentCount() { return comps; }
    public int getComponentType() { return size; }
    float[] data() { return data; }
}
