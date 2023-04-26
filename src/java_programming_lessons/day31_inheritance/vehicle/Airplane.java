package java_programming_lessons.day31_inheritance.vehicle;

public class Airplane extends Vehicle {


    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){

        System.out.println("Flying " + getBrand() + " " + getModel());
    }
}
/*
5. Create a subclass of Vehicle named AirPlane

			Extra methods:
				fly()
 */