import com.google.common.eventbus.Subscribe;

public class SocialWelfareInstitution extends Institution {
    static class Message extends BusMessage {
        public Message(String message) {
            super(message);
        }
    }

    @Subscribe
    public void recordMessage(Message e) {
        System.out.println(this.getClass().getName() + " got message: " + e.getMessage());
    }
}

