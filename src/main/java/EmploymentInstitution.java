import com.google.common.eventbus.Subscribe;

public class EmploymentInstitution extends Institution {
    static class Message extends BusMessage {
        public Message(String message) {
            super(message);
        }
    }

    class EventBusRecorder implements BroadcastRecorder {
        @Subscribe
        public void recordMessage(Message e) {
            System.out.println(this.getClass().getName() + " got message: " + e.getMessage());
        }

        @Subscribe
        public void recordWorkMessage(WorkInstitution.Message e) {
            System.out.println(this.getClass().getName() + " got [WORK] message: " + e.getMessage());
        }
    }

    @Override
    BroadcastRecorder createRecorder() {
        return new EventBusRecorder();
    }

}
