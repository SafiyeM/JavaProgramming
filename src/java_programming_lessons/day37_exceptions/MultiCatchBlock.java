package java_programming_lessons.day37_exceptions;

import java_programming_lessons.day35_polymorphism.transportation.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        // MULTIPLE CATCH BLOCK

        // 1 try block with multiple catch blocks

        System.out.println("Program1 started");
        Car car = null;  // NullPointerException

        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Forth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){  // we give this block, if none of those catch blocks catch the exception, this block is going to catch it
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        } // RuntimeException is parent of all catch blocks, that's why we place it at the end
          // if we use it at the beginning, it will give compile error. Because the other blocks become unreachable, can never be executed.

        System.out.println("Program1 ended");

        /*
        NullPointerException
        Program1 started
        Third Catch Block
        Program1 ended
         */

    }


}
