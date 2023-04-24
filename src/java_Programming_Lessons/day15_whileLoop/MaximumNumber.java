package java_Programming_Lessons.day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        int max= -2147483648; //--> minimum number in Java
         //Any integer number that user enter will always be greater than -2147483648




        Scanner input= new Scanner(System.in);

        for (int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4 those numbers make the condition true but if it is 5, then it is false
            System.out.println("Enter a number"); // because we begin to count from index number 0 till 4 so there are 5 numbers as length
            int num= input.nextInt();

            if (num > max){ //if the user entered number is greater than the current max number that we have
                max= num;  // then user entered number should be the maximum number
            }
        }

        System.out.println("max = " + max);

 input.close();
    }

}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */