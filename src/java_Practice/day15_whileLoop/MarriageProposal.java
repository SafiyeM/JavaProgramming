package java_Practice.day15_whileLoop;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No ");
        String answer = input.next().toLowerCase().trim();


        while (!(answer.equals("yes") || answer.equals("no") )){        // DO NOT USE && OPERATOR
            System.err.println("Invalid answer, please re-enter");
            answer = input.next().toLowerCase();

        }

        if (answer.equals("yes")){
            System.out.println("Congrats.");
        } else {
            System.out.println("Goodbye!");
        }





        input.close();

    }
}
/*
1.  Create a class named Marriage proposal and write a program
    for the marriage proposal program asking the user,

     "Will you marry me?"

    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter"
     and repeat it until the user enters either yes or no

 */