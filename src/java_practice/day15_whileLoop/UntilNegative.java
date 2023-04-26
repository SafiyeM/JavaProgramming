package java_practice.day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

       /* int sum = 0;

        while(true){

            System.out.println("Enter a number");
            int num = input.nextInt();

            if( num < 0){
                break;
            }
            sum += num;  // sum= sum + num;
        }


        System.out.println(sum);

        */



        int number= 0;
        int sum= 0;


        while (number >= 0){
            System.out.println("Enter a new number:");
            number= input.nextInt();


            if (number < 0) {
               break;
            }
            sum += number;



        }
        System.out.println("sum of numbers = " + sum);






        input.close();
        }

    }


/*

5. Create a class named UntilNegative and Write a program that calculates the sum of numbers
   entered by the user until user enters a negative number.

 */