package java_practice.day30_inheritance.planetTask;

public class TestPlanetObjects {

    public static void main(String[] args) {

        Earth earth = new Earth(1.08321e+12,5.97e24, 9.81, 510072000, 780000000);

        System.out.println(earth);
        System.out.println();
        earth.numberOfContinents();
        earth.printAtmosphereComposition();
        System.out.println(earth.getMass());
       // earth.setPopulation(0); // invalid Population
        System.out.println(earth.getPopulation());


        System.out.println("__________________________________________");


        Moon moon = new Moon(2.1991148575124397e19,7342e22, 1.62,3.7935123821928865e13,0);

        moon.printLunarPhase();
        System.out.println(moon);


    }
}
