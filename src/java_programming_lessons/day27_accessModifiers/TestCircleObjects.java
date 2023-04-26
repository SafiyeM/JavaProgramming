package java_programming_lessons.day27_accessModifiers;

public class TestCircleObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(5);
        System.out.println(circle2);

        Circle circle3 = new Circle(7);
        System.out.println(circle3);


         /*  Calling statics through object is not preferable!

         System.out.println(circle1.pi); // we get the same value because pi is static member of the class
            System.out.println(circle2.pi);
        Even though the statics are shared by all the objects, it does not mean that we should call
        the statics through each object one by one. */

        System.out.println(Circle.pi); // true calling is through the class name, because for all objects we have one shared value


        // System.out.println(Circle.radius);  Compiler Error -> because radius belongs to the object
                                                                 // and class can not share what the object has






    }
}
