package java_programming_lessons.day31_inheritance.shape_methodOverriding;

public class Square extends Shape {  // I am not getting compiler error when I extend the shape even though it is private
                                     // because parent class' constructor will be called by default, if it is a no arg constructor


    private double side;


    public Square(double side) {  // it is calling implicitly parent class' constructor
        // super(); -> since it is calling implicitly, we do need super keyword to call parent class' constructor.
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }

    @Override
    public void draw(){

        // calling draw method from parent class and gets executed first what the parent class has in its body
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                ", side='" + side +'\'' +
                '}';
    }
}
