package javax.bluetooth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;

@SuppressLint("MissingPermission")
public class RemoteDevice {
    private final String address;   // 12 hex sin dos puntos, como en JSR-82
    private final BluetoothDevice dev;

    protected RemoteDevice(String address) {
        this.address = address;
        this.dev = null;
    }

    RemoteDevice(BluetoothDevice d) {
        this.dev = d;
        this.address = d.getAddress().replace(":", "").toUpperCase();
    }

    public String getBluetoothAddress() { return address; }

    public String getFriendlyName(boolean alwaysAsk) throws java.io.IOException {
        if (dev != null) {
            try {
                String n = dev.getName();
                if (n != null && n.length() > 0) return n;
            } catch (SecurityException ignored) {
            }
        }
        return address;
    }

    public boolean isTrustedDevice() {
        try {
            return dev != null && dev.getBondState() == BluetoothDevice.BOND_BONDED;
        } catch (SecurityException e) {
            return false;
        }
    }
    public boolean isAuthenticated() { return isTrustedDevice(); }
    public boolean isEncrypted() { return false; }

    public boolean equals(Object o) {
        return o instanceof RemoteDevice && ((RemoteDevice) o).address.equals(address);
    }
    public int hashCode() { return address.hashCode(); }
}
