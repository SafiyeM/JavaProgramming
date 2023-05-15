package java_programming_lessons.day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program1 started");

        try {
            System.out.println(9 / 0); // Arithmetic Exception

            System.out.println("Try Block");

        } catch (RuntimeException e) {
            System.out.println("Catch Block");
        }


        System.out.println("Program1 ended");

        /*
        Program started
        Catch Block
        Program ended

        in order to handle exception , we use try-catch block.
        One of those will handle this exception, either try block or catch block.
        In this example try block could not handle, that's why catch block tries to catch.


         */


        System.out.println("__________________________________________________");

        System.out.println("Program2 started");


        String str = null;

        try {
            System.out.println(str.toLowerCase()); // NullPointerException
            System.out.println("Try Block");
        } catch (RuntimeException e) {
            System.out.println("Catch Block");
        }


        System.out.println("Program2 ended");

        /*
        Program2 started
        Catch Block
        Program2 ended
         */

        System.out.println("__________________________________________________");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        } catch (InterruptedException e) {
            System.out.println("Catch Block");
        }

        System.out.println("Program3 ended");

        /*
        Program3 started
        Try Block
        Program3 ended
         */

    }
}
