package javax.microedition.lcdui;

import java.util.ArrayList;

/**
 * Caja de texto. Por ahora solo guarda el estado: todavia no hay una UI de Android
 * conectada para editarla (falta mostrarla desde Display.setCurrent).
 */
public class TextBox extends Displayable {
    public static final int ANY = 0;
    public static final int EMAILADDR = 1;
    public static final int NUMERIC = 2;
    public static final int PHONENUMBER = 3;
    public static final int URL = 4;
    public static final int DECIMAL = 5;
    public static final int PASSWORD = 0x10000;
    public static final int UNEDITABLE = 0x20000;
    public static final int SENSITIVE = 0x40000;
    public static final int NON_PREDICTIVE = 0x80000;
    public static final int INITIAL_CAPS_WORD = 0x100000;
    public static final int INITIAL_CAPS_SENTENCE = 0x200000;
    public static final int CONSTRAINT_MASK = 0xFFFF;

    private String title;
    private StringBuilder text = new StringBuilder();
    private int maxSize;
    private int constraints;
    private final ArrayList<Command> commands = new ArrayList<Command>();
    private CommandListener listener;

    public TextBox(String title, String text, int maxSize, int constraints) {
        if (maxSize <= 0) throw new IllegalArgumentException("maxSize");
        this.title = title;
        this.maxSize = maxSize;
        this.constraints = constraints;
        setString(text);
    }

    public String getString() { return text.toString(); }

    public void setString(String s) {
        text.setLength(0);
        if (s != null) {
            if (s.length() > maxSize) throw new IllegalArgumentException("texto mas largo que maxSize");
            text.append(s);
        }
    }

    public int size() { return text.length(); }
    public int getMaxSize() { return maxSize; }

    public int setMaxSize(int m) {
        if (m <= 0) throw new IllegalArgumentException();
        maxSize = m;
        if (text.length() > m) text.setLength(m);
        return maxSize;
    }

    public int getChars(char[] data) {
        int n = text.length();
        if (data.length < n) throw new ArrayIndexOutOfBoundsException();
        text.getChars(0, n, data, 0);
        return n;
    }

    public void setChars(char[] data, int offset, int length) {
        text.setLength(0);
        if (data != null) text.append(data, offset, length);
    }

    public void insert(String src, int position) {
        if (position < 0) position = 0;
        if (position > text.length()) position = text.length();
        if (text.length() + src.length() > maxSize) throw new IllegalArgumentException("excede maxSize");
        text.insert(position, src);
    }

    public void delete(int offset, int length) { text.delete(offset, offset + length); }
    public int getCaretPosition() { return text.length(); }
    public int getConstraints() { return constraints; }
    public void setConstraints(int c) { constraints = c; }

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }

    public void addCommand(Command c) { if (c != null && !commands.contains(c)) commands.add(c); }
    public void removeCommand(Command c) { commands.remove(c); }
    public void setCommandListener(CommandListener l) { listener = l; }

    /** Para que Display (o una UI de Android) dispare un comando. */
    public void fireCommand(Command c) {
        if (listener != null) listener.commandAction(c, this);
    }
    public ArrayList<Command> getCommands() { return commands; }
}
