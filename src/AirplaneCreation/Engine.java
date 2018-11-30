package AirplaneCreation;

public class Engine {
    private boolean isEngineOn;

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public Engine(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    static Engine engine = new Engine(false);
}
