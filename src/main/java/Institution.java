import com.google.common.eventbus.EventBus;

public abstract class Institution {
    private Object recorder;
    EventBus eventBus;

    public Institution() {
        eventBus = EventBusFactory.getEventBus();
        subscribe(eventBus);
    }

    private void unsubscribe(EventBus eventBus) {
        eventBus.unregister(recorder);
    }

    private void subscribe(EventBus eventBus) {
        recorder = createRecorder();
        eventBus.register(recorder);

    }

    public void unsubscribe() {
        unsubscribe(eventBus);
    }

    public void subscribe() {
        subscribe(eventBus);
    }

    abstract BroadcastRecorder createRecorder();

}
