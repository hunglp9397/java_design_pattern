package behavioral.observer_2.listeners;

import java.io.File;
import java.util.Date;

public class MailListener implements EventListener {

    private String email;

    public MailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String evenType, File file) {
        System.out.println("Sent mail to " + email + ". Some one has performed " + evenType + " on file : " + file + " at:" + new Date());
    }
}
