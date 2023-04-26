package java_programming_lessons.day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {



        Square square = new Square(5);
        System.out.println(square);

        square.draw();


        System.out.println("__________________________________________");

        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle.draw();


        System.out.println("____________________________________________");

        Rectangle rectangle = new Rectangle(12, 2);
        System.out.println(rectangle);

        rectangle.draw();


    }
}
