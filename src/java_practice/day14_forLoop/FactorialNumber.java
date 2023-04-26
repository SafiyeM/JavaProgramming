package java_practice.day14_forLoop;

import java.util.Scanner;

public class FactorialNumber {


    public static void main(String[] args) {
        /*

4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

         */


        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number");
        double number = input.nextDouble();

        double result= 1;
        for (int i =(int)number; i >= 1 ; i--) {
          result *= i;

           // System.out.println("i " + i + "result: " + result); --> just to see the flow of the iteration
        }

        System.out.println("result = " + result);




        input.close();

    }

}

