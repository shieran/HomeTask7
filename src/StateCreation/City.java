package StateCreation;

public class City {
    private String name;
    private boolean isTheCapital;

    public City(String name, boolean isTheCapital) {
        this.name = name;
        this.isTheCapital = isTheCapital;
    }

    public String getName() {
        return name;
    }

    public boolean isTheCapital() {
        return isTheCapital;
    }
}
