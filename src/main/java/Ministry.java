import com.google.common.eventbus.EventBus;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ministry {

    private final EventBus eventBus;

    public Ministry() {
        this.eventBus = EventBusFactory.getEventBus();
    }

    public void send(List<BusMessage> messages) {
        messages.forEach(eventBus::post);
    }

}
