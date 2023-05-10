package java_live_review.week13.building;

public abstract class Building {

    String location;
    double price;

    public abstract void pay();

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
- Create an abstract class Building

		create instance variables:
			String location
			double price

		create abstract methods:
			void pay()

		create a constructor to assign the location & price

		override the toString to print the location & price
 */