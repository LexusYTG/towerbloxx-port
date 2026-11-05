package javax.microedition.m3g;

/** Matriz 4x4 (fila mayor), como en JSR-184. */
public class Transform {
    final float[] m = new float[16];
    private final float[] tmp = new float[16];
    private final float[] rot = new float[16];

    public Transform() { setIdentity(); }
    public Transform(Transform t) { set(t); }

    public void setIdentity() {
        for (int i = 0; i < 16; i++) m[i] = 0f;
        m[0] = 1f; m[5] = 1f; m[10] = 1f; m[15] = 1f;
    }

    public void set(Transform t) {
        if (t == null) throw new NullPointerException();
        System.arraycopy(t.m, 0, m, 0, 16);
    }

    public void set(float[] matrix) {
        if (matrix == null) throw new NullPointerException();
        if (matrix.length < 16) throw new IllegalArgumentException();
        System.arraycopy(matrix, 0, m, 0, 16);
    }

    public void get(float[] matrix) {
        if (matrix == null) throw new NullPointerException();
        if (matrix.length < 16) throw new IllegalArgumentException();
        System.arraycopy(m, 0, matrix, 0, 16);
    }

    public void invert() {
        double[][] a = new double[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) a[i][j] = m[i * 4 + j];
            a[i][4 + i] = 1.0;
        }
        for (int col = 0; col < 4; col++) {
            int piv = col;
            for (int r = col + 1; r < 4; r++) if (Math.abs(a[r][col]) > Math.abs(a[piv][col])) piv = r;
            if (Math.abs(a[piv][col]) < 1e-12) throw new ArithmeticException("matriz singular");
            double[] t = a[col]; a[col] = a[piv]; a[piv] = t;
            double d = a[col][col];
            for (int j = 0; j < 8; j++) a[col][j] /= d;
            for (int r = 0; r < 4; r++) {
                if (r == col) continue;
                double f = a[r][col];
                if (f == 0.0) continue;
                for (int j = 0; j < 8; j++) a[r][j] -= f * a[col][j];
            }
        }
        for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) m[i * 4 + j] = (float) a[i][4 + j];
    }

    public void transpose() {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                float t = m[i * 4 + j]; m[i * 4 + j] = m[j * 4 + i]; m[j * 4 + i] = t;
            }
        }
    }

    /** this = this * b */
    private void mul(float[] b) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tmp[i * 4 + j] = m[i * 4] * b[j] + m[i * 4 + 1] * b[4 + j]
                               + m[i * 4 + 2] * b[8 + j] + m[i * 4 + 3] * b[12 + j];
            }
        }
        System.arraycopy(tmp, 0, m, 0, 16);
    }

    public void postMultiply(Transform t) {
        if (t == null) throw new NullPointerException();
        mul(t.m);
    }

    public void postScale(float sx, float sy, float sz) {
        for (int r = 0; r < 4; r++) {
            m[r * 4] *= sx; m[r * 4 + 1] *= sy; m[r * 4 + 2] *= sz;
        }
    }

    public void postTranslate(float tx, float ty, float tz) {
        for (int r = 0; r < 4; r++) {
            m[r * 4 + 3] += m[r * 4] * tx + m[r * 4 + 1] * ty + m[r * 4 + 2] * tz;
        }
    }

    public void postRotate(float angle, float ax, float ay, float az) {
        float len = (float) Math.sqrt(ax * ax + ay * ay + az * az);
        if (len == 0f) {
            if (angle == 0f) return;
            throw new ArithmeticException("eje nulo");
        }
        ax /= len; ay /= len; az /= len;
        double rad = Math.toRadians(angle);
        float c = (float) Math.cos(rad), s = (float) Math.sin(rad), t = 1f - c;
        rot[0] = t * ax * ax + c;       rot[1] = t * ax * ay - s * az;  rot[2] = t * ax * az + s * ay;  rot[3] = 0f;
        rot[4] = t * ax * ay + s * az;  rot[5] = t * ay * ay + c;       rot[6] = t * ay * az - s * ax;  rot[7] = 0f;
        rot[8] = t * ax * az - s * ay;  rot[9] = t * ay * az + s * ax;  rot[10] = t * az * az + c;      rot[11] = 0f;
        rot[12] = 0f; rot[13] = 0f; rot[14] = 0f; rot[15] = 1f;
        mul(rot);
    }

    public void postRotateQuat(float qx, float qy, float qz, float qw) {
        float n = (float) Math.sqrt(qx * qx + qy * qy + qz * qz + qw * qw);
        if (n == 0f) throw new ArithmeticException("cuaternion nulo");
        qx /= n; qy /= n; qz /= n; qw /= n;
        rot[0] = 1 - 2 * (qy * qy + qz * qz); rot[1] = 2 * (qx * qy - qz * qw);     rot[2] = 2 * (qx * qz + qy * qw);     rot[3] = 0f;
        rot[4] = 2 * (qx * qy + qz * qw);     rot[5] = 1 - 2 * (qx * qx + qz * qz); rot[6] = 2 * (qy * qz - qx * qw);     rot[7] = 0f;
        rot[8] = 2 * (qx * qz - qy * qw);     rot[9] = 2 * (qy * qz + qx * qw);     rot[10] = 1 - 2 * (qx * qx + qy * qy); rot[11] = 0f;
        rot[12] = 0f; rot[13] = 0f; rot[14] = 0f; rot[15] = 1f;
        mul(rot);
    }

    /** Transforma en el lugar un arreglo de vectores de 4 componentes. */
    public void transform(float[] v) {
        if (v == null) throw new NullPointerException();
        if ((v.length & 3) != 0) throw new IllegalArgumentException();
        for (int k = 0; k + 3 < v.length; k += 4) {
            float x = v[k], y = v[k + 1], z = v[k + 2], w = v[k + 3];
            v[k]     = m[0] * x + m[1] * y + m[2] * z + m[3] * w;
            v[k + 1] = m[4] * x + m[5] * y + m[6] * z + m[7] * w;
            v[k + 2] = m[8] * x + m[9] * y + m[10] * z + m[11] * w;
            v[k + 3] = m[12] * x + m[13] * y + m[14] * z + m[15] * w;
        }
    }
}
