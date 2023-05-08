package java_programming_lessons.day35_polymorphism.transportation;

public class Audi extends Car implements AutoPark {


    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" " +getModel()+ " has Auto Park function");
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
/*
7. Create a subclass of car named Audi that implements AutoPark
 */