package java_programming_lessons.day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            System.exit(1);   // There is only one way to stop finally block, we can call exit method.
                                   // If we use finally block, there is no point giving exit method to stop it
        }finally {
            System.out.println("Finally Block");
            // the 'finally' block ALWAYS gets executed unless we forcefully terminate the program
            // The only time that we use finally block, if there is a code fragment we must execute, whether the exception is handled or not
            // has to place after the last catch block
        }




    }

}
