package java_programming_lessons.day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        // throw keyword & throws are opposite

        // throws: to fix the exception (temporarily)
        // throw:  for creating exception



        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) { // as soon as this condition is true, it will throw exception
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative ");
            } else {
                throw new InputMismatchException("Age of the person should not be greater than 150. You have entered: " +age);
            }
            // with throw, we can see the details of the exception at which line occurs
            // it still executes the exit program to terminate the program,
            // so that the remaining code fragment after that will not get executed


            /*
             *  this is what we have done before to give invalid message,
                but we can not see the details at which line this invalid message occurs
              System.err.println("Invalid age");
              System.exit(1);
             *  Exception (throw) is used for indicating that there is an issue within the program
                but the exit method can not indicate, it just terminates the program with specific status code



             */


        }


        if (age >= 21) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }


        System.out.println("__________________________________________________");

        //throw new RuntimeException("Runtime exception"); // this cause the program to terminate
       // System.out.println("Hello World"); -> unreachable statement
                                               // after using throw keyword in the same block, we can no longer give any code fragments


        // throw new FileNotFoundException(""); // ->  unhandled checked exception
        // throw is also used with checked exception
        // but here there is no point to use the throw keyword for checked exception


        try {
            throw new FileNotFoundException(""); // ->  unhandled checked exception
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }


        System.out.println("__________________________________");

        // instead of using exception object,we can assign it into a variable but unless if we use the exception more than once
        //exception object:
        // throw new RuntimeException();

        // assigned variable for the exception
        RuntimeException exception = new RuntimeException();
        // throw exception;


        // throw new Person("Jimmy", 45, 'M'); compile error -> Person object does not have IS RELATIONSHIP with Throwable and RuntimeException Class
        // with throw & throws keyword the object has to be a child of RuntimeException Class




    }
}
