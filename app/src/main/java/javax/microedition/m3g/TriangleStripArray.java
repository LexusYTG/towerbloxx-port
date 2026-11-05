package javax.microedition.m3g;

public class TriangleStripArray extends IndexBuffer {
    private final int[] indices;
    private final int[] strips;

    public TriangleStripArray(int[] indices, int[] stripLengths) {
        if (indices == null || stripLengths == null) throw new NullPointerException();
        int total = sum(stripLengths);
        if (total > indices.length) throw new IllegalArgumentException("indices insuficientes");
        this.indices = new int[total];
        System.arraycopy(indices, 0, this.indices, 0, total);
        this.strips = new int[stripLengths.length];
        System.arraycopy(stripLengths, 0, this.strips, 0, stripLengths.length);
    }

    public TriangleStripArray(int firstIndex, int[] stripLengths) {
        if (stripLengths == null) throw new NullPointerException();
        int total = sum(stripLengths);
        this.indices = new int[total];
        for (int i = 0; i < total; i++) this.indices[i] = firstIndex + i;
        this.strips = new int[stripLengths.length];
        System.arraycopy(stripLengths, 0, this.strips, 0, stripLengths.length);
    }

    private static int sum(int[] lens) {
        if (lens.length < 1) throw new IllegalArgumentException();
        int t = 0;
        for (int i = 0; i < lens.length; i++) {
            if (lens[i] < 3) throw new IllegalArgumentException("tira con menos de 3 indices");
            t += lens[i];
        }
        return t;
    }

    public int getIndexCount() { return indices.length; }

    public void getIndices(int[] out) {
        if (out == null) throw new NullPointerException();
        if (out.length < indices.length) throw new IllegalArgumentException();
        System.arraycopy(indices, 0, out, 0, indices.length);
    }

    int[] indexArray() { return indices; }
    int[] stripArray() { return strips; }
}
