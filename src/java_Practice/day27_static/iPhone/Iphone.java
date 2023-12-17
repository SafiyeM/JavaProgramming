package java_Practice.day27_static.iPhone;

public class Iphone {


    public String model, size, color;
    public double price;

    public static String brand, OS, madeIn, designedIn;
    public static boolean isSmartPhone;


    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        madeIn = "China";
        designedIn = "California";
        isSmartPhone = true;
    }


    //displays the operating system of the iphone
    public static void printOperatingSystem() {

        System.out.println("Iphone's Operating System is: " + OS);

    }

    public void call(long phoneNumber) {

        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {

        System.out.println(model + " is texting " + phoneNumber);
    }

    public void faceTime(long phoneNumber) {

        System.out.println(model + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email) {

        System.out.println(model + " is face timing with " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */