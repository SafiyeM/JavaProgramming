package java_practice.day29_inheritance.carTask;

public class Car {

    private String make, model, color;
    private int year;
    private double price;



    public void setInfo(String make, String model, String color, int year, double price){
        setMake(make);
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

    //year can not be zero or negative
    public void setYear(int year) {
        if (year <= 0){
            System.err.println("Invalid Year: " + year);
            return;
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    //price can not be zero or negative
    public void setPrice(double price) {

        if (price <= 0){
            System.out.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

						Methods:
					setInfo(): sets the make to all car models and rest of the fields will be set based on the given arguments
					toString(): prints given object info when the object is passed in the print statement

 */