package java_Practice.day19_array;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }



/*

        int[] arr1 = {1, 2, 3, 4, 5, 10, 5, 2, 10};
        int[] arr2 = {4, 5, 6, 7, 8, 10, 10, 5, 2};


        String commonInt = ""; // 2, 4, 5, 10

        for (int i = 0; i < arr1.length; i++) {

            int a1 = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (a1 == arr2[j] && !commonInt.contains("" + arr2[j])) {
                    commonInt += a1 + " ";
                }
            }
        }
        System.out.println(commonInt);




 */


    }
}
/*
8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */