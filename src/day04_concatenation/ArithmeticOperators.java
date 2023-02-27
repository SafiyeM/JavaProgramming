package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println(100 + 200); //Addition operator (+) // "100" + 200 if we us String for this ex.
                                      // we concatenate the numbers, instead of addition

        System.out.println("____________________________________________");

        System.out.println(40 - 10); // Minus operator (-) //with minus operator we can not concatenate!!.

        System.out.println("____________________________________________");


        System.out.println( 50 / 6); // Division operator (/)
                                     /* in Java if you have division operator between two int, at the end
                                     we will get int value.
                                     int / int ===> int value

                                      if we have int / double ===> double value (we get)
                                      if we have double / int ===> double value
                                      if we have both numerator and
                                       denominator double / double ===> double value
                                      */

        System.out.println( 50 / 6.0); // 6.0 data type is double therefore we get decimal result output

        System.out.println( 50d / 6); // with lower case d 50 is converted to double, so it is now 50.0
                                      // so you will get decimal(double) result at the end

        System.out.println(2.5 / 0.5); //the result 5.0 is decimal number because both numbers are double
        System.out.println( (int) (2.5 / 0.5) ); // we can cast the double numbers to int like this to get
                                                  // int number so the result is 5 not 5.0


        //System.out.println(9/0 ); // It is like in math, we can not divide the number with 0

        System.out.println("____________________________________________");

        System.out.println(10 * 2); // Multiplication Operator (*) If you apply multiplication operator to two numbers
                                    // we will get multiplication result -->20
        System.out.println(20 * 12); // 240


        System.out.println("____________________________________________");

        /*____________How to find remainder in Math------------
        Remainder: numerator - (denominator * integer result)

         10 / 3 = 3.3333.....
         remainder: 10 - (3*3)= 1


         20 / 6= 3.33333....
         remainder: 20 - (6*3)= 2

         15 / 4 = 3.75
         remainder: 15 -(4*3)= 3

         ________________ In Java we have % Modulus operator to give us remainder___________

         10 % 3 ===> 1 // result is remainder not division
         20 % 6 ===> 2
         15 % 4 ===> 3
         */

        System.out.println( 100 % 13 ); // remainder is 9 // when a number is not evenly divisible by another then
                                        // we use modulus to divide, and we get the result as remainder
        System.out.println(10%2);      // if it is even number, then we get the remainder 0

        System.out.println(45 % 8); // remainder is 5










    }
}
