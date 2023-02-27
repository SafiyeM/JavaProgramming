package day08_ternary_switch;

public class TernariesIntro {
    public static void main(String[] args) {

        int score= 85;
        String result="";

        if(score>=60){
            result="passed";
        }else {
            result="failed";
        }

        System.out.println(result);


        System.out.println("_______________________________________________");


       String result2= (score>=60) ? "passed" : "failed";

        System.out.println(result2);

        // This is one if condition, returns one value.
        // Use ternary for simple if statements, each block returns the same type of value like String (above)
        // It is not processing more than one statement, that is the time we can use ternary

        System.out.println("_______________________________________________");

        int age= 34;

        /*
        int age= 34;
        String result3;

        if(age >=21){
            result3="eligible";
        }else {
            result3="not eligible";
        }
         */

        //Ternary if statement

        String result3= (age >=21) ? "eligible" : "not eligible";

        System.out.println(result3);



    }
}
