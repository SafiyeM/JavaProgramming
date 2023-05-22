package java_practice.day15_whileLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 50;
        int b = 9;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);


    }


}

/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide
    two positive numbers without using / (division) and * (multiplication) operators.

 */