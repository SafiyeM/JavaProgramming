package java_programming_lessons.day34_abstraction.carTask;

public abstract class Car { // ABSTRACT class can NOT BE FINAL (meant to be a parent)
    // FINAL prevents Inheritance (prevents being a parent)
    // can not be instantiated: NO OBJECT CREATION FROM ABSTRACT CLASS

    // BENEFIT : Parent class ignore the details and focuses on only essential properties
    // see more info about abstract on day33 ClassNotes

    // Parent class has a GENERIC name like Car, Animal, Phone, etc., NOT a SPECIFIC name like Audi, Mercedes, Cow, Cat, Iphone, Samsung


    //it gives compile error when we use a final keyword - because they do not have default value, must be initialized before it is being used
    // that's why, we use constructor in order to initialize final variable
    private final String make, model; // FINAL can be initialized only one time - After initialization becomes unchangeable
    private String color;
    private final int year;
    private double price;

    // we need to set variable if it does not have setter
    public Car(String model, String color, int year, double price) {  // we do not need argument make
        this.make = getClass().getSimpleName();  // make will be set the make of the class we create
        this.model = model;
        setColor(color);

        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
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
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    /*
    When we have a setter, we should use setter to check if the price is valid by giving a condition in its body.
    If we set in constructor's body, it means that we are able to check only in constructor if the price is valid
    If we want to change the price after object is being created, we need to call the setter,
    if we do not give the condition in setter in parent class then we can not be able to check the price if it is valid or not


     */


    protected final void stop() {  // to make sure that non-subclasses outside the package can not access it
        System.out.println("Press the brake to stop " + make + " " + model );
    }

    public abstract void start();


    @Override
    public String toString() {
        return make + ":" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price;
    }
}
/*
warmup tasks:
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

 */