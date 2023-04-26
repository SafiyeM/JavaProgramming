package java_programming_lessons.day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        int[] arr1D= new int[10];
        arr1D[0]= 100;

        System.out.println(Arrays.toString(arr1D)); // [100, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        int[][] arr2D = new int[5][]; // arr2D contains 5 1D array   index 0 ~4

        System.out.println(Arrays.toString(arr2D)); // [null, null, null, null, null] -> array is an object
                                                    // for all objects default value is null

        arr2D[0]= arr1D;

        System.out.println(Arrays.deepToString(arr2D)); // [[100, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]



        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[] arr6 = {30, 40, 50, 60, 70, 80, 90};


        arr2D[0]= arr1;
        arr2D[1]= arr2;
        arr2D[2]= arr3;
        arr2D[3]= arr4;
        arr2D[4]= arr5;

       // arr2D[5]= arr6; -> Index 5 is out of bounds for length 5


        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20, 21]]

    }
}
