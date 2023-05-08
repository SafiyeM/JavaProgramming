package java_programming_lessons.day35_polymorphism.transportation;

public class Tesla implements AutoPilot, Electric {

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
}
/*
8. Create a subclass of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */