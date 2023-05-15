package java_programming_lessons.day37_exceptions;

import java_programming_lessons.day36_polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {




        Pizza pizza1 = new Pizza('S',2, 3);
        Pizza pizza2 = new Pizza('S',2, 3);

        System.out.println(pizza1 == pizza2); // false -> they are not the same object

        System.out.println(pizza1.equals(pizza2)); // true

        // access of all the methods and variables from reference type
        Object obj = new Pizza('S', 4, 3); // upcasting
        boolean r= obj.equals(pizza2);
        System.out.println(r); // true

        double total = ((Pizza)obj).calcCost();

        System.out.println(total); //24.0

        // Ther is no relation btw. Circle and Pizza
        //double area = ((Circle)obj).area(); // ClassCastException

        //System.out.println(area);



    }
}
