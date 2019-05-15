public class SocialWelfareInstitution implements Institution {
    private InstitutionType type = InstitutionType.SOCIAL_WELFARE;

    @Override
    public InstitutionType getType() {
        return type;
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "SocialWelfare: " + signal;

        System.out.println(message);
        return message;
    }
}
