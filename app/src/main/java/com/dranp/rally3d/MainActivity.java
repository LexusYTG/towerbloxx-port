package com.dranp.rally3d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.InputType;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.digitalchocolate.towerbloxx.DCDistrict;
import com.dranp.rally3d.Res;
import java.util.ArrayList;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.TextBox;
import javax.microedition.media.Manager;
import javax.microedition.midlet.MIDlet;

public class MainActivity extends Activity {
    private static final String TAG = "TowerBloxx";
    private static final long DOUBLE_BACK_MS = 400;

    // el juego tiene mucho estado static: el midlet es uno solo por proceso.
    private static DCDistrict midlet;
    private static boolean paused = false;
    private static boolean exiting = false;

    private GameView gameView;
    private long lastBackAt = 0;
    private AlertDialog textDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        current = new java.lang.ref.WeakReference<MainActivity>(this);
        Res.init(this);
        BtSupport.attach(this); Log.i("TBX", "onCreate: lanzando midlet"); new Thread(new Runnable() { public void run() { for (int k = 1; k <= 8; k++) { try { Thread.sleep(4000); } catch (InterruptedException e) { return; } for (java.util.Map.Entry<Thread, StackTraceElement[]> en : Thread.getAllStackTraces().entrySet()) { String nm = en.getKey().getName(); if (nm.startsWith("Thread-") || nm.equals("midlet-start")) { StringBuilder sb = new StringBuilder(); for (StackTraceElement el : en.getValue()) sb.append("\n    at ").append(el); Log.w("TBX", "t=" + (k * 4) + "s hilo=" + nm + sb); } } } } }, "tbx-watchdog").start();
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode =
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        }
        applyImmersive();

        MIDlet.setLifecycleListener(new MIDlet.LifecycleListener() {
            @Override public void onDestroyed() {
                exiting = true;
                runOnUiThread(new Runnable() {
                    @Override public void run() { finish(); }
                });
            }
            @Override public void onPaused() {}
            @Override public void onResumeRequested() {}
        });

        // setListener re-notifica si ya hay un Displayable actual (Activity recreada)
        Display.setListener(new Display.Listener() {
            @Override public void onSetCurrent(final Displayable d) {
                runOnUiThread(new Runnable() {
                    @Override public void run() { showDisplayable(d); }
                });
            }
        });

        if (midlet == null) {
            try {
                midlet = new DCDistrict();
                paused = false;
                new Thread(new Runnable() { public void run() { try { midlet.startApp(); } catch (Throwable t) { Log.e(TAG, "startApp failed", t); } } }, "midlet-start").start();
            } catch (Throwable t) {
                Log.e(TAG, "startApp failed", t);
            }
        }
    }

    // ------------------------------------------------------------------ diagnostico

    private static java.lang.ref.WeakReference<MainActivity> current;
    private static final java.util.HashSet<String> seenErrors = new java.util.HashSet<String>();

    /** Muestra en pantalla (y guarda en error.txt) las excepciones que el juego se traga. */
    public static void reportError(Throwable t) {
        try {
            java.io.StringWriter sw = new java.io.StringWriter();
            t.printStackTrace(new java.io.PrintWriter(sw));
            final String trace = sw.toString();
            String key = trace.length() > 400 ? trace.substring(0, 400) : trace;
            synchronized (seenErrors) {
                if (seenErrors.size() >= 4 || !seenErrors.add(key)) return;
            }
            Log.e(TAG, "ERROR DEL JUEGO", t);
            final MainActivity a = current != null ? current.get() : null;
            if (a == null) return;
            try {
                java.io.File dir = a.getExternalFilesDir(null);
                if (dir == null) dir = a.getFilesDir();
                java.io.FileWriter fw = new java.io.FileWriter(new java.io.File(dir, "error.txt"), true);
                fw.write(trace + "\n-----\n");
                fw.close();
            } catch (Throwable ignored) {}
            a.runOnUiThread(new Runnable() {
                @Override public void run() {
                    try {
                        android.widget.TextView tv = new android.widget.TextView(a);
                        tv.setText(trace);
                        tv.setTextSize(9);
                        tv.setTypeface(android.graphics.Typeface.MONOSPACE);
                        tv.setTextIsSelectable(true);
                        int pad = (int) (8 * a.getResources().getDisplayMetrics().density);
                        tv.setPadding(pad, pad, pad, pad);
                        android.widget.ScrollView sv = new android.widget.ScrollView(a);
                        sv.addView(tv);
                        new AlertDialog.Builder(a).setTitle("Error del juego").setView(sv)
                                .setPositiveButton("OK", null).show();
                    } catch (Throwable ignored) {}
                }
            });
        } catch (Throwable ignored) {}
    }

    private void showDisplayable(Displayable d) {
        if (d instanceof TextBox) {
            showTextBox((TextBox) d);
            return;
        }
        if (d instanceof Form) {
            showForm((Form) d);
            return;
        }
        dismissTextDialog();   // el juego volvio a su Canvas
        if (!(d instanceof Canvas)) return;
        if (gameView != null && gameView.getCanvas() == d) return;
        gameView = new GameView(this, (Canvas) d);
        setContentView(gameView);
        gameView.requestFocus();
    }

    // ------------------------------------------------------------------ TextBox -> teclado de Android

    /**
     * Cuando el juego muestra un TextBox (nombre del piloto) se abre un cuadro con un campo de
     * texto ya enfocado y el teclado del sistema. OK y Cancelar disparan los Command del TextBox,
     * que es lo que el juego espera para seguir.
     */
    private void showTextBox(final TextBox tb) {
        dismissTextDialog();
        if (gameView != null) gameView.releaseAll();

        Command ok = null, cancel = null;
        ArrayList<Command> cmds = tb.getCommands();
        for (int i = 0; i < cmds.size(); i++) {
            Command c = cmds.get(i);
            int t = c.getCommandType();
            if (ok == null && (t == Command.OK || t == Command.SCREEN || t == Command.ITEM)) ok = c;
            else if (cancel == null && (t == Command.CANCEL || t == Command.BACK || t == Command.EXIT || t == Command.STOP)) cancel = c;
        }
        final Command okCmd = ok, cancelCmd = cancel;
        final boolean[] done = new boolean[1];

        final EditText et = new EditText(this);
        et.setSingleLine(true);
        et.setInputType(inputTypeFor(tb.getConstraints()));
        et.setFilters(new InputFilter[] { new InputFilter.LengthFilter(tb.getMaxSize()) });
        et.setText(tb.getString());
        et.setSelection(et.getText().length());
        et.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE | android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI);

        final AlertDialog.Builder b = new AlertDialog.Builder(this);
        if (tb.getTitle() != null) b.setTitle(tb.getTitle());
        b.setView(et);
        b.setPositiveButton(okCmd != null ? okCmd.getLabel() : "OK", new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dlg, int which) {
                finishText(tb, et, okCmd, done, true);
            }
        });
        b.setNegativeButton(cancelCmd != null ? cancelCmd.getLabel() : "Cancelar", new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dlg, int which) {
                finishText(tb, et, cancelCmd, done, false);
            }
        });
        b.setOnCancelListener(new DialogInterface.OnCancelListener() {   // Back / tocar afuera
            @Override public void onCancel(DialogInterface dlg) {
                finishText(tb, et, cancelCmd, done, false);
            }
        });
        // "Hecho" en el teclado = OK
        et.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {
            @Override public boolean onEditorAction(android.widget.TextView v, int actionId, KeyEvent ev) {
                if (textDialog != null) textDialog.getButton(DialogInterface.BUTTON_POSITIVE).performClick();
                return true;
            }
        });
        textDialog = b.create();
        if (textDialog.getWindow() != null) {
            textDialog.getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE
                    | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        }
        textDialog.show();
        et.requestFocus();
        et.post(new Runnable() {
            @Override public void run() {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                if (imm != null) imm.showSoftInput(et, InputMethodManager.SHOW_IMPLICIT);
            }
        });
    }

    /**
     * Un Form del juego (por ejemplo, pedir un numero para mandar un SMS) se muestra como un
     * cuadro con sus textos y el campo de texto con el teclado de Android. Los Command del Form
     * se disparan igual que con TextBox.
     */
    private void showForm(final Form form) {
        dismissTextDialog();
        if (gameView != null) gameView.releaseAll();

        Command ok = null, cancel = null;
        ArrayList<Command> cmds = form.getCommands();
        for (int i = 0; i < cmds.size(); i++) {
            Command c = cmds.get(i);
            int t = c.getCommandType();
            if (ok == null && (t == Command.OK || t == Command.SCREEN || t == Command.ITEM)) ok = c;
            else if (cancel == null && (t == Command.CANCEL || t == Command.BACK || t == Command.EXIT || t == Command.STOP)) cancel = c;
        }
        final Command okCmd = ok, cancelCmd = cancel;
        final boolean[] done = new boolean[1];

        android.widget.LinearLayout box = new android.widget.LinearLayout(this);
        box.setOrientation(android.widget.LinearLayout.VERTICAL);
        int pad = (int) (16 * getResources().getDisplayMetrics().density);
        box.setPadding(pad, pad / 2, pad, 0);
        final ArrayList<TextField> fields = new ArrayList<TextField>();
        final ArrayList<EditText> edits = new ArrayList<EditText>();
        ArrayList<Object> items = form.getItems();
        for (int i = 0; i < items.size(); i++) {
            Object o = items.get(i);
            if (o instanceof TextField) {
                TextField tf = (TextField) o;
                if (tf.getLabel() != null) {
                    android.widget.TextView lbl = new android.widget.TextView(this);
                    lbl.setText(tf.getLabel());
                    box.addView(lbl);
                }
                EditText et = new EditText(this);
                et.setSingleLine(true);
                et.setInputType(inputTypeFor(tf.getConstraints()));
                et.setFilters(new InputFilter[] { new InputFilter.LengthFilter(tf.getMaxSize()) });
                et.setText(tf.getString());
                et.setSelection(et.getText().length());
                box.addView(et);
                fields.add(tf);
                edits.add(et);
            } else if (o instanceof String) {
                android.widget.TextView tv = new android.widget.TextView(this);
                tv.setText((String) o);
                box.addView(tv);
            }
        }

        AlertDialog.Builder b = new AlertDialog.Builder(this);
        if (form.getTitle() != null) b.setTitle(form.getTitle());
        b.setView(box);
        b.setPositiveButton(okCmd != null ? okCmd.getLabel() : "OK", new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dlg, int which) {
                finishForm(form, fields, edits, okCmd, done, true);
            }
        });
        b.setNegativeButton(cancelCmd != null ? cancelCmd.getLabel() : "Cancelar", new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dlg, int which) {
                finishForm(form, fields, edits, cancelCmd, done, false);
            }
        });
        b.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override public void onCancel(DialogInterface dlg) {
                finishForm(form, fields, edits, cancelCmd, done, false);
            }
        });
        textDialog = b.create();
        if (textDialog.getWindow() != null) {
            textDialog.getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE
                    | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        }
        textDialog.show();
        if (!edits.isEmpty()) edits.get(0).requestFocus();
    }

    private void finishForm(final Form form, ArrayList<TextField> fields, ArrayList<EditText> edits,
                            final Command cmd, boolean[] done, final boolean accept) {
        if (done[0]) return;
        done[0] = true;
        if (!edits.isEmpty()) {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (imm != null) imm.hideSoftInputFromWindow(edits.get(0).getWindowToken(), 0);
        }
        final String[] texts = new String[edits.size()];
        final TextField[] tfs = new TextField[fields.size()];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = edits.get(i).getText().toString();
            tfs[i] = fields.get(i);
        }
        // el juego espera en su propio hilo: no tocar su estado desde el de UI
        new Thread(new Runnable() {
            @Override public void run() {
                try {
                    if (accept) {
                        for (int i = 0; i < tfs.length; i++) {
                            String t = texts[i];
                            tfs[i].setString(t.length() > tfs[i].getMaxSize() ? t.substring(0, tfs[i].getMaxSize()) : t);
                        }
                    }
                    if (cmd != null) form.fireCommand(cmd);
                } catch (Throwable t) {
                    Log.e(TAG, "Form command failed", t);
                }
            }
        }, "form-result").start();
    }

    private void finishText(TextBox tb, EditText et, Command cmd, boolean[] done, boolean accept) {
        if (done[0]) return;
        done[0] = true;
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (imm != null) imm.hideSoftInputFromWindow(et.getWindowToken(), 0);
        final TextBox box = tb;
        final Command c = cmd;
        final String text = et.getText().toString();
        final boolean acc = accept;
        // el juego esta bloqueado esperando en su propio hilo: no tocar su estado desde el de UI
        new Thread(new Runnable() {
            @Override public void run() {
                try {
                    if (acc) {
                        String t = text.length() > box.getMaxSize() ? text.substring(0, box.getMaxSize()) : text;
                        box.setString(t);
                    }
                    if (c != null) box.fireCommand(c);
                } catch (Throwable t) {
                    Log.e(TAG, "TextBox command failed", t);
                }
            }
        }, "textbox-result").start();
    }

    private void dismissTextDialog() {
        AlertDialog d = textDialog;
        textDialog = null;
        if (d != null && d.isShowing()) {
            try { d.dismiss(); } catch (Exception ignored) {}
        }
    }

    private static int inputTypeFor(int constraints) {
        int base = constraints & TextBox.CONSTRAINT_MASK;
        int type;
        switch (base) {
            case TextBox.NUMERIC:
                type = InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED;
                break;
            case TextBox.DECIMAL:
                type = InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL;
                break;
            case TextBox.PHONENUMBER:
                type = InputType.TYPE_CLASS_PHONE;
                break;
            case TextBox.EMAILADDR:
                type = InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS;
                break;
            case TextBox.URL:
                type = InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_URI;
                break;
            default:
                type = InputType.TYPE_CLASS_TEXT;
                if ((constraints & TextBox.INITIAL_CAPS_SENTENCE) != 0) type |= InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
                else if ((constraints & TextBox.INITIAL_CAPS_WORD) != 0) type |= InputType.TYPE_TEXT_FLAG_CAP_WORDS;
                break;
        }
        if ((constraints & TextBox.PASSWORD) != 0) {
            if ((type & InputType.TYPE_MASK_CLASS) == InputType.TYPE_CLASS_NUMBER) type |= InputType.TYPE_NUMBER_VARIATION_PASSWORD;
            else type |= InputType.TYPE_TEXT_VARIATION_PASSWORD;
        }
        if ((constraints & TextBox.NON_PREDICTIVE) != 0 || (constraints & TextBox.SENSITIVE) != 0) {
            type |= InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        return type;
    }

    // ------------------------------------------------------------------ Bluetooth (permisos / encendido / visibilidad)

    @Override public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        BtSupport.onPermissionsResult(requestCode);
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        BtSupport.onActivityResult(requestCode, resultCode);
    }

    @Override protected void onResume() {
        super.onResume();
        applyImmersive();
        Manager.resumeAll();
        if (midlet != null && paused && !exiting) {
            paused = false;
            try {
                new Thread(new Runnable() { public void run() { try { midlet.startApp(); } catch (Throwable t) { Log.e(TAG, "startApp failed", t); } } }, "midlet-start").start();
            } catch (Throwable t) {
                Log.e(TAG, "startApp (resume) failed", t);
            }
        }
    }

    @Override protected void onPause() {
        if (gameView != null) gameView.releaseAll();
        Manager.pauseAll();
        if (midlet != null && !paused && !exiting) {
            paused = true;
            try {
                midlet.pauseApp();
            } catch (Throwable t) {
                Log.e(TAG, "pauseApp failed", t);
            }
        }
        super.onPause();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        dismissTextDialog();
        BtSupport.detach(this);
        if (isFinishing()) {
            // el estado static del juego no se puede reiniciar: se mata el proceso
            android.os.Process.killProcess(android.os.Process.myPid());
        } else {
            Display.setListener(null);
            MIDlet.setLifecycleListener(null);
            gameView = null;
        }
    }

    @Override public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) applyImmersive();
        else if (gameView != null) gameView.releaseAll();
    }

    @SuppressWarnings("deprecation")
    private void applyImmersive() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    // ------------------------------------------------------------------ salida

    private void exitGame() {
        exiting = true;
        if (midlet != null) {
            try {
                midlet.destroyApp(false);
            } catch (Throwable t) {
                Log.e(TAG, "destroyApp failed", t);
            }
        }
        finish();
    }

    /** Back = RSH (-7). Dos Back en menos de 400 ms cierran el juego. */
    private boolean handleBackDown() {
        long now = SystemClock.uptimeMillis();
        if (now - lastBackAt < DOUBLE_BACK_MS) {
            exitGame();
            return true;
        }
        lastBackAt = now;
        if (gameView != null) gameView.pressKey(GameView.K_RSH);
        return true;
    }

    @Override public void onBackPressed() {
        // solo llega por el camino de back predictivo; el camino por KeyEvent lo consume onKeyDown
        if (handleBackDown() && gameView != null) gameView.releaseKey(GameView.K_RSH);
    }

    // ------------------------------------------------------------------ teclado / gamepad

    private static int mapKey(int kc) {
        switch (kc) {
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_W:
                return GameView.K_UP;
            case KeyEvent.KEYCODE_DPAD_DOWN:
            case KeyEvent.KEYCODE_S:
                return GameView.K_DOWN;
            case KeyEvent.KEYCODE_DPAD_LEFT:
            case KeyEvent.KEYCODE_A:
                return GameView.K_LEFT;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
            case KeyEvent.KEYCODE_D:
                return GameView.K_RIGHT;
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
            case KeyEvent.KEYCODE_NUMPAD_ENTER:
            case KeyEvent.KEYCODE_BUTTON_A:
                return GameView.K_FIRE;
            case KeyEvent.KEYCODE_BUTTON_L1:
                return GameView.K_LSH;
            case KeyEvent.KEYCODE_BUTTON_R1:
            case KeyEvent.KEYCODE_BUTTON_B:
                return GameView.K_RSH;
            case KeyEvent.KEYCODE_STAR:
                return Canvas.KEY_STAR;
            case KeyEvent.KEYCODE_POUND:
                return Canvas.KEY_POUND;
            default:
                break;
        }
        if (kc >= KeyEvent.KEYCODE_0 && kc <= KeyEvent.KEYCODE_9) return Canvas.KEY_NUM0 + (kc - KeyEvent.KEYCODE_0);
        if (kc >= KeyEvent.KEYCODE_NUMPAD_0 && kc <= KeyEvent.KEYCODE_NUMPAD_9) {
            return Canvas.KEY_NUM0 + (kc - KeyEvent.KEYCODE_NUMPAD_0);
        }
        return 0;
    }

    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (event.getRepeatCount() == 0) handleBackDown();
            return true;
        }
        int k = mapKey(keyCode);
        if (k != 0 && gameView != null) {
            if (event.getRepeatCount() == 0) gameView.pressKey(k);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (gameView != null) gameView.releaseKey(GameView.K_RSH);
            return true;
        }
        int k = mapKey(keyCode);
        if (k != 0 && gameView != null) {
            gameView.releaseKey(k);
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
