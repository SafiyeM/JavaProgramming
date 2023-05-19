package java_programming_lessons.day38_exceptions;

import java_programming_lessons.utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        // the ideal place to use throws keyword is within the main method's signature
        // because most of the time we do not call main method.

        method1(); // exception we ignore with throws keyword

       // method2(); compile error/ unhandled exception ->  we did not handle the exception permanently

        Library.sleep(3.5); // this method is created for handling sleep thread exception

    }

    // whoever calls this method, they will continuously get the exception
    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);  // exception -> we ignore with throws keyword
    }

    public static void method1() throws InterruptedException {

        System.out.println("Hello World");
        pauseFor5Seconds();  // exception -> we ignore with throws keyword
        System.out.println("Hello Cydeo");
    }


    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);


    }



}
