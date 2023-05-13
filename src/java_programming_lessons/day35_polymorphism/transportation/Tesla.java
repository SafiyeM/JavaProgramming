package java_programming_lessons.day35_polymorphism.transportation;

public class Tesla extends Car implements AutoPilot, Electric {
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    // to implement AutoPilot is enough because AutoPark is Parent of AutoPilot, so Tesla can inherits both

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
}
/*
8. Create a subclass of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */