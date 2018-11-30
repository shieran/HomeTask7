package AirplaneCreation;

public class Chassis {
    private boolean isChassiesOff;

    public Chassis(boolean isChassiesOff) {
        this.isChassiesOff = isChassiesOff;
    }

    public boolean isChassiesOff() {
        return isChassiesOff;
    }

    public void setChassiesOff(boolean chassiesOff) {
        isChassiesOff = chassiesOff;
    }

    static Chassis chassis = new Chassis(false);
}
