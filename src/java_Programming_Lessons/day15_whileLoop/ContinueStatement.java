package java_Programming_Lessons.day15_whileLoop;

public class ContinueStatement {


    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {

            if (i == 4) { // it will skip 4 and jumps to 5
                continue;
            }

            System.out.println(i);
        }


        System.out.println("___________________________________________");


        for (int i = 10; i < 21; i++) {


            if (i % 2 == 0) { // if i is even then
                continue;   // it skips the current iteration
            }


            System.out.println(i);

        }


        System.out.println("____________________________________");


        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E') { // or we can use single-if for each condition
                continue;
            }


            System.out.println(i);
        }

        System.out.println("____________________________________");

        // find the sum of all the even number between 50 ~ 100

        // 1. approach
        for (int i = 50; i < 101; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " "); // this prints all the even number
            }
        }


        System.out.println(); //--> do NOT forget to add a new println to append a new line since we used above print statement


        //2. approach to find the even numbers
        //50, 52, 54, 56,.....100
        for (int i = 50; i < 101; i += 2) { // we change the iteration, it iterates by 2
            System.out.print(i + " ");

        }


        System.out.println(); // appends a new line


        // 3. approach
        for (int i = 50; i < 101; i++) {

            if (i % 2 != 0) {  // if the i's value is odd number
                continue;     // skip it --> so the even numbers will get executed
            }
            System.out.print(i + " ");

        }


        System.out.println(); // for a new line





       /* //_________ without curly braces --> not a good practice______________//

         for (int i = 0; i < 10; i++)  // additional--> do not forget curly braces!--> without them, block can
                                       // only carry one code fragment

            System.out.println("Hello World");  // loop can only carry this statement and execute it 10 times
            System.out.println("Hello Cydeo");  // loop can not carry this statement and execute it 1 time

        */


    }
}
