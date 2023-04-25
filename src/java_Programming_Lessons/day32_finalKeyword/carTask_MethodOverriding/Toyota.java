package java_Programming_Lessons.day32_finalKeyword.carTask_MethodOverriding;

public class Toyota extends Car {


    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }



     /*
    Since we want the same implementation as Car class has,
     we do not need the start() method to override
     */



}
/*
1. Toyota
         start(): "Press the brake and twist the key to ignition"
 */