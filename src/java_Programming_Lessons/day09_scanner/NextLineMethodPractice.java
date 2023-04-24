package java_Programming_Lessons.day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); //EnterEnter

        System.out.println("Enter your full name:"); // Name Last name + Enter
        String full_name= input.nextLine(); //After nextLine method,
                                           // we can use another nextLine method, it causes no issue
                                           // no need additional method

        System.out.println("Enter your school name:"); //School name+ Enter
        String school_name= input.nextLine();

        System.out.println("Enter your gender:"); // female
        String gender= input.next();


        System.out.println("Enter your age:"); // 40
        int age= input.nextInt(); //

        input.nextLine(); //additional nextLine Scanner method to avoid an issue
                          // this clears out the scanner if any "Enter" left

        System.out.println("Enter your street name:"); // street name
        String street_name= input.nextLine();// if we are using nextLine method after
                    // other methods of Scanner, we must provide other additional nextLine method before that




    }
}
