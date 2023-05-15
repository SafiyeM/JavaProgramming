package java_programming_lessons.day37_exceptions;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]); //Index 1000 out of bounds for length 4
            System.out.println("Try Block");
        }catch (RuntimeException e){
           e.printStackTrace(); // display full details of the exception after the execution of program
           // System.out.println(e.getMessage()); //it only gives exception message not details
                                                  // better to use printStackTrace() method
        }

        System.out.println("Program1 ended");


        System.out.println("_____________________________________________");

        System.out.println("Program2 started");

        try {
            System.out.println(9/0);   // if try block can not handle,
        }catch (RuntimeException e){  // catch block catch the exception during the run time
           e.printStackTrace();      // this display full details of the exception after it's been handled
          //  System.out.println(e.getMessage());
        }

        System.out.println("Program2 ended");

        System.out.println("_____________________________________________");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program2 ended");
    }
}
