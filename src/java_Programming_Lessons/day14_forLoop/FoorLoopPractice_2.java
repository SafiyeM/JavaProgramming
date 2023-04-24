package java_Programming_Lessons.day14_forLoop;

import java.util.Scanner;

public class FoorLoopPractice_2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int sum= 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
           sum += input.nextInt();   // to find sum of the given numbers from the scanner object
        }


        System.out.println("Sum of the numbers: " + sum);




        //Task--> write a program that can ask user to enter for five times, print the max number.
        //Task--> write a program that can ask user to enter for five times, print the min number.




























    }
}
