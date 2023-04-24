package java_Programming_Lessons.day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {


/*
1. Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School
 */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName= input.nextLine().trim().replace(" ", "");
   // trim--> to take out white spaces at the beginning or end of the string
   // replace--> it takes all the spaces in the name Sa fi y e --> Safiye

        System.out.println("Enter your last name: ");
        String lastName= input.nextLine().trim().replace(" ", "");


       // String firstName ="cyDEo";
        //String lastName= "SCHOOL";

        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); // we do not need to give endIndex
        //getting first character of first name           +  the remaining characters of the first name
        // we find first character of the String from the index 0 till 1 (but 1 excluded)

        lastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName= firstName + " " + lastName;

        System.out.println("full name = " + fullName); // Cydeo School









input.close();

    }
}
