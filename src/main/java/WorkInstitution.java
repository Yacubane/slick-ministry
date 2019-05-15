import java.util.List;

public class WorkInstitution extends Institution {
    public WorkInstitution() {
        super(List.of(InstitutionType.WORK));
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "Work: " + signal;

        System.out.println(message);
        return message;
    }
}
