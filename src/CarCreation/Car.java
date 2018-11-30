package CarCreation;

public class Car {
    private String mark;
    private int gasTankVolume;
    public static final int fuelCons = 10;
    public static final int maxTankVolume=100;


    public void setGasVolume(int gasVolume) {
        this.gasTankVolume = gasVolume;
    }

    public static void carMove(Car car, int range){
        if (range>car.gasTankVolume*fuelCons){
            System.out.println("вы не сможете проехать такое расстояние");
            return;
        }
        System.out.println("автомобиль едет, после поездки необходимо заправить бак на " + range/fuelCons + " литров топлива");
        car.setGasVolume(car.gasTankVolume-range/fuelCons);

    }

    public static void refuelCar(Car car){
        car.setGasVolume(maxTankVolume);
    }


    public Car(String mark, int gasTankVolume) {
        this.mark = mark;
        this.gasTankVolume = gasTankVolume;
    }


//    public static void main(String[] args) {
//        Car car = new Car("bmw", 100);
//        carMove(car, 50);
//        refuelCar(car);
//        System.out.println(car.mark);
//    }



}
