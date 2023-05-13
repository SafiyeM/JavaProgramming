package java_programming_lessons.day36_polymorphism;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


    //This .equals() method is inherited from object class
    // We use this method to compare with one circle object to another
    public boolean equals(Object obj) {
      //  return super.equals(obj); -> comes from super class -> we do not need it in this class


        //in order to make sure that this Object is Circle, we create if condition
        if ( !(obj instanceof Circle) ){  // if the specified object is not circle, then we should not compare them
            System.err.println("Invalid object");   // by giving error message and terminating the program
            System.exit(1);
        }


        // This casting should only be done, once we make sure that
        // it is the object that we are looking for.
        // we can use this.radius keyword
        if (this.radius == ((Circle) obj).radius){  // if the current circle radius is equal to the given circle's radius,
          return  true;                             // then two circles are equal
                                                    // in order to call object type' members, we need to down casting
        }
        return false;
    }
}
