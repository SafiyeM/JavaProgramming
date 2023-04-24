package java_Programming_Lessons.day08_ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {



      /*
            int score=67;
            String result= "";

           if ( score >= 0 && score <= 100){     // if the score is valid // pre-condition of this example

            if(score >= 60){
                result= "Passed";                // if the score is greater or equal to 60
            } else {                             // if the score is less than 60
                result= "Failed";
            }

        }else {                                   // if the score is not valid
            result= "invalid score";
        }

       */

        //_________________________Nested Ternary If Statement______________//

        // number of ? question marks  and : columns must be even in Ternary
        // Nested If Statement is preferable than nested Ternary!

        int score= 95;

        String result= (score >= 0 && score <= 100) ?     // pre-condition

                        (score >= 60)? "passed" : "failed"

                        :"invalid"; // else statement of pre-condition

        System.out.println(result);


        System.out.println("_____________________________________________________");


        int n=4;

        String day= (n >=1 && n <=7) ?      // pre-condition

                         (n==1)?"Monday"   :(n==2)?"Tuesday" :(n==3)?"Wednesday"
                        :(n==4)?"Thursday" :(n==5)?"Friday"  :(n==6)?"Saturday" :"Sunday"

                : "no such a day"; // else statement of pre-condition

        System.out.println(day);








    }
}
