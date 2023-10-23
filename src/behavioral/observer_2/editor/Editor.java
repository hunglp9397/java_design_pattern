package behavioral.observer_2.editor;

import behavioral.observer_2.publisher.EventManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Editor {

    public EventManager eventManager;

    private File file;

    public Editor(){

        List<String> events = new ArrayList<>();
        events.add("open");
        events.add("save");

        this.eventManager = new EventManager(events);
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            eventManager.notify("save", file);
        }else {
            throw new Exception("File not exist or must be open first");
        }
    }



}
