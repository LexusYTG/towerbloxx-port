package javax.microedition.lcdui;

import java.util.ArrayList;

/** Formulario: lista de Items y Strings. La UI de Android lo muestra desde MainActivity. */
public class Form extends Displayable {
    private String title;
    private final ArrayList<Object> items = new ArrayList<Object>();
    private final ArrayList<Command> commands = new ArrayList<Command>();
    private CommandListener listener;

    public Form(String title) { this.title = title; }

    public int append(Item item) { items.add(item); return items.size() - 1; }
    public int append(String str) { items.add(str); return items.size() - 1; }
    public int size() { return items.size(); }
    public void deleteAll() { items.clear(); }

    /** Cada elemento es un Item o un String. */
    public ArrayList<Object> getItems() { return items; }

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }

    public void addCommand(Command c) { if (c != null && !commands.contains(c)) commands.add(c); }
    public void removeCommand(Command c) { commands.remove(c); }
    public void setCommandListener(CommandListener l) { listener = l; }

    /** Para que una UI de Android dispare un comando. */
    public void fireCommand(Command c) {
        if (listener != null) listener.commandAction(c, this);
    }
    public ArrayList<Command> getCommands() { return commands; }
}
