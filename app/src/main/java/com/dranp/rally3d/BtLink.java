package com.dranp.rally3d;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connection;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

/** Implementa btspp:// (JSR-82) sobre RFCOMM de Android. Lo usa javax.microedition.io.Connector. */
@SuppressLint("MissingPermission")
public final class BtLink {
    private static final String SCHEME = "btspp://";
    private static final String SERVICE_NAME = "TowerBloxx";

    private BtLink() {}

    public static Connection open(String url) throws IOException {
        if (url == null || !url.startsWith(SCHEME)) throw new ConnectionNotFoundException(String.valueOf(url));
        String rest = url.substring(SCHEME.length());
        int semi = rest.indexOf(';');
        if (semi >= 0) rest = rest.substring(0, semi);          // authenticate/encrypt/master/name: se ignoran
        int colon = rest.indexOf(':');
        if (colon <= 0 || colon == rest.length() - 1) throw new ConnectionNotFoundException("URL btspp invalida: " + url);
        String host = rest.substring(0, colon);
        java.util.UUID uuid;
        try {
            uuid = toUuid(rest.substring(colon + 1));
        } catch (IllegalArgumentException e) {
            throw new ConnectionNotFoundException("UUID invalido: " + url);
        }
        BluetoothAdapter ad = BluetoothAdapter.getDefaultAdapter();
        try {
            if (ad == null || !ad.isEnabled()) throw new IOException("Bluetooth apagado o inexistente");
            if (host.equalsIgnoreCase("localhost")) {
                // sin emparejar: asi dos telefonos que recien se ven pueden jugar
                return new Notifier(ad.listenUsingInsecureRfcommWithServiceRecord(SERVICE_NAME, uuid));
            }
            BluetoothDevice dev = ad.getRemoteDevice(toColonAddress(host));
            ad.cancelDiscovery();   // conectar con la busqueda activa falla o es lentisimo
            BluetoothSocket s = dev.createInsecureRfcommSocketToServiceRecord(uuid);
            try {
                s.connect();
            } catch (IOException e1) {
                try { s.close(); } catch (IOException ignored) {}
                s = dev.createRfcommSocketToServiceRecord(uuid);   // reintento con enlace seguro
                try {
                    s.connect();
                } catch (IOException e2) {
                    try { s.close(); } catch (IOException ignored) {}
                    throw e2;
                }
            }
            return new Link(s);
        } catch (SecurityException e) {
            throw new IOException("falta el permiso de Bluetooth: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new ConnectionNotFoundException("direccion invalida: " + url);
        }
    }

    /** Acepta UUID de 16/32 bits, de 128 con o sin guiones. */
    static java.util.UUID toUuid(String s) {
        s = s.trim();
        if (s.length() == 36) return java.util.UUID.fromString(s);
        if (s.length() == 32) {
            return java.util.UUID.fromString(s.substring(0, 8) + "-" + s.substring(8, 12) + "-"
                    + s.substring(12, 16) + "-" + s.substring(16, 20) + "-" + s.substring(20));
        }
        if (s.length() <= 8) {
            StringBuilder b = new StringBuilder();
            for (int i = s.length(); i < 8; i++) b.append('0');
            b.append(s);
            return java.util.UUID.fromString(b + "-0000-1000-8000-00805F9B34FB");
        }
        throw new IllegalArgumentException(s);
    }

    private static String toColonAddress(String h) {
        if (h.length() == 17) return h.toUpperCase();
        if (h.length() != 12) throw new IllegalArgumentException(h);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 12; i += 2) {
            if (i > 0) b.append(':');
            b.append(h, i, i + 2);
        }
        return b.toString().toUpperCase();
    }

    // ------------------------------------------------------------------ servidor

    private static final class Notifier implements StreamConnectionNotifier {
        private final BluetoothServerSocket server;

        Notifier(BluetoothServerSocket s) { server = s; }

        @Override public StreamConnection acceptAndOpen() throws IOException {
            return new Link(server.accept());
        }

        @Override public void close() throws IOException { server.close(); }
    }

    // ------------------------------------------------------------------ enlace

    private static final class Link implements StreamConnection {
        private final BluetoothSocket socket;
        private InputStream in;
        private OutputStream out;

        Link(BluetoothSocket s) { socket = s; }

        @Override public synchronized InputStream openInputStream() throws IOException {
            if (in == null) in = new StrictEof(new java.io.BufferedInputStream(socket.getInputStream(), 1024));
            return in;
        }

        @Override public DataInputStream openDataInputStream() throws IOException {
            return new DataInputStream(openInputStream());
        }

        @Override public synchronized OutputStream openOutputStream() throws IOException {
            if (out == null) out = socket.getOutputStream();
            return out;
        }

        @Override public DataOutputStream openDataOutputStream() throws IOException {
            return new DataOutputStream(openOutputStream());
        }

        @Override public void close() throws IOException { socket.close(); }
    }

    /**
     * El juego lee byte a byte con "if (n <= -1) continue", que girara para siempre si el otro
     * lado corta. Un fin de flujo se convierte en IOException, que el juego si trata como corte.
     */
    private static final class StrictEof extends FilterInputStream {
        StrictEof(InputStream in) { super(in); }

        @Override public int read() throws IOException {
            int r = super.read();
            if (r < 0) throw new IOException("conexion cerrada");
            return r;
        }

        @Override public int read(byte[] b, int off, int len) throws IOException {
            int r = super.read(b, off, len);
            if (r < 0) throw new IOException("conexion cerrada");
            return r;
        }
    }
}
