package java_Practice.day11_string;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {



        /*
        7. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

         */


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your email");
        String email= input.nextLine();

        String firstname=  email.substring(0, email.indexOf("_"));
        String lastname= email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));

        String upperCase1= firstname.toUpperCase().charAt(0) + firstname.substring(1);
        String upperCase2= lastname.toUpperCase().charAt(0) +lastname.substring(1);

        System.out.println("firstname : " +  upperCase1);
        System.out.println("lastname : " + upperCase2);
        System.out.println("domain : " + domain);











    }
}
