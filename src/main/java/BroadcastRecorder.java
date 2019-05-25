import com.google.common.eventbus.Subscribe;

public interface BroadcastRecorder {
    @Subscribe
    default void recordBroadcastMessage(BroadcastMessage e) {
        System.out.println(this.getClass().getName() + " got [BROADCAST] message: " + e.getMessage());

    }
}
