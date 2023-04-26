package java_programming_lessons.day16_nestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        String u, p;
        int attempt= 3; // attempt is arranged here for 3


        do {
            System.out.println("Enter username ");
            u= input.next();

            System.out.println("Enter password");
            p= input.next();

            attempt--; // every time username and password is wrong entered, the attempt will be decreased by one

            if (attempt == 0){ // user has only 3 attemp-- from 3, 2, 1 till index number 0(excluded)
                break;
            }




        }while (  !(u.equals("Cydeo") && p.equals("WoodenSpoon")) ); // while the credentials invalid I.e. if the user give wrong u or p,
                                                                     // do-block gets executed again

        /*
        we can not check the condition in while without getting any input from user.
        We write input in "do" part of do-while loop
         */




    }
}
