package java_programming_lessons.day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //maximum number in Java --> 2147483647

        int min = 2147483647; // this is temporary value --> it will be gone after first execution of the loop
        // then this min number is replaced the number the user entered (if the condition
        // num < min is true) So first entry number will be compared with the remaining numbers!
        // //Any integer number that user enter will always be greater than -2147483648

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num < min) {  //if the user's entered entry is less than the current min number that we have
                min = num;    //// then user entered number should be the minimum number
            }

        }

        System.out.println("Minimum number is: " + min);

        input.close();

    }
}
/*
 Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */