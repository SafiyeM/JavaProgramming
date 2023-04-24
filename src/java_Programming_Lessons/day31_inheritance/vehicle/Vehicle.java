package java_Programming_Lessons.day31_inheritance.vehicle;

public class Vehicle {

    private String brand, model, color;
    private int year;
    private double price;


    /*
    Access modifier determines if their variables and methods will be inherited by subclass
    Private is not inherited. The only way to access, read and write the instance variables are
    through getter & setter methods

    getter: return method
    setter: void method
     */

    public Vehicle(String brand, String model, String color, int year, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);


        // the name of the Constructor has the same with the class name,
        // in order to be inheritable by child class, we set the instances by using setters.

    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
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

    public void setYear(int year) {

        this.year = year;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Warmup Tasks:
	1. Create a class named Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()
 */