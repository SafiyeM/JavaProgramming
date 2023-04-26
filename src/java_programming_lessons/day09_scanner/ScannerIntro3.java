package java_programming_lessons.day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a character");
        char ch= input.next().charAt(0);

        System.out.println("You have entered: " +ch);

        System.out.println("Would you like to continue?");
        String answer= input.next();   // It returns only until space
        //String answer= input.nextLine(); // It returns entire Line --> It causes an issue if we use with other methods

        System.out.println("You have entered : "+answer);


 input.close();
    }
}
