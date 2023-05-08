package java_programming_lessons.day35_polymorphism.transportation;

public abstract class Car extends Transportation {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " +getMake() + " " +getModel());
    }

}
/*

	5. Create an abstract subclass of Transportation named Car

				extra methods:
					drive()
 */