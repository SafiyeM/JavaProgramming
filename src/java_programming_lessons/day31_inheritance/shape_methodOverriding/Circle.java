package java_programming_lessons.day31_inheritance.shape_methodOverriding;

public class Circle extends Shape {



    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){

        return  radius * radius * 3.14;
    }

    public double perimeter(){

        return 2 * radius * 3.14;   // 6.28 * radius;
    }

    public void draw(){

        super.draw();

        System.out.println("          *          *          ");
        System.out.println("       *                *       ");
        System.out.println("     *                    *     ");
        System.out.println("    *                      *    ");
        System.out.println("    *                      *    ");
        System.out.println("    *                      *    ");
        System.out.println("     *                    *     ");
        System.out.println("       *                *       ");
        System.out.println("          *          *          ");

    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius +'\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';


}
}