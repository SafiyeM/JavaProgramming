package java_practice.day04_concatenation_Practices;

public class SwapTwoVariable2 {

    public static void main(String[] args) {

        int x= 10;
        int y= 15;


        System.out.println(" before swapping: \nX = " + x + "\nY = " +y);

        x= x+y; // 10 + 15 = 25 // in this line x= 25
        y= x-y; // 25-15 = 10 // in this line y= 10
        x= x-y; // 25-10= 15 // in this line x= 15

        System.out.println(" after swapping: \nX = " + x + "\nY = " +y);
        // x= 15
        // y= 10





    }
}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

 */