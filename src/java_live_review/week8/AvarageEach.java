package java_live_review.week8;

import java.util.Arrays;

public class AvarageEach {
    public static void main(String[] args) {

        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        System.out.println(Arrays.deepToString(nums)); // [[3, 4, 5, 6], [5, 2, 6], [10, 40, 20]]

        double sumOfAll = 0;
        int totalNumberOfElements = 0;

        for (int[] eachArray : nums) {  // inner is the 1D array elements
            //System.out.println(Arrays.toString(eachArray));

            double sumEach = 0; // this should reset each time the outer loop runs

            for (int eachNumber : eachArray) {
                // System.out.println(eachNumber);
                sumEach += eachNumber;
            }


            double avarage = sumEach / eachArray.length; // avarage = sum of number 7 amount of numbers
            //System.out.println(sumEach + " / " + eachArray.length + " = " + avarage);

            System.out.println("avarage of " + Arrays.toString(eachArray) + " is " + avarage);


            sumOfAll += sumEach; // adding the sum of each inner array to the total sum

            totalNumberOfElements += eachArray.length;


        }

        System.out.println("Total avarage: " + (sumOfAll / totalNumberOfElements));

    }
}
/*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers.
    Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.3
            average of: [10, 40, 25] is 25.0
            average of all is 10.6
 */