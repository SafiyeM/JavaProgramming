package java_Programming_Lessons.day30_inheritance.phoneTask;

public class Nokia extends Phone {


    public Nokia(String model, String color, String size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefense(){

        System.out.println(getBrand() + getModel() + " can be used for self defense");
    }



}
/*
		2.3 Nokia:
					Extra methods:
						selfDefense()


 */