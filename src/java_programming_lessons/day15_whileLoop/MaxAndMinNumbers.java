package java_programming_lessons.day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        int max = -2147483648; // in order to find max number, we assign the smallest number
        int min =  2147483647; // in order to find min number, we assign the largest number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num= input.nextInt();

            if (num > max){
                max = num;
            }                // do not use if else --> two separate condition

            if (num < min){
                min = num;
            }


        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
