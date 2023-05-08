package java_programming_lessons.day35_polymorphism.transportation;

public abstract class Transportation {  // This class is only for inheriting the variables and methods to the subclasses
                                        // It is not instantiated (not for creating objects)

    private final String make, model;   // initialize final in constructor
    private String color;
    private final int year;
    private double price;

    // conditions for final will be given in the constructor
    public Transportation(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    // abstract keyword is MUST in abstract class
    // but in interface no need, it is by default abstract
    public abstract void transportPeople();

    // different implementation needed for all subclasses, that's why abstract method
    public abstract void start();


    // common info for all subclasses, that's why instance method
    public void stop() {
        System.out.println("Shut off the engine");

    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Transportation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non-abstract methods:
					stop(): "Shut off the engine"
					toString()
 */