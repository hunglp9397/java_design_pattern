package behavioral.observer_2.listeners;

import java.io.File;

public interface EventListener {
    void update(String evenType, File file);
}
