package java_programming_lessons.day35_polymorphism.transportation;

import java_programming_lessons.day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {



    public Plane(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void land(){
        System.out.println("Plane " +getMake() + " "+ getModel() +" is landing");
    }


    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
/*
	6. Create an abstract subclass of Transportation named Plane that implements Flyable

				non-abstract method:
					land()
 */