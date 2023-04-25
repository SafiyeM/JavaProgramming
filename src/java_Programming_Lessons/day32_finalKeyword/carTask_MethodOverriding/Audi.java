package java_Programming_Lessons.day32_finalKeyword.carTask_MethodOverriding;

public class Audi extends Car {
    /*
    The Car class has a non-default constructor(constructor with arg), which means that it requires some arguments
     to be passed in order to create an instance of the class.

     That's why any child class that inherits from the Car class
      must explicitly call the constructor of the Car class
     */

    public Audi(String model, String color, int year, double price) {

        super(model, color, year, price);
    }


    @Override
    public void start() {

        System.out.println("Press the start button to start " + getMake() + " " +getModel());
    }

}

/*
. Audi
      start(): "Press the start button"
 */