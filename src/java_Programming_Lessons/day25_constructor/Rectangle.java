package java_Programming_Lessons.day25_constructor;

public class Rectangle {



    // Attributes
    public double length, width;


    //Generate ->  Constructor -> we determine how the object should be created
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

        // we use this keyword to call instance variable from our attributes-> this.length
        //and then assign the argument to it -> this.length = length;

    }


/*
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;

    }

 */


    // Actions -behaviour
    public double area() {

        return length * width;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
