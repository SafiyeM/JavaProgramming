package java_programming_lessons.day36_polymorphism;

public class Square {


    private double side;


    public Square(double side) {
        this.side = side;
    }


    // Parent can reference to any child object in Polymorphism
    // Object can be a reference for square
    public boolean equals(Object obj) {

        if (!(obj instanceof Square)) {
            System.err.println("Invalid Object, Object must be square ");
            System.exit(1);
        }

        if (side == ((Square)obj).side){
            return true;
        }
            return false;
        }

    }
