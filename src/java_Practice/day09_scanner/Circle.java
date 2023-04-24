package java_Practice.day09_scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius= input.nextDouble();

        double area= 3.14 * radius * radius;
        double perimeter= 2 * 3.14 * radius;

        System.out.println("The area of the circle: " +area);
        System.out.println("The perimeter of the circle:" +perimeter);

        /* without scanner
        double radius= 5;
        double area= Math.PI * radius * radius;
        double perimeter= 2 * Math.PI * radius;

        System.out.println("Area of the circle is "+ area );
        System.out.println("Perimeter of the circle is " + perimeter);
         */



input.close();
    }
}
/*

2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */