package java_Programming_Lessons.day32_finalKeyword.carTask_MethodOverriding;

public class Honda extends Car {


    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    /*
    Since we want the same implementation as Car class has,
     we do not need the start() method to override

     However, if the child class needs to modify or extend
     the behavior of the inherited method, then it can override it.
     */

}

/*
   Honda
         start(): "Press the brake and twist the key to ignition"
 */