package java_Programming_Lessons.day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

/*
        for (int i = 0; i < 5; i++) { // 5 times iteration totally 0,1,2,3,4-> 5(excluded)
            System.out.println("Hello Cydeo");
        }


        System.out.println("_________________________________");


        for (int i = 0; i < 5; i++) { //-> Those 'i' variables global variables. It only belongs to this for loop
            System.out.println("Hello " +i);
        }

        System.out.println("____________________________________");

        // we can use while for specific number of iteration like for loop
        //we can also use all in while-loop "initialization, condition, iteration and statement"
        // but it's designed for unknown of repeating/iteration
        // if it only depends on the condition while loop is preferable to use

        int i=0;
        while (i< 5){
            System.out.println("Hello " +i);
            i++;
        }


        System.out.println("____________________________________");

        // The same idea with do-while loop --> but not preferable
        int j= 0;
        do {
            System.out.println("Hello " +j);
            i++;
        }while (j<5);


        System.out.println("____________________________________");
        int k= 0;
        do{
            System.out.println("Hello "+k);
            k++;
        }while(k < 5);



 */

        System.out.println("----------------------------");




        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while(score > 100 || score < 0){ // while the score is invalid
            System.out.println("Invalid score, please re-enter your score ");
            score = input.nextInt();
        }


        if(score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }













    }
}
