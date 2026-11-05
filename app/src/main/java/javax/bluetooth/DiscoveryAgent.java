package javax.bluetooth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.dranp.rally3d.Res;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Busqueda de dispositivos con BluetoothAdapter.startDiscovery(). Las devoluciones al
 * DiscoveryListener se hacen desde un hilo propio (no el de UI), como pide JSR-82.
 * La busqueda de servicios no consulta SDP: se asume que el otro telefono tambien corre el juego
 * y se arma el registro con el UUID pedido; si no es asi, falla al conectar.
 */
@SuppressLint("MissingPermission")
public class DiscoveryAgent {
    public static final int NOT_DISCOVERABLE = 0;
    public static final int GIAC = 0x9E8B33;
    public static final int LIAC = 0x9E8B00;
    public static final int CACHED = 0x00;
    public static final int PREKNOWN = 0x01;

    private final BluetoothAdapter adapter;
    private final ExecutorService exec = Executors.newSingleThreadExecutor();
    private final AtomicInteger transIds = new AtomicInteger(1);

    private BroadcastReceiver receiver;
    private DiscoveryListener inquiryListener;
    private boolean terminated;
    private final Set<String> seen = new HashSet<String>();

    DiscoveryAgent(BluetoothAdapter a) { adapter = a; }

    public RemoteDevice[] retrieveDevices(int option) {
        if (option != PREKNOWN) return null;
        try {
            ArrayList<RemoteDevice> out = new ArrayList<RemoteDevice>();
            for (BluetoothDevice d : adapter.getBondedDevices()) out.add(new RemoteDevice(d));
            return out.isEmpty() ? null : out.toArray(new RemoteDevice[0]);
        } catch (SecurityException e) {
            return null;
        }
    }

    public synchronized boolean startInquiry(int accessCode, final DiscoveryListener listener)
            throws BluetoothStateException {
        if (listener == null) throw new NullPointerException();
        if (accessCode != GIAC && accessCode != LIAC && (accessCode < 0x9E8B00 || accessCode > 0x9E8B3F)) {
            throw new IllegalArgumentException("accessCode");
        }
        if (inquiryListener != null) throw new BluetoothStateException("ya hay una busqueda en curso");
        final Context ctx = Res.getContext();
        if (ctx == null) throw new BluetoothStateException("sin contexto");

        inquiryListener = listener;
        terminated = false;
        seen.clear();
        receiver = new BroadcastReceiver() {
            @SuppressWarnings("deprecation")
            @Override public void onReceive(Context c, Intent intent) {
                String act = intent.getAction();
                if (BluetoothDevice.ACTION_FOUND.equals(act)) {
                    final BluetoothDevice d = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    if (d == null) return;
                    final RemoteDevice rd = new RemoteDevice(d);
                    synchronized (DiscoveryAgent.this) {
                        if (!seen.add(rd.getBluetoothAddress())) return;
                    }
                    exec.execute(new Runnable() {
                        @Override public void run() {
                            try { listener.deviceDiscovered(rd, new DeviceClass(0)); } catch (Throwable ignored) {}
                        }
                    });
                } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(act)) {
                    finishInquiry(ctx);
                }
            }
        };
        IntentFilter f = new IntentFilter();
        f.addAction(BluetoothDevice.ACTION_FOUND);
        f.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        if (Build.VERSION.SDK_INT >= 33) ctx.registerReceiver(receiver, f, Context.RECEIVER_EXPORTED);
        else ctx.registerReceiver(receiver, f);

        boolean ok;
        try {
            if (adapter.isDiscovering()) adapter.cancelDiscovery();
            ok = adapter.startDiscovery();
        } catch (SecurityException e) {
            ok = false;
        }
        if (!ok) {
            cleanup(ctx);
            throw new BluetoothStateException("no se pudo iniciar la busqueda");
        }
        return true;
    }

    public synchronized boolean cancelInquiry(DiscoveryListener listener) {
        if (listener == null) throw new NullPointerException();
        if (inquiryListener != listener) return false;
        terminated = true;
        try { adapter.cancelDiscovery(); } catch (SecurityException ignored) {}
        return true;   // el broadcast DISCOVERY_FINISHED cierra la busqueda
    }

    private void finishInquiry(Context ctx) {
        final DiscoveryListener l;
        final boolean term;
        synchronized (this) {
            l = inquiryListener;
            term = terminated;
            cleanup(ctx);
        }
        if (l == null) return;
        exec.execute(new Runnable() {
            @Override public void run() {
                try {
                    l.inquiryCompleted(term ? DiscoveryListener.INQUIRY_TERMINATED : DiscoveryListener.INQUIRY_COMPLETED);
                } catch (Throwable ignored) {}
            }
        });
    }

    private void cleanup(Context ctx) {
        inquiryListener = null;
        if (receiver != null) {
            try { ctx.unregisterReceiver(receiver); } catch (IllegalArgumentException ignored) {}
            receiver = null;
        }
    }

    public int searchServices(int[] attrSet, UUID[] uuidSet, final RemoteDevice btDev, final DiscoveryListener listener)
            throws BluetoothStateException {
        if (uuidSet == null || btDev == null || listener == null) throw new NullPointerException();
        if (uuidSet.length == 0) throw new IllegalArgumentException("uuidSet vacio");
        final int id = transIds.getAndIncrement();
        final UUID uuid = uuidSet[0];
        exec.execute(new Runnable() {
            @Override public void run() {
                try {
                    listener.servicesDiscovered(id, new ServiceRecord[] { new Record(btDev, uuid) });
                    listener.serviceSearchCompleted(id, DiscoveryListener.SERVICE_SEARCH_COMPLETED);
                } catch (Throwable ignored) {}
            }
        });
        return id;
    }

    public boolean cancelServiceSearch(int transID) { return false; }

    public String selectService(UUID uuid, int security, boolean master) throws BluetoothStateException {
        return null;
    }

    private static final class Record implements ServiceRecord {
        private final RemoteDevice host;
        private final UUID uuid;

        Record(RemoteDevice h, UUID u) { host = h; uuid = u; }

        @Override public RemoteDevice getHostDevice() { return host; }

        @Override public String getConnectionURL(int requiredSecurity, boolean mustBeMaster) {
            return "btspp://" + host.getBluetoothAddress() + ":" + uuid
                    + ";authenticate=false;encrypt=false;master=" + mustBeMaster;
        }

        @Override public boolean setDeviceServiceClasses(int classes) { return false; }
    }
}
