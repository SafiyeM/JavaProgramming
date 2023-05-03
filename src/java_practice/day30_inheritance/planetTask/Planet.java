package java_practice.day30_inheritance.planetTask;

public class Planet {

    private String name;
    private double volume, mass,
    surfaceGravity, surfaceArea;;
    private long population;

    public Planet(double volume, double mass, double surfaceGravity, double surfaceArea, int population) {
        this.name = getClass().getSimpleName();
        setVolume(volume);
        setMass(mass);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

 */