package javax.microedition.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** Soporta btspp:// (Bluetooth RFCOMM, via BtLink). Cualquier otro protocolo falla. */
public class Connector {
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int READ_WRITE = 3;

    private Connector() {}

    public static Connection open(String name) throws IOException {
        return open(name, READ_WRITE, false);
    }

    public static Connection open(String name, int mode) throws IOException {
        return open(name, mode, false);
    }

    public static Connection open(String name, int mode, boolean timeouts) throws IOException {
        if (name == null) throw new IllegalArgumentException("url nula");
        if (name.startsWith("btspp://")) return com.dranp.rally3d.BtLink.open(name);
        throw new ConnectionNotFoundException("protocolo no soportado: " + name);
    }

    public static InputStream openInputStream(String name) throws IOException {
        return ((InputConnection) open(name)).openInputStream();
    }

    public static DataInputStream openDataInputStream(String name) throws IOException {
        return ((InputConnection) open(name)).openDataInputStream();
    }

    public static OutputStream openOutputStream(String name) throws IOException {
        return ((OutputConnection) open(name)).openOutputStream();
    }

    public static DataOutputStream openDataOutputStream(String name) throws IOException {
        return ((OutputConnection) open(name)).openDataOutputStream();
    }
}
