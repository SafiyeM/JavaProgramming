package java_programming_lessons.day38_exceptions;

import java_programming_lessons.utilities.Library;


import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {


        System.out.println("Hello Cydeo");
        //Thread.sleep(3500);

        // we created utility method in Library Class, so that it handles the exception
        // wherever we call the method it can handle the exception permanently by using try&catch Blocks
        Library.sleep(3.5);

        System.out.println("How are you?");

        System.out.println("_______________________________________");

        if (LocalTime.now().equals(LocalTime.of(1, 11))) {
            throw new BreakTimeException();

        }

        // throw new RuntimeException("something went wrong"); -> no compile error
        // we have a constructor with String message in RuntimeException class
        // that's why we can pass a message in parameter



        // throw new BreakTimeException("It's time to go home"); -> compile error
        // because we did not creat so far a constructor with an argument in BreakTimeException custom class

        // throw new BreakTimeException(); -> we have a default constructor
        // we can see on the console "It's a break time" because in our default

        throw new BreakTimeException("It's time to go home");
        // now we created a constructor with a String message argument in BreakTimeException custom class




    }
}
