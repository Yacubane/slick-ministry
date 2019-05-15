import java.util.List;

public class Run {
    public static void main(String[] args) {
        Ministry ministry = new Ministry();

        EmploymentInstitution i1 = new EmploymentInstitution();
        SocialInsuranceInstitution i2 = new SocialInsuranceInstitution();
        SocialWelfareInstitution i3 = new SocialWelfareInstitution();
        WorkInstitution i4 = new WorkInstitution();

        for (Institution institution : List.of(i1, i2, i3, i4)) {
            ministry.addInstitution(institution);
        }

        System.out.println();
        ministry.sendToAll("Message to all institutions");

        System.out.println();
        ministry.sendTo(List.of(InstitutionType.SOCIAL_WELFARE, InstitutionType.SOCIAL_INSURANCE), "Message to social" +
                " institutions");

        ministry.removeInstitution(i4);

        System.out.println();
        ministry.sendToAll("Again, message to all institutions");

        System.out.println();
        ministry.sendTo(List.of(InstitutionType.EMPLOYMENT, InstitutionType.WORK), "Message to employment and work " +
                "institutions");
    }
}
