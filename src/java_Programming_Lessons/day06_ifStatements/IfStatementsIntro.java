package java_Programming_Lessons.day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        // single if statement // syntax ==> if (condition) {  Statements }

        int number= - 100;

        boolean isPositive= number > 0;
        boolean isNegative= number < 0;
        boolean isZero= number == 0;



        if ( isPositive ) {

            System.out.println(number + " is positive");
        }


        if (isNegative) {
            System.out.println( number +" is negative"); // true output -100 is negative
        }


        if (isZero) {
            System.out.println( number + " is zero");
        }


        System.out.println("___________________________________________");


        int num= 0;

        if (num > 0) {
            System.out.println( num + " is positive number");
        }

        if (num> 0) {
            System.out.println( num + " is negative number");

        }

        if (num == 0) {
            System.out.println( num + " is zero");
        }












    }
}
