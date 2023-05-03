package java_practice.day30_inheritance.planetTask;

public class Moon extends Planet{


    public Moon(double volume, double mass, double surfaceGravity, double surfaceArea, int population) {
        super(volume, mass, surfaceGravity, surfaceArea, population);
    }

    public void printLunarPhase(){

        System.out.println(getName() + "'s Lunar Phases: \"New Moon\", \"Waxing Crescent\", \"First Quarter\", " +
                  "\"Waxing Gibbous\", \"Full Moon\", \"Waning Gibbous\", \"Third Quarter\", \"Waning Crescent\"");
    }



}
