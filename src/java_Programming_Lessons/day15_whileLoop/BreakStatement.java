package java_Programming_Lessons.day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {


        // --> break; we use break for forcefully exiting the loop!!!
        // To exit the loop forcefully, condition of break statement must be true


        for (int i = 0; i < 10; i++) {


            if (i == 6) { // if i's value reaches 6 (if the condition of break statement is true)
                break;   // break statement exits/terminates the loop
                // we use break statement to terminate any types of loop
                // --> for loop, while loop, do-while or infinite loop
            }

            System.out.println(i);


        } // break statement must inside the loops body


        System.out.println("_______________________________________________");


        for (char i = 'A'; i <= 'Z'; i++) {


            System.out.println(i);

            if (i == 'J') {  // we give our condition after print statement because we want 'J' is also added to the console
                break;      // if before pre statement --> 'J' will not be included.
            }

        }


        System.out.println("____________________________________");

        for (; ; ) {  // --> infinite loop
            System.out.println(" Hello");
            break; //--> it gets terminated first after it executes hello one time

            // System.out.println("World"); //--> after the brake statement within the block, we can not give any statement
            // it will result in a compilation error because any statement after the break; statement would be unreachable.
            // This is because the break; statement causes an immediate exit from the loop,
            // and any code after that statement within the same block will not be executed.

        }




    }
}
