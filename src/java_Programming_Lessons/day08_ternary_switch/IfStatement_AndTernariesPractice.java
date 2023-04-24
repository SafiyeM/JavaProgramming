package java_Programming_Lessons.day08_ternary_switch;

public class IfStatement_AndTernariesPractice {

    public static void main(String[] args) {

// This is Ternary and If mix Statement
        int score= 90;
        String result="";

        if (score>=0 && score<=100){ // pre-condition of If Statement

            result=  (score >=90)? "A"  :(score>=80)? "B"         // Ternary applied into the If Statement
                    :(score>=70)?  "C"  :(score>=60)? "D" :"F";   // To mix both Ternary and If Statement,
                                                                   // it can be readable, shorter

        }else{                       // else Statement of pre-condition Statement
            result="invalid score";
        }


        System.out.println(result);


        System.out.println("__________________________________________");


        // This is Ternary only

        String result2= (score>=0 && score<=100) ? // Pre-Condition Statement

                result2=  (score >=90)? "A"  :(score>=80)? "B"
                        :(score>=70)?  "C"  :(score>=60)? "D" :"F"

        :"invalid score";  // else Statement of pre-condition Statement

        System.out.println(result2);




    }
}
