package CarCreation;

public class Wheel {
    private boolean isWheelFine = true;
    public static final int NUMBER_OFWHEELS=4;

    public boolean isWheelFine() {
        return isWheelFine;
    }

    public void setWheelFine(boolean wheelFine) {
        isWheelFine = wheelFine;
    }


    public static int getNumberOfwheels() {
        return NUMBER_OFWHEELS;
    }
}
