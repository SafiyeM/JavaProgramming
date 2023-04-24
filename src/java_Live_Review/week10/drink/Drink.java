package java_Live_Review.week10.drink;

public class Drink {

public String name;
public double price;
public int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return  name + " | $" +  price + " | Total quantity " + quantity ;
    }
}
/*
	Create a Drink class:
		create instance variables: name, price, quantity
		create a constructor to initialize all the variables
		create a toString to print the object in a clean format
 */