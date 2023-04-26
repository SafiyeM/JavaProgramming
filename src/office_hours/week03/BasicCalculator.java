package office_hours.week03;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 20, // int data type  does not hold decimal numbers
                num2 = 6;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));


    }
}
/*

T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables.
    Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
        ...

 */