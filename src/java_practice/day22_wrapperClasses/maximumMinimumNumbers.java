package java_practice.day22_wrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class maximumMinimumNumbers {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));  // bulk operation: multiple elements is added at once


        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            if (number > maxNumber ){
               maxNumber = number;
            }
            if (number < minNumber){
                minNumber = number;
            }
        }


        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);




    }
}
/*

4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */