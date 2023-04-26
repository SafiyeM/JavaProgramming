package java_programming_lessons.day11_string;

import java.util.Scanner;



public class Login {
    public static void main(String[] args) {

        /*
        2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
         */

        String correctUsername= "Cydeo",  // literal --> stored in the String pool
                correctPassword= "WoodenSpoon"; // literal --> stored in the String pool

        Scanner input= new Scanner(System.in);


        System.out.println("Enter your username:");
        String username= input.nextLine();  // because we created new object for username
                                            // --> stored in the heap memory outside the pool as a new object
        System.out.println("Enter your password");
        String password= input.nextLine(); // new --> the same    ----""-----

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        } else{
            System.out.println("Incorrect username or password. Please try again");
        }





    }
}
