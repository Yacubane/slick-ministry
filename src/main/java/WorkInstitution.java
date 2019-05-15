public class WorkInstitution implements Institution {
    private InstitutionType type = InstitutionType.WORK;

    @Override
    public InstitutionType getType() {
        return type;
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "Work: " + signal;

        System.out.println(message);
        return message;
    }
}
