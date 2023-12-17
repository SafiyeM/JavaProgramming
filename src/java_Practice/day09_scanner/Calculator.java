package java_Practice.day09_scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();


        System.out.println("Enter a math operator:");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();


if (operator == '+' && operator == '-' && operator == '*' && operator =='/'){

    if (operator == '+') {
        System.out.println(number1 + number2);
    } else if (operator == '-') {
        System.out.println(number1 - number2);
    } else if (operator == '*') {
        System.out.println(number1 * number2);
    } else {
        System.out.println(number1 / number2);
    }

}else {
    System.out.println("Invalid operator");
}




/*
        switch (operator){
            case '-':
                System.out.println(number1-number2);
                break;

            case '+':
                System.out.println(number1+number2);
                break;

            case '*':
                System.out.println(number1*number2);
                break;

            case '/':
                System.out.println(number1-number2);
                break;

            default:
                System.out.println("Invalid Operator");

        }

 */



        scanner.close();
    }


}

       /*
        9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"

         */

