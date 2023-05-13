package java_programming_lessons.day36_polymorphism;

import java.util.Arrays;

public class IPhone {


    private String brand, model, color, size;
    private double price;


    public IPhone(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);

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

        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
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



    public String toString() {
        return getClass().getSimpleName()+" {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        // it is recommended to pass a pre-condition (Obj. can take any obj. as an argument)
        if (!(obj instanceof IPhone)){  // if the given object is not Iphone
            System.err.println("Invalid object, object must be Iphone");
            System.exit(1);  // terminates the program and do not check anymore if it is object or not.
        }

            if ( model.equals( ((IPhone)obj).model )){      // if the model of the Iphone is equal to the given Iphone' model

              /*  if (color.equals( (  (IPhone)obj).model )){ // if the color of the Iphone is equal to the given Iphone' color
                  return true;
                }

               */
                return true;


            }


        return false;
    }
}
