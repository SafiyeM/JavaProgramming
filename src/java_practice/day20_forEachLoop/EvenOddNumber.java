package java_practice.day20_forEachLoop;

import java.util.Arrays;

public class EvenOddNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};

        int odd = 0;
        int even = 0;

        for (int eachNumber : arr) {

            if (eachNumber % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(Arrays.toString(arr) + " has " + even + " even numbers and " + odd + " odd numbers");




   /*
    Expanded Approach;
     int odd= 0;
     int sumOdd= 0;
     String oddN="";

     int even= 0;
     int sumEven= 0;
     String evenN="";


        for (int eachNumber : arr) {

            if (eachNumber %2 == 0){
               even++;
              sumEven += eachNumber; // sum of all even numbers
                evenN += " "+ eachNumber;

            }else{
                odd++;
                sumOdd += eachNumber;
                oddN += " "+eachNumber;


            }
        }




    System.out.println("Even numbers in array: " + evenN + " numbers of even numbers= " +even +
    " sum of even numbers= " +sumEven  );

    System.out.println("Odd numbers in array: " + oddN + " numbers of odd numbers= " +odd +
    " sum of odd numbers= " +sumOdd  );
    */

    }
}
/*
1.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */