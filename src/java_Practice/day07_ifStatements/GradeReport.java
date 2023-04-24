package java_Practice.day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {


        //Nested If Statement


        int score = 85;
        String result = "Your grade is: "; // It has already given the String variable value //
        // below we add only true grade & concatenate with the given value of result.
        // That's why we add +=


        if (score >= 0 && score <= 100) {


            if (score >= 90) {         //false: if score is < 90
                result += "A";
            } else if (score >= 80) {  //false: if score is < 80   // we do not need to write second expression -->> && score <90 // we can write if we want more clear expression
                result += "B";
            } else if (score >= 70) { // false: if score is < 70  // no need to write -->> && score <80
                result += "C";
            } else if (score >= 60) {  // false: score is < 60
                result += "D";
            } else {                  // true if score is < 60
                result += "F";
            }


        } else {
            result = "invalid";
        }

        System.out.println(result);
    }
}
