package java_programming_lessons.day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // > greater than // >= greater than or equal // < less than // <= less than or equal


        //_________________ greater than operator > ____________________//

        int a = 1000;
        int b = 200;

        System.out.println(a > b); // a is greater than b ==> true

        System.out.println(a < b); // a is less than b ==> false

        boolean aIsGreater = a>b; // boolean data

        System.out.println(aIsGreater); // true

        System.out.println("________________________________");

        //_________________ greater than or equal operator >= ____________________//

        // this operator will turn true as long as the first value is either greater than
        // or equal to the second value


        int score = 75; // score of the student // if the student passed the exam

        boolean passed = score >= 60; // as long as the score is equal or greater than 60


        System.out.println(passed);// it is true - student passed

        // int score 60;
        //System.out.println(passed); true

        // int score 50;
        //System.out.println(passed); false

        int age= 21;

        boolean eligibleToBuyAlcohol= age >= 21;

        System.out.println(eligibleToBuyAlcohol);// true

        boolean eligibleToVote= age >= 18;

        System.out.println(eligibleToVote); //true

        System.out.println( 100 > 100 );  // false
        System.out.println( 100 >= 100 ); // true
        System.out.println( 100 >= 85 );  // true
        System.out.println( 100 >= 185 ); // false


        System.out.println("________________________________");

        //_________________ less than operator < ____________________//

        score = 48; // reassigned the score value

        boolean failed = score < 60;

        System.out.println(failed); // true

        System.out.println(100 < 2000); // true

        System.out.println(100 < 20); // false


        System.out.println("________________________________");

        //_________________ less than or equal operator  <= ____________________//


        System.out.println(95 <= 100); //true

        System.out.println( 100 <= 100);// true

        System.out.println(10 <= 5); // false

        System.out.println("________________________________");

        System.out.println('a' > 'b'); //false
        //                 65 > 66 (Ascii table)











    }
}
