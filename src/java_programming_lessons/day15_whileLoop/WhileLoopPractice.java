package java_programming_lessons.day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age:");

        int age= input.nextInt();


        while (!(age >=1 && age <= 150)){                                         // while the age invalid --> if condition in the parenthesis is not true,
            System.out.println("Invalid entry! Please re-enter your age:");      // the while-loop executes over and over
            age =input.nextInt();                                                // until the user gives a valid age
        }

        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not eligible to buy alcohol");
        }



input.close();
    }
}
