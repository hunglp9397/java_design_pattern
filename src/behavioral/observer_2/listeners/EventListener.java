package behavioral.observer_2.listeners;

import java.io.File;


// Thằng này là Observer, Chứa 1 method update() các subject con khi có sự thay đổi trạng thái
public interface EventListener {
    void update(String evenType, File file);
}
