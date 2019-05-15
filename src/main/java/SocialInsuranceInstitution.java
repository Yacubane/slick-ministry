import java.util.List;

public class SocialInsuranceInstitution extends Institution {
    public SocialInsuranceInstitution() {
        super(List.of(InstitutionType.SOCIAL_INSURANCE));
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "SocialInsurance: " + signal;

        System.out.println(message);
        return message;
    }
}
