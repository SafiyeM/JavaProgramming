package java_programming_lessons.day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number= 200;
        boolean isPositive= number > 0; // if the number is greater than zero, then it is positive number
        boolean isNegative= number < 0; // if the number is less than zero, then it is negative number
        //boolean equal= number == 0; // if the number is equal to zero, then the number is zero

        boolean isZero= !isPositive && !isNegative; // if the number is NOT negative and NOT positive,
                                                   // then it's zero

        System.out.println( number + " is positive number: " +isPositive);
        System.out.println( number + " is negative number: " + isNegative);
        System.out.println( number + " is zero: " + isZero);


    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
