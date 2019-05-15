import java.util.List;

public abstract class Institution {
    private final List<InstitutionType> types;

    public Institution(List<InstitutionType> types) {
        this.types = types;
    }

    abstract String receiveSignal(String signal);

    public List<InstitutionType> getTypes() {
        return types;
    }


}
