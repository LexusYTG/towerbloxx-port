package com.dranp.rally3d;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Puente entre el hilo Bluetooth del juego (que es bloqueante, estilo J2ME) y la Activity:
 * pide permisos, pide encender el Bluetooth y pide visibilidad. Los metodos ensure*() y
 * requestDiscoverable() bloquean al hilo que llama hasta que el usuario responde, asi que
 * NUNCA deben llamarse desde el hilo principal (en ese caso devuelven false sin hacer nada).
 */
public final class BtSupport {
    private static final int REQ_PERM = 7101, REQ_ENABLE = 7102, REQ_DISC = 7103;
    private static final long WAIT_S = 90;

    private static volatile WeakReference<Activity> activity = new WeakReference<Activity>(null);
    private static volatile CountDownLatch permLatch, enableLatch, discLatch;
    private static volatile int discResult = Activity.RESULT_CANCELED;

    private BtSupport() {}

    public static void attach(Activity a) { activity = new WeakReference<Activity>(a); }

    public static void detach(Activity a) {
        if (activity.get() == a) activity = new WeakReference<Activity>(null);
    }

    private static String[] needed() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new String[] {
                Manifest.permission.BLUETOOTH_CONNECT,
                Manifest.permission.BLUETOOTH_SCAN,
                Manifest.permission.BLUETOOTH_ADVERTISE };
        }
        // Android 6-11: la busqueda de dispositivos exige ubicacion. Antes de 6 no hay permisos en ejecucion.
        return new String[] { Manifest.permission.ACCESS_FINE_LOCATION };
    }

    public static boolean hasPermissions() {
        if (Build.VERSION.SDK_INT < 23) return true;
        Context c = Res.getContext();
        if (c == null) return false;
        for (String p : needed()) {
            if (c.checkSelfPermission(p) != PackageManager.PERMISSION_GRANTED) return false;
        }
        return true;
    }

    private static boolean onMainThread() { return Looper.myLooper() == Looper.getMainLooper(); }

    private static boolean await(CountDownLatch l) {
        try {
            return l.await(WAIT_S, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public static boolean ensurePermissions() {
        if (hasPermissions()) return true;
        final Activity a = activity.get();
        if (a == null || onMainThread() || Build.VERSION.SDK_INT < 23) return false;
        final CountDownLatch l = new CountDownLatch(1);
        permLatch = l;
        a.runOnUiThread(new Runnable() {
            @Override public void run() { a.requestPermissions(needed(), REQ_PERM); }
        });
        await(l);
        return hasPermissions();
    }

    @android.annotation.SuppressLint("MissingPermission")
    public static boolean ensureEnabled() {
        BluetoothAdapter ad = BluetoothAdapter.getDefaultAdapter();
        if (ad == null) return false;
        try {
            if (ad.isEnabled()) return true;
        } catch (SecurityException e) {
            return false;
        }
        final Activity a = activity.get();
        if (a == null || onMainThread()) return false;
        final CountDownLatch l = new CountDownLatch(1);
        enableLatch = l;
        a.runOnUiThread(new Runnable() {
            @Override public void run() {
                try {
                    a.startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE), REQ_ENABLE);
                } catch (Exception e) {
                    enableLatch.countDown();
                }
            }
        });
        await(l);
        try {
            return ad.isEnabled();
        } catch (SecurityException e) {
            return false;
        }
    }

    /** Pide al usuario que el telefono sea visible por seconds segundos. true si acepto. */
    public static boolean requestDiscoverable(final int seconds) {
        final Activity a = activity.get();
        if (a == null || onMainThread()) return false;
        final CountDownLatch l = new CountDownLatch(1);
        discLatch = l;
        discResult = Activity.RESULT_CANCELED;
        a.runOnUiThread(new Runnable() {
            @Override public void run() {
                try {
                    Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                    i.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, seconds);
                    a.startActivityForResult(i, REQ_DISC);
                } catch (Exception e) {
                    discLatch.countDown();
                }
            }
        });
        await(l);
        return discResult != Activity.RESULT_CANCELED;
    }

    // ---- la Activity reenvia sus callbacks aca ----

    public static void onPermissionsResult(int requestCode) {
        if (requestCode == REQ_PERM && permLatch != null) permLatch.countDown();
    }

    public static void onActivityResult(int requestCode, int resultCode) {
        if (requestCode == REQ_ENABLE && enableLatch != null) {
            enableLatch.countDown();
        } else if (requestCode == REQ_DISC && discLatch != null) {
            discResult = resultCode;
            discLatch.countDown();
        }
    }
}
