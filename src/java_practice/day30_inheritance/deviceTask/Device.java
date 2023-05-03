package java_practice.day30_inheritance.deviceTask;

public class Device {

    private String brand, model, color, size;
    private double price;
    private boolean hasBattery, hasPowerButton;


    public Device(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    // brand can not be null, brand can not be empty or blank
    public void setBrand(String brand) {

        if (brand == null || brand.isEmpty() || brand.isBlank()){
            System.out.println("Invalid brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    // model can not be null, model can not be empty or blank
    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            System.out.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    // price can not be zero or negative
    public void setPrice(double price) {
        if (price <= 0){
            System.out.println("Invalid price: " +price);
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public void turnOn(){
        System.out.println(brand +" "+ model +  " is turning on");
    }

    public void turnOff(){
        System.out.println(brand +" "+ model+" is turning off");
    }



    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
1. Create a class named Device
			Variables:
				brand, model, color, size, price
				hasBattery, hasPowerButton

			Encapsulate all the fields
					Conditions:
						1. brand, model can not be null (
						2. brand, model can not be empty or blank
						3. price can not be zero or negative

			Methods
				turnOn()
				turnOff()
				toString()
 */