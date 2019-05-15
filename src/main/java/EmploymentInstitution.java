import java.util.List;

public class EmploymentInstitution extends Institution {
    public EmploymentInstitution() {
        super(List.of(InstitutionType.EMPLOYMENT, InstitutionType.SOCIAL_INSURANCE));
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "Employment: " + signal;

        System.out.println(message);
        return message;
    }
}
