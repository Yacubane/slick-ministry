abstract class BusMessage {
    private final String message;

    public BusMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
