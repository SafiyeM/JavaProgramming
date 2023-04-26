package java_programming_lessons.day15_whileLoop;

public class WhileLoopIntro {
    public static void main(String[] args) {


        if (true) {
            System.out.println("Hello World"); // it gets executed only once
        }

        System.out.println("______________________");


        for (int i = 0; i < 10; i++) {// for-loop -> we have an iteration and stop point
            System.out.println(i); // i gets executed 0 ~ 9 -> 10 is not included
        }

        System.out.println("________________________________");


        // if there is a while that means it is a loop --> while loop does not have an iteration and stop point

        while (true) {  // While-loop is repeated if statement ( how many times it will be executed is unknown)
            System.out.println("Hello Cydeo");
            // it is now an infinite loop,
            // we need to exit the program with return or exit the loop with break

        }


    }
}
