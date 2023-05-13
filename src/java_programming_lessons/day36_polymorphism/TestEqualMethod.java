package java_programming_lessons.day36_polymorphism;

public class TestEqualMethod {


    public static void main(String[] args) {


        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 =new Circle(15);

        System.out.println(circle1 == circle2); // false-> it compares the memory allocation of the objects in heap
                                                // They are two different object

        // when we call equals method, the overridden equals method in Circle class will be executed
        System.out.println(circle1.equals(circle2));  // true

        System.out.println(circle1.equals(circle3));  // false


        System.out.println("_______________________________________________________");



        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Black", "Medium", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "White", "Medium", 900);

        System.out.println( iphone1.equals(iphone2) );



    }
}
