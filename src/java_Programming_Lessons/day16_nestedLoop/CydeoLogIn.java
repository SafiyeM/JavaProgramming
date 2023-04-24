package java_Programming_Lessons.day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your username:");
        String username= input.next();

        System.out.println("Enter your password");
        String password= input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {

            for (int i = 0; i < 3; i++) { // 0,1,2

              /*  if (i != 2){
                    System.err.println("Incorrect username or password, please re-enter:");
                } else {
                System.out.println("This is your last chance, please re-enter your username and password");
                {

               */

                System.err.println("Incorrect username or password, please re-enter:");
                System.out.println("Enter your username:");
                username= input.next();

                System.out.println("Enter your password");
                password= input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
                    System.out.println("You are now logged in");
                    break;
                }

            } // end of for loop

            if (! (username.equals("Cydeo") && password.equals("WoodenSpoon"))){
                System.err.println("Your account is locked, please contact with support team.");
            }


        }





input.close();
    }
}
/*
Warmup tasks:
	1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
	   assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is locked."
 */