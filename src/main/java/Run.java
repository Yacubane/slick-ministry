import java.util.List;

public class Run {
    public static void main(String[] args) {
        Ministry ministry = new Ministry();

        EmploymentInstitution employmentInstitution = new EmploymentInstitution();
        SocialInsuranceInstitution socialInsuranceInstitution = new SocialInsuranceInstitution();
        SocialWelfareInstitution socialWelfareInstitution = new SocialWelfareInstitution();
        WorkInstitution workInstitution = new WorkInstitution();

        System.out.println("Ministry to all institutions");
        ministry.send(List.of(new BroadcastMessage("Ministry to all")));

        System.out.println();
        System.out.println("Ministry to all social institutions");
        ministry.send(List.of(new SocialInsuranceInstitution.Message("Ministry to social institutions"),
                new SocialWelfareInstitution.Message("Ministry to social institutions")));

        System.out.println();
        System.out.println("Ministry to work institution");
        ministry.send(List.of(new WorkInstitution.Message("Ministry to WorkInstitution")));

        System.out.println();
        System.out.println("Unsubscribing WorkInstitution");
        workInstitution.unsubscribe();

        System.out.println();
        System.out.println("Ministry to work institution again");
        ministry.send(List.of(new WorkInstitution.Message("Ministry to WorkInstitution")));

    }
}
