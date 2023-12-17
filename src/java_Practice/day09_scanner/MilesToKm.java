package java_Practice.day09_scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles= scan.nextDouble();

        double kilometers= miles * 1.609;

        System.out.println(miles+ " miles equal to " +kilometers+ " kilometers");




        scan.close();
    }
}
 /*

6. Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */
