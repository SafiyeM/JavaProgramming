package java_practice.day03_variables;

public class Rectangle {

    public static void main(String[] args) {


        /*
        1. Create a class named Rectangle.java
        2.Declare the following variables:
                  1.width
                  2.Length

         3. Write a program that can display the area of the rectangle

                    Hints: area= width*length
                    perimeter =  2 * (length + width)
         */

        double width = 7;
        double length = 12;

        double area = width * length;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the rectangle = " + area);
        System.out.println("The perimeter : " + perimeter);


    }


}
