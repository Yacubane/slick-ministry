public class SocialInsuranceInstitution implements Institution {
    private InstitutionType type = InstitutionType.SOCIAL_INSURANCE;

    @Override
    public InstitutionType getType() {
        return type;
    }

    @Override
    public String receiveSignal(String signal) {
        String message = "SocialInsurance: " + signal;

        System.out.println(message);
        return message;
    }
}
