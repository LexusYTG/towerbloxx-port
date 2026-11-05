package javax.microedition.m3g;

public abstract class IndexBuffer {
    IndexBuffer() {}
    public abstract int getIndexCount();
    public abstract void getIndices(int[] indices);
}
