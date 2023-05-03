package java_practice.day30_inheritance.planetTask;

public class Earth extends Planet {


    public Earth(double volume, double mass, double surfaceGravity, double surfaceArea, int population) {
        super(volume, mass, surfaceGravity, surfaceArea, population);
    }

    public void numberOfContinents() {

        System.out.println(getName() + " has 7 Continents");

    }

    public void printAtmosphereComposition() {

        System.out.println(getName() + "'s atmosphere is composed of about 78 percent nitrogen," +
                " 21 percent oxygen, 0.9 percent argon, and 0.1 percent other gases.");
    }

    @Override
    public void setPopulation(int population) {
        if (population <= 0) {
            System.err.println("Invalid Population");
            System.exit(1);
        } else {
            super.setPopulation(population);
        }
    }

}
