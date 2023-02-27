package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {


        char grade= 'A';

        /*
        A : excellent               // we compare if grade is equal to A
        B : great job               // we compare if grade is equal to B
        C : good                    // we compare if grade is equal to C
        D : passed                  // we compare if grade is equal to D
        F : failed                  // we compare if grade is equal to F
         */

       // instead of multi-branch If statement, we can use "switch-case statement"
        //Benefits of switch case statement- it operates much faster - Running time is shorter-
        // in switch the block is executed that has the same value and equal to switch expression.

        String result;

        if (grade == 'A'){
            result= "Excellent";

        } else if (grade == 'B') {
            result= "Great Job";

        } else if (grade == 'C') {
            result="Good";

        } else if (grade == 'D') {
            result ="Passed";

        }else {
            result= "Failed";
        }

        System.out.println(result);

        System.out.println("_______________________________");

        switch (grade){

            case 'A':                   // The same case block can not be duplicated.
                System.out.println("Excellent" );   // We can not give the same value to other case, every case hase unique value
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;                                // if we do not use break, the case is going to keep running
            case 'D':                                 // and prints out all values of result at the end
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:                                 // default only runs when non of the case blocks matching
                System.out.println("invalid");
                                                    // after default block if it is at the end, we do not need break statement






        }





    }
}
