package java_practice.day30_inheritance.deviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int memory, int RAM, boolean hasSSD) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, memory, RAM, hasSSD);
    }
}
