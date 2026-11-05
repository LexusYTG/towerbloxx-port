package com.nokia.mid.ui;

import javax.microedition.lcdui.Canvas;

/** Canvas a pantalla completa de la Nokia UI API (sin barra de titulo ni comandos). */
public abstract class FullCanvas extends Canvas {
    public static final int KEY_UP_ARROW = -1;
    public static final int KEY_DOWN_ARROW = -2;
    public static final int KEY_LEFT_ARROW = -3;
    public static final int KEY_RIGHT_ARROW = -4;
    public static final int KEY_SOFTKEY3 = -5;
    public static final int KEY_SOFTKEY1 = -6;
    public static final int KEY_SOFTKEY2 = -7;
    public static final int KEY_SEND = -10;
    public static final int KEY_END = -11;

    protected FullCanvas() {
        super();
        setFullScreenMode(true);
    }
}
