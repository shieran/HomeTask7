package PlanetCreation;

import java.util.ArrayList;

public class Planet {
    private ArrayList<Ocean> oceansOfThePlanet;
    private ArrayList<Mainland> mainlandsOfThePlanet;
    private String name;

    public Planet(ArrayList<Ocean> oceansOfThePlanet, ArrayList<Mainland> mainlandsOfThePlanet, String name) {
        this.oceansOfThePlanet = oceansOfThePlanet;
        this.mainlandsOfThePlanet = mainlandsOfThePlanet;
        this.name = name;
    }



//    public static void main(String[] args) {
//
//        ArrayList<Mainland> mainlands = new ArrayList<>();
//
//        mainlands.add(new Mainland("Евразия"));
//        mainlands.add(new Mainland("Африка"));
//        mainlands.add(new Mainland("Северная Америка"));
//        mainlands.add(new Mainland("Южная Америка"));
//        mainlands.add(new Mainland("Австралия"));
//        mainlands.add(new Mainland("Антарктида"));
//
//        ArrayList<Ocean> oceans = new ArrayList<>();
//
//        oceans.add(new Ocean("Тихий"));
//        oceans.add(new Ocean("Северный ледовитый"));
//        oceans.add(new Ocean("Индийский"));
//        oceans.add(new Ocean("Антарктический"));
//        oceans.add(new Ocean("Атлантический"));
//
//        Planet planet = new Planet(oceans, mainlands, "Земля");
//
//        printNameOfThePlanet(planet);
//        printNameOfTheMainland(planet);
//        printNimberOfMainlands(planet);
//
//    }

    public static void printNameOfThePlanet(Planet planet){
        System.out.println("Название планеты: " + planet.name);
    }

    public static void printNameOfTheMainland(Planet planet){
        System.out.println("Названия материков планеты " + planet.name + ":");
        for (Mainland mainland: planet.mainlandsOfThePlanet) {
            System.out.println(mainland.getName());
        }
    }

    public static void printNimberOfMainlands(Planet planet){
        System.out.println("Количество материков планеты " + planet.name + ": " + planet.mainlandsOfThePlanet.size());
    }
}
