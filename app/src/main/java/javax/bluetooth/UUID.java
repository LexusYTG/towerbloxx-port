package javax.bluetooth;

public class UUID {
    private final String value;

    public UUID(long uuidValue) {
        value = Long.toHexString(uuidValue).toUpperCase();
    }

    public UUID(String uuidValue, boolean shortUUID) {
        if (uuidValue == null) throw new NullPointerException();
        if (uuidValue.length() == 0) throw new IllegalArgumentException();
        value = uuidValue.toUpperCase();
    }

    public String toString() { return value; }
    public boolean equals(Object o) { return o instanceof UUID && ((UUID) o).value.equals(value); }
    public int hashCode() { return value.hashCode(); }
}
