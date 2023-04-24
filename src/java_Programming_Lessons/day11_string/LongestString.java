package java_Programming_Lessons.day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"

         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first string");
        String first= input.nextLine();

        System.out.println("Enter second string");
        String second= input.nextLine();

        if (first.length() > second.length()){
            System.out.println("First String is the longest");
        } else if (first.length() < second.length()) {
            System.out.println("Second String is the longest");
        } else {
            System.out.println("Equal");
        }


        // 1.1 Ask the user to enter two strings
      /*  System.out.println("Enter first string");
        String first= input.nextLine();
        System.out.println("Enter second string");
        String second= input.nextLine();


        if( first.length() > second.length()){
            System.out.println("first string is the longest");
        }else if(first.length() < second.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("Equal");
        }

       */



input.close();

    }
}
