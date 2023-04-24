package java_Programming_Lessons.day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score= 50;
        String result= "Your grade is: "; // It has already given the String variable value //
                                         // below we add only true grade & concatenate with the given value of result.
                                         // That's why we add +=

        if (score>= 90){ ////false: if score is < 90
            result +="A";
        } else if (score>=80) { //false: if score is < 80   // we do not need to write second expression -->> && score <90 // you can write if you want more clear expression
            result += "B";
        } else if (score >=70) { // false: if score is < 70  // no need to write -->> && score <80
            result += "C";
        } else if (score>=60) { // false: score is <60
            result +="D";
        }else { // true if score is < 60
            result +="F";
        }

        System.out.println(result);

       // System.out.println("Your grade is:" + result); another way to print, we can write the string text here
        // and concatenate with the result



    }
}
/* Create a class named GradeReport.java
        2. An integer variable named score is declared and given, Write a
        program that can print the grade of the student
        Ex:
        score = 95
        output:
        Your grade is A
        Note: Assume that the given score is between 0 ~ 100

 */