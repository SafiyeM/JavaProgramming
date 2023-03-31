package java_Programming_Lessons.day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

       //  System.out.println("".charAt(0)); --> our String is empty that's why it gives error.
        //  Index 0 is first character of a string


        /*
        3. Create a class named DigitLetterSpecialChar and write a program
            that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
         */

        System.out.println("Enter a word:");

        String str = new Scanner(System.in).nextLine(); // This means: Scanner object will be used for only one time
        // We do not give scanner close statement because this scanner is unreferenced--> not reusable


        if (str.length() >= 1){ // If the String at least one character

            char first= str.charAt(0); // the first character of string has 0 index number

            if (first >= '0' && first <= '9'){
                System.out.println("first character is digit");
            } else if (first >= 'a' && first <= 'z') {
                System.out.println("first character is lowercase letter");
            } else if (first >= 'A' && first <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else {
                System.out.println("first character is special character");
            }


        }else { // if string is empty
            System.out.println("String is empty");
        }





    }
}
