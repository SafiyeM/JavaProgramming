package java_programming_lessons.day20_forEachLoop;

import java_programming_lessons.utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];
        //size of the new reversedArray needs to be equal the size of the given array

        for (int i = array.length - 1, j = 0; i >= 0; i--) { // or we can write the iteration here j++
            reversedArray[j++] = array[i];
        }
        //another solution
        /*
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j++]  = array[i];
        }
         */

        System.out.println(Arrays.toString(reversedArray));


        System.out.println("______________________________________________");


        int[] nums = {100, 200, 300, 400, 500};

        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));


        System.out.println("________________________________________________");


        double[] a1 = {1.5, 2.5, 3.5, 4.5, 6.5};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));


    }
}
/*
	3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */