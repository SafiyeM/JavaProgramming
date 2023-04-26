package java_programming_lessons.day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {     // Parent Class

    // we encapsulate by using 'private' in order to give more restrictions to the variables
    // but when it is private it will not be inherited.
    // However, getters and setter can be inherited, so we use them to access the variables within the subclasses (child)
    private String brand,
            model,
            color,
            size;
    private double price;


    // In this class we did not use setInfo - because Constructor is the best choice to initialize the instances
    // In Constructor, we call setter, so that tey can check if the argument is valid(because they have conditions to check)
    public Phone(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        // Constructors are not inherited, child class MUST call one of parent class' constructor(explicitly)
        // if parent has default constructor, subclass calls it implicitly
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

        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\ncolor of the phone can only be: " + Arrays.asList(colors));
            System.exit(1);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0) {
            System.err.println("Invalid Price: " + price);
            System.exit(1);
        }

        this.price = price;
    }



    public void call(long phoneNumber){

        System.out.println(getBrand() + getModel()+ " is calling " + phoneNumber);
    }

    public void  text(long phoneNumber){

        System.out.println(getModel() + " is texting to "+ phoneNumber);
    }


    // getClass() method comes from Object class -> In Java it is the parent of any class.
    // getSimpleName() gets the name of the exact class name as a String
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Warmup tasks:
	1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */