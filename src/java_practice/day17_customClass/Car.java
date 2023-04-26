package java_practice.day17_customClass;

public class Car {


    //Attributes:
    //			make, model, year, color, price
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;


    //setInfo(): sets all the fields of the car object
    public void setInfo(String make, String model, int year, String color, double price) {
        this.brand = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }


   // toString ->display all the information of the car object
    public String toString() {
        return "Car{" +
                "make='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }


      // Actions -> start - drive - stop
    public void start(){

        System.out.println(brand+" "+model+" has started");
    }

    public void drive(){

        System.out.println(brand + " " + model+ " is driving");
    }


    public void stop(){

        System.out.println(brand + " " + model + " has stopped");
    }


    public static void main(String[] args) {


      Car car1= new Car();
      car1.setInfo("Audi", "e-tron GT", 2023, "Metallic gray",107_800);


      Car car2= new Car();
      car2.setInfo("Mercedes Benz", "C 63", 2023,"Black", 109_000);



        System.out.println(car1);
        car1.start();
        car1.drive();
        car1.stop();

        System.out.println(car2);
        car2.start();
        car2.drive();
        car2.stop();




    }





}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement,
			 it should display all the information of the car object
			start()
 */