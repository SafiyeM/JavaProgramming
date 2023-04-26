package java_practice.day28_encapsulation.circle;

public class TestCircle {


    public static void main(String[] args) {


        Circle circle = new Circle(12);

        System.out.println(circle.calcArea());

        System.out.println(circle);

        System.out.println(Circle.pi);


    }
}
