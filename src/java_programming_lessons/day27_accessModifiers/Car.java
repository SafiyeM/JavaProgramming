package java_programming_lessons.day27_accessModifiers;

public class Car { // outer class


    public String brand, model, color;
    public int year;
    public double price;

    public static int wheels =4;



    // inner class
    public class CarEngine {

        // This is a nested class, presented under the car class
        // In order to use this class's object, first we have to have object from car class
        // Inner class can access the members of the outer class

        public void method(){
            System.out.println(brand);
            System.out.println(wheels);
        }

    }


    public static class StaticInnerClass{  // it belongs to car class's member, not the object member
                                           // to create object from inner class, we call through the outer class's name
                                           // in JAVA only the inner class can be STATIC!

        public void method(){
           // System.out.println(brand); static only accepts static members of outer class
            System.out.println(wheels);
        }

    }



}
