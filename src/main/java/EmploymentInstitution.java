public class EmploymentInstitution implements Institution {
    private InstitutionType type = InstitutionType.EMPLOYMENT;

    @Override
    public InstitutionType getType() {
        return type;
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "Employment: " + signal;

        System.out.println(message);
        return message;
    }
}
