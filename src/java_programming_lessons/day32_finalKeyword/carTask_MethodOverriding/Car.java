package java_programming_lessons.day32_finalKeyword.carTask_MethodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;



    // we do not use constructor to initialize the static variables:  we need only one copy of it
    static {
        numberOfWheels=4;
        hasBattery=true;
    }



    // as soon as Car object created, the instance variables will be set
    // we use setter to assign the variables, because setter can check the conditions before setting
    public Car(String model, String color, int year, double price) { // String make -> we do not need it as parameter (each car can have different brand)
                                                                     // we pass the arg, if additional info is needed to set

        setMake(getClass().getSimpleName());// setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    //year can not be negative or zero
    public void setYear(int year) {

        if(year <= 0){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    //price can not be negative or zero
    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Invalid Price: " +price);
            System.exit(1);
        }
        this.price = price;
    }


    public void start(){

        System.out.println("Press the brake and twist the key to ignition to start " + make+ " " +model);
    }

    @Override
    public String toString() {  // we can also modify the static variables into toString Method
        return make+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()
 */