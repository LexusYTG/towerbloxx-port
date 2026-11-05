package javax.microedition.m3g;

public class Camera {
    public static final int GENERIC = 48;
    public static final int PARALLEL = 49;
    public static final int PERSPECTIVE = 50;

    private final Transform proj = new Transform();
    private int type = GENERIC;

    public void setPerspective(float fovy, float aspect, float near, float far) {
        if (fovy <= 0f || fovy >= 180f || aspect <= 0f || near <= 0f || far <= near)
            throw new IllegalArgumentException();
        float f = (float) (1.0 / Math.tan(Math.toRadians(fovy) / 2.0));
        float[] p = new float[16];
        p[0] = f / aspect;
        p[5] = f;
        p[10] = (far + near) / (near - far);
        p[11] = 2f * far * near / (near - far);
        p[14] = -1f;
        proj.set(p);
        type = PERSPECTIVE;
    }

    public void setParallel(float height, float aspect, float near, float far) {
        if (height <= 0f || aspect <= 0f || far <= near) throw new IllegalArgumentException();
        float[] p = new float[16];
        p[0] = 2f / (height * aspect);
        p[5] = 2f / height;
        p[10] = -2f / (far - near);
        p[11] = -(far + near) / (far - near);
        p[15] = 1f;
        proj.set(p);
        type = PARALLEL;
    }

    public void setGeneric(Transform t) {
        if (t == null) throw new NullPointerException();
        proj.set(t);
        type = GENERIC;
    }

    public int getProjection(Transform t) {
        if (t != null) t.set(proj);
        return type;
    }
}
