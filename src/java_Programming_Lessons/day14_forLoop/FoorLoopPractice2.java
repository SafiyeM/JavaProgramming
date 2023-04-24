package java_Programming_Lessons.day14_forLoop;

public class FoorLoopPractice2 {
    public static void main(String[] args) {


        /*
           1. Task -->  write a program that can find sum of all the numbers between 1-100
            first get all the number and find the sum

           2. Task --> write a program that can display the alphabets from a to z

           2. Task --> Print the alphabet letters in backwards

             */


        // 1.Task

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum of the numbers: " + sum); // 5050


        System.out.println("_________________________");


        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);  // System.out.print(i + " "); // A B C D E F ....... after using print statement use another
                                    // empty print statement to start a new line  --> System.out.println();

        }


        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }


        System.out.println();


    }
}