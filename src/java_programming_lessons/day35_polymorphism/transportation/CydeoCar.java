package java_programming_lessons.day35_polymorphism.transportation;

import java_programming_lessons.day34_abstraction.animalTask.Flyable;
import java_programming_lessons.day34_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {


    public CydeoCar(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void autoPilot() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void swim() {

    }
}
