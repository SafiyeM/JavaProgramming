package java_practice.day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);

        int positive= 0;
        int negative= 0;


        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int number= input.nextInt();

            if (number >= 0 ){
               positive ++;
            }else {
                negative ++;
            }

        }
        System.out.println(positive + " positive and " + negative + " negative");




        // 2. Solution with while loop

      /*
        int iNum= 0;
        int positive= 0;
        int negative= 0;

        while(iNum < 5){

            System.out.println("Enter a number:");
            int number= input.nextInt();

            if (number >= 0 ){
                positive ++;
            }else {
                negative ++;
            }
              iNum++;

        }

        System.out.println("positive  and "+ positive + " negative " + negative);

       */




    }
}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number
   for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */