package javax.bluetooth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import com.dranp.rally3d.BtSupport;

/**
 * JSR-82 sobre el Bluetooth clasico de Android. getLocalDevice() pide (si hace falta) los
 * permisos y que se encienda el Bluetooth, y bloquea hasta que el usuario responde: lo llama
 * el hilo Bluetooth del juego, nunca el de UI.
 */
@SuppressLint("MissingPermission")
public class LocalDevice {
    private static LocalDevice instance;

    private final BluetoothAdapter adapter;
    private final DiscoveryAgent agent;

    private LocalDevice(BluetoothAdapter a) {
        adapter = a;
        agent = new DiscoveryAgent(a);
    }

    public static synchronized LocalDevice getLocalDevice() throws BluetoothStateException {
        if (BluetoothAdapter.getDefaultAdapter() == null) throw new BluetoothStateException("Sin Bluetooth");
        if (!BtSupport.ensurePermissions()) throw new BluetoothStateException("Permisos de Bluetooth denegados");
        if (!BtSupport.ensureEnabled()) throw new BluetoothStateException("Bluetooth apagado");
        if (instance == null) instance = new LocalDevice(BluetoothAdapter.getDefaultAdapter());
        return instance;
    }

    public static boolean isPowerOn() {
        try {
            BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();
            return a != null && a.isEnabled();
        } catch (SecurityException e) {
            return false;
        }
    }

    public static String getProperty(String property) {
        if ("bluetooth.api.version".equals(property)) return "1.1";
        if ("bluetooth.master.switch".equals(property)) return "true";
        if ("bluetooth.sd.attr.retrievable.max".equals(property)) return "8";
        if ("bluetooth.connected.devices.max".equals(property)) return "7";
        return null;
    }

    public DiscoveryAgent getDiscoveryAgent() { return agent; }

    public String getBluetoothAddress() {
        try {
            String a = adapter.getAddress();
            return a == null ? "000000000000" : a.replace(":", "").toUpperCase();
        } catch (SecurityException e) {
            return "000000000000";
        }
    }

    public String getFriendlyName() {
        try {
            String n = adapter.getName();
            return n == null ? "Android" : n;
        } catch (SecurityException e) {
            return "Android";
        }
    }

    public int getDiscoverable() {
        try {
            return adapter.getScanMode() == BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE
                    ? DiscoveryAgent.GIAC : DiscoveryAgent.NOT_DISCOVERABLE;
        } catch (SecurityException e) {
            return DiscoveryAgent.NOT_DISCOVERABLE;
        }
    }

    /** Android no deja cambiar la visibilidad en silencio: muestra el dialogo del sistema (2 min). */
    public boolean setDiscoverable(int mode) throws BluetoothStateException {
        if (mode == DiscoveryAgent.NOT_DISCOVERABLE) return true;
        if (mode != DiscoveryAgent.GIAC && mode != DiscoveryAgent.LIAC && (mode < 0x9E8B00 || mode > 0x9E8B3F)) {
            throw new IllegalArgumentException("modo");
        }
        if (!isPowerOn()) throw new BluetoothStateException("Bluetooth apagado");
        return BtSupport.requestDiscoverable(120);
    }
}
