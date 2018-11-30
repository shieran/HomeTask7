package AirplaneCreation;

public class Airplane {
    private String route;

    public Airplane(String route) {
        this.route = route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public static void fly(){
        Engine.engine.setEngineOn(true);
        System.out.println("самолёт летит");
        Chassis.chassis.setChassiesOff(true);

    }

    public static void printRoute(Airplane airplane){
        System.out.println("самолёт летит в " + airplane.route);
    }

//    public static void main(String[] args) {
//        Airplane airplane = new Airplane("Paris");
//        printRoute(airplane);
//        fly();
//    }


}
