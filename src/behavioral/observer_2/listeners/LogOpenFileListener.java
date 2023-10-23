package behavioral.observer_2.listeners;
import java.io.File;
import java.util.Date;

public class LogOpenFileListener implements EventListener{

    private File file;

    public LogOpenFileListener(String fileName){
        this.file = new File(fileName);
    }

    @Override
    public void update(String evenType, File file) {
        System.out.println("File : " + file + " is perform action : " + evenType + " at :" + new Date());

    }
}
