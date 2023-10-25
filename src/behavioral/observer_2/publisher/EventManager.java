package behavioral.observer_2.publisher;

import behavioral.observer_2.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Concreate Subject. Có thể đăng kí, hoặc hủy bỏ một observer khác. ngoài ra cũng sẽ chứa hàm notify thông báo tới tất cả các observer khi có 1 event nào đó
public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();


    // Init action for events
    public EventManager(List<String> operations){
        for(String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }

    }




    // Regis observer
    public void subscribe(String eventType, EventListener eventListener){
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(eventListener);
    }

    // Remove observer
    public void unsubcribe(String eventType, EventListener eventListener){
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(eventListener);
    }

    // Notify
    public void notify(String eventType, File file){
        List<EventListener> eventListeners = listeners.get(eventType);
        for(EventListener listener : eventListeners){
            listener.update(eventType, file);
        }
    }
}
