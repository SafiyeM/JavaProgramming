package java_programming_lessons.day30_inheritance.phoneTask;

public class Samsung extends Phone{


    public Samsung(String model, String color, String size, double price) {
        super("Samsung", model, color, size, price);
    }



    public void freeze(){

        System.out.println(getBrand() + getModel() + " freezes a lot");
    }


}
/*
2.2 Samsung:
					Extra methods:
						freeze()

 */