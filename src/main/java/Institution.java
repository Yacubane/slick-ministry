import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public abstract class Institution {
    EventBus eventBus;

    public Institution() {
        eventBus = EventBusFactory.getEventBus();
        subscribe(eventBus);
    }

    private void unsubscribe(EventBus eventBus) {
        eventBus.unregister(this);
    }

    private void subscribe(EventBus eventBus) {
        eventBus.register(this);

    }

    public void unsubscribe() {
        unsubscribe(eventBus);
    }

    public void subscribe() {
        subscribe(eventBus);
    }

    @Subscribe
    private void recordBroadcastMessage(BroadcastMessage e) {
        System.out.println(this.getClass().getName() + " got [BROADCAST] message: " + e.getMessage());

    }

}
