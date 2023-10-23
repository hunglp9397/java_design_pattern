package behavioral.observer_2;

import behavioral.observer_2.editor.Editor;
import behavioral.observer_2.listeners.LogOpenFileListener;
import behavioral.observer_2.listeners.MailListener;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenFileListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("save", new MailListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
