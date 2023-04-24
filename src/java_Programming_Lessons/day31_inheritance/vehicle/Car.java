package java_Programming_Lessons.day31_inheritance.vehicle;

public class Car extends Vehicle{ // There 'IS A Relationship' with parent class

    // one class can extend only one class,(child can only have one parent)
    // however it can be extended multiple time by other classes

    //Calling Parents Constructor
    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){

        System.out.println("Driving " + getBrand() + " "+ getModel());
    }


    /*
    Only a Constructor can call another constructor
    Name has to be the same with Class' name
    We have to use 'super' keyword to call parent's constructor
     */
}
/*
2. Create a subclass of Vehicle named Car

			Extra methods:
				drive()

 */