package java_practice.day09_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainder = cents % 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainder + " cents");


        /* or
         int dollar = cents / 100;
         cents -= dollar * 100; // or: cents = cents - (dollar * 100)

        System.out.println(cents +" cents equal to: " + dollar + " dollars and " + cents + " cents");

         */
        scan.close();

    }
}

 /*
        5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
       */