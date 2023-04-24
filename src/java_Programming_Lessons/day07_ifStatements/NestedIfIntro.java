package java_Programming_Lessons.day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

        // there should be a pre-condition to create a nested if statement

        int score= 95;

        if ( score >= 0 && score <= 100){ // if the score is valid // pre-condition of this example

            if(score >= 60){
                System.out.println("Passed"); // if the score is greater or equal to 60
            } else { // if the score is less than 60
                System.out.println("Failed");
            }

        }else { // if the score is not valid
            System.out.println("invalid score");
        }


        System.out.println("_________________________________________________");


        int age= 38;

        // pre-condition : age 1 ~ 150

        if (age >= 1 && age <= 150){ // our pre-condition

            if (age >= 21){
                System.out.println("eligible");
            }else{
                System.out.println("not eligible");
            }

        } else {
            System.out.println("invalid age");
        }


        System.out.println("_______________________________________");


        int day = 7;

        /* This is multi-branch if statement // if we have pre-condition, it is better to use nested if statement

        if(day == 1){
            System.out.println("Monday");
        }else if(day ==2){
            System.out.println("Tuesday");
        }else if(day ==3){
            System.out.println("Wednesday");
        }else if(day ==4){
            System.out.println("Thursday");
        }else if(day ==5){
            System.out.println("Friday");
        }else if(day ==6){
            System.out.println("Saturday");
        }else if(day ==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Number");
        }
         */


        // This is nested if statement

        if (day >= 1 && day <= 7) { // this is pre-condition of the nested if statement

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else { // if the precondition is failed
            System.out.println("Invalid Day");
        }








    }
}
