import java.util.List;

public class SocialWelfareInstitution extends Institution {
    public SocialWelfareInstitution() {
        super(List.of(InstitutionType.SOCIAL_WELFARE));
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "SocialWelfare: " + signal;

        System.out.println(message);
        return message;
    }
}
