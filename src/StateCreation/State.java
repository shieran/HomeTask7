package StateCreation;

import java.util.ArrayList;

public class State {

    private int square;
    private String name;
    private ArrayList<City> citiesOfRegion;
    private ArrayList<Region> regionsOfState;

    public State(int square, String name, ArrayList<City> citiesOfRegion, ArrayList<Region> regionsOfState) {
        this.square = square;
        this.name = name;
        this.citiesOfRegion = citiesOfRegion;
        this.regionsOfState = regionsOfState;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

//    public static void main(String[] args) {
//
//        City minsk = new City("Minsk", true);
//
//        ArrayList<City> cities = new ArrayList<>();
//        cities.add(minsk);
//
//        Region brestskaya = new Region("Брестская", "Брест");
//        Region vitebskaya = new Region("Витебская","Витебск");
//        Region gomelskaya = new Region("Гомельская", "Гомель");
//        Region grodnenskaya = new Region("Гродненская", "Гродно" );
//        Region mogilevskaya = new Region("Могилевская", "Могилев");
//        Region minskaya = new Region("Минская", "Минск");
//
//        ArrayList<Region> regions = new ArrayList<>();
//        regions.add(brestskaya);
//        regions.add(vitebskaya);
//        regions.add(gomelskaya);
//        regions.add(grodnenskaya);
//        regions.add(mogilevskaya);
//        regions.add(minskaya);
//
//        State belarus = new State(207595, "Республика Беларусь", cities, regions);
//
//        isTheCapitalPrint(cities, belarus);
//        numberOfRegions(regions);
//        printSquare(belarus);
//        printRegions(belarus);
//    }

    public static void isTheCapitalPrint(ArrayList<City> cities, State state){
        System.out.print("Столица " + state.getName()+ ": ");
        for (City city: cities) {
            if (city.isTheCapital()){
                System.out.println(city.getName());
            }
        }
    }

    public static void numberOfRegions(ArrayList<Region> regions){
        System.out.println("Количество областей: " + regions.size());
    }

    public static void printSquare(State state){
        System.out.println("Площадь " + state.getName() + " равна: " + state.getSquare());
    }

    public static void printRegions(State state){
        System.out.println("Областные центры государства " + state.getName() + ":");
        for (Region regionsOfState : state.regionsOfState) {
            System.out.println(regionsOfState.getCenter());
        }
    }
}
