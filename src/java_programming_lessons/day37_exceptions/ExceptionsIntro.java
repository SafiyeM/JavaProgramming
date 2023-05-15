package java_programming_lessons.day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {


        String str = "Java";

        /*
        // during compile time, there is no error, it compiles
        // during run time, it occurs StringOutOfBoundsException
        // -> unchecked exception, they will only be revealed during run time
        char ch = str.charAt(250);
        System.out.println(ch); // once we have the exception during run time, the exit method gets executed
                                // and nothing gets printed/ executed
         */


        // we do not have an object. Null does not refer to any objects
        Pizza pizza = null;  // NullPointerException
       // pizza.calcCost(); // we are trying to call instance method from the object that does not exist

        System.out.println("Hello World"); // this code fragment will never get executed,
        // without dealing with exception, it is impossible to execute to run the code fragments


        // This is a bug -> not an exception
        // This still compiles, no error but there is a logical issue in this condition
        int score = 100;
        if (score >59){
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }
        // When the exception occurs, the program will be crashed. When we have a bug it does not mean that the program will be crashed.
        // can still execute the system


        System.out.println("______________________________________________________");

        // checked exception
       // FileInputStream file = new FileInputStream(""); during the compile time, the exception is checked.
        // when we have checked exception, it will give always compile error. Never runs.


        // Thread.sleep(3000); // checked exception


    }
}
