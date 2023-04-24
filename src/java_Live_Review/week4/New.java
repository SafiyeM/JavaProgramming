package java_Live_Review.week4;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {



        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW

        int underscore =  email.indexOf('_');
        int at =  email.indexOf('@');
        int dot = email.indexOf(".");

        String firstName= email.substring(0, underscore);
        String lastName= email.substring(underscore +1, at);
        String domain= email.substring(at +1, dot );

        System.out.println("First name: "+ firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + domain.substring(0,1).toUpperCase() + domain.substring(1));



    }
}
