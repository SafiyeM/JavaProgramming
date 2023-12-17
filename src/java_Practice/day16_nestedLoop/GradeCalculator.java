package java_Practice.day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        while (true){


            System.out.println("Enter your score");
            int score= input.nextInt();

            if (score < 0 || score > 100){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            char grade= (score>= 90)? 'A'  :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' :'F';
            System.out.println("your grade is: " + grade);


            System.out.println("Would you like to continue? (yes/no) ");
            String answer= input.next().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no")) ){
                System.err.println("Invalid entry, please re-enter! Would you like to continue?");
                answer= input.next();
            }

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo grade calculator app!");
                break;
            }






        }




input.close();

    }
}
/*
6. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message
                                "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program

 */
