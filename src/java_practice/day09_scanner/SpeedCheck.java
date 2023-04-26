package java_practice.day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        /*
        4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
	 otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

         */

        Scanner scan= new Scanner(System.in);

        int speedLimit= 55;


        System.out.println("Enter the current speed");
        int currentLimit= scan.nextInt();
        int overLimit= currentLimit - speedLimit;

        if (currentLimit > speedLimit){
            System.out.println("You are driving "+ overLimit+ " mph over the limit. Slow down!");
       }





    scan.close();
    }
}
