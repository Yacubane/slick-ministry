import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ministry {
    private List<Institution> institutions = new LinkedList<>();

    public void sendToAll(String signal) {
        for (Institution unit : institutions) {
            unit.receiveSignal(signal);
        }
    }

    public void sendTo(List<InstitutionType> types, String signal) {
        for (Institution unit : institutions) {
            if (!Collections.disjoint(types, unit.getTypes())) {
                unit.receiveSignal(signal);
            }
        }
    }

    public void addInstitution(Institution institution) {
        institutions.add(institution);
    }

    public void removeInstitution(Institution institution) {
        institutions.remove(institution);
    }
}
