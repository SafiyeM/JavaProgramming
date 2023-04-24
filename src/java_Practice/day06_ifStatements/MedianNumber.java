package java_Practice.day06_ifStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 30,
                b = 15,
                c = 40;
        /* if we have three different numbers, one MUST maximum, one MUST be minimum
         and one MUST be Median */

        // a= 15, b= 10, c = 20    a = 15, c = 10, b = 20
        if ((a > b && a < c) || (a > c && a < b)) {

            System.out.println(a + " is the median number");
             /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */
        }

        // b=15, a = 20, c = 10,       b= 15,  a = 10, c= 20
        if ((b > c && b < a) || (b > a && b < c)) {
            System.out.println(b + " is the median number");
        }

        // c=15, b = 20, a = 10,       c= 15,  a = 10, b= 20
        if ((c > b && c < a) || (c > a && c < b)) {
            System.out.println(c + " is the median number");
        }



/*
        2. Solution with assigning the conditions in boolean variables

        boolean aIsMedian = (a > b  && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > c && b < a)  || (b > a && b < c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a+" is the median number");
        }

        if( bIsMedian){
            System.out.println(b+" is the median number");
        }

        if(cIsMedian){
            System.out.println(c+" is the median number");
        }



 */


    }
}
/*

1. Create a class named MedianNumber.
 write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */