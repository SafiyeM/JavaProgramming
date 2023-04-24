package java_Programming_Lessons.day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // && Logical AND operator // || Logical OR operator // ! Logical NOT operator

        //_______________________ && Logical AND operator ___________________//
        // If both condition is true, then the result is true otherwise is false
        // If the first condition is false, we don't have to check the others, it is assumed as false.

        double salary= 60_000;
        int creditScore= 650;


        boolean eligibleForLoan= salary >= 30000 && creditScore >= 650;
        // first condition is salary must be greater or equal than 30.000 - true salary is greater
        // second condition is credit score must be greater or equal 650 - true credit score is equal

        System.out.println(eligibleForLoan); //true // the person is eligible for loan

        /*
        double salary= 90_000;
        int creditScore= 500;

        boolean eligibleForLoan= salary >= 30000 && creditScore >= 650;
                      // first condition is true && // second condition is false

             System.out.println(eligibleForLoan); //false // the person is not eligible for loan
         */

        salary = 25_000;
        creditScore= 700;
        int age= 25;

        eligibleForLoan= salary >= 30000 && creditScore >= 650 && age >= 18;
        //               false           && true               && true

        System.out.println(eligibleForLoan); // false


        salary= 60_000;
        creditScore= 650;
        age= 42;

        eligibleForLoan= salary >= 30000 && creditScore >= 650 && age >= 18;
        //                          true &&              true  &&       true

        System.out.println(eligibleForLoan); // all conditions are true


        System.out.println("___________________________________");

        //_______________________ || Logical OR operator ___________________//
        // If both condition is false, then the result is false otherwise is true
        // as long as one condition is true, it will always give the result is true

        String answer= "maybe";

        boolean validAnswer= answer == "Yes" || answer == "No";
        //                   first condition is false maybe is not equal to yes
        //                   second condition is false maybe is not equal to no

        System.out.println(validAnswer); // both condition is false so the result is false


        answer= "no";

        validAnswer= answer == "yes" || answer == "no";
        //           false           || true

        System.out.println(validAnswer); // the result is true because one condition is true


        System.out.println("____________________________________________");

        char grade = 'B';

        boolean passedTheExam= grade == 'A' || grade == 'B' || grade == 'C' || grade =='D' ;
        //                     false        ||         true ||      false   ||       false
        // as long as one condition is true, it will always give the result as true

        System.out.println(passedTheExam); // true


        System.out.println("___________________________________");

        //_______________________ ! Logical NOT Operator ___________________//
        // If the expression is true, then the result is false
        // If the expression is false, then the result is true


        System.out.println(true); // This boolean expression is true without ! NOT operator

        System.out.println( !true ); // if we use ! not operator, it is false


        String a= "yes";

        boolean yes= a == "yes"; // true

        boolean no = !yes; // false // we add yes variable above and add ! operator to turn it out false

        System.out.println("yes = " + yes );
        System.out.println("no = " + no);

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;


        System.out.println("passed = " + passed); // passed = true
        System.out.println("failed = " + failed); // failed= false


        System.out.println("___________________________________________");


        System.out.println( true == !false && false == !true && true != !true);
        //                       true      &&  true           &&      true






    }
}
