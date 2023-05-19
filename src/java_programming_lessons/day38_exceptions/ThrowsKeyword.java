package java_programming_lessons.day38_exceptions;


public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException  {
        // We place throws keyword only one time within method signature.
        // And we use it with any InterruptedException in this main method,
        // will no longer give compile error

        // However, if we call it from the other Classes, we get still the exception.
        // throws keyword is used, if we want to get rid of the exception with the fastest way.
        // throws keyword is not required for unchecked exceptions (subclasses of RuntimeException or Error)T


        // 1. way of handling exception - try&catch -> disadvantage: too many blocks
        /*

       // System.out.println(100/0); unchecked exception -> do NOT use throws keyword for handling the unchecked exception

       // Thread.sleep(5000); // checked exception handling -> 1- try&catch block 2- Throws keyword



         System.out.println("Program1 started");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("_________________________________________________");

        System.out.println("Program2 started");

        try {
            Thread.sleep(3000); // exception code
        }catch (InterruptedException e){  //exception type
            e.printStackTrace(); // to see the details of the exception
        }

        System.out.println("Program2 ended");

         */


        // 2. way of handling exception - throws keyword -> advantage: shorter, faster and code is more readable
        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("_____________________________________");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");

        System.out.println("_____________________________________");

        System.out.println("Program3 started");

       // FileInputStream file = new FileInputStream("");

        Thread.sleep(5000);

        System.out.println("Program3 ended");



    }
}
