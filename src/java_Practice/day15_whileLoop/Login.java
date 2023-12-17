package java_Practice.day15_whileLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String username= "Cydeo";
        String password= "Cydeo123";


        System.out.println("Enter your username:");
        String usernameInput= input.next();

        System.out.println("Enter your password:");
        String passwordInput= input.next();

        if (usernameInput.equals(username) && passwordInput.equals(password)){
            System.out.println("Logged in");
        }else{


            for (int i = 0; i <3 ; i--) {

                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                usernameInput = input.next();

                System.out.println("Enter your password:");
                passwordInput = input.next();

                if( ! (usernameInput.equals(username) && passwordInput.equals(password) ) ){ // after all three attempts, if the usernameInput & passwordInput are still incorrect
                    System.err.println("Your account now is locked, please contact with the support team");
                    break; //exits the loop, runs the statement after loop // return & System.exit(1) -> exits the program
                }

            } // ending loop


            
        } // ending else statement





    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct
                credentials and if all three attempts are failed, then print "Your account is locked."

 */