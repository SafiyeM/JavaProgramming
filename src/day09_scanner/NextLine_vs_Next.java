package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);


        System.out.println("Enter your age:");
        int age= input.nextInt(); // after user input age then hav to enter "Enter"

        input.nextLine(); // It takes "Enter" from previous Scanner input

        System.out.println("Enter your full name:");
       String fullName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);









     input.close();
    }
}
