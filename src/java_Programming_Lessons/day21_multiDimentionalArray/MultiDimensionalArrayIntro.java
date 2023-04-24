package java_Programming_Lessons.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {


    public static void main(String[] args) {

        // one dimensional array is container for elements

        int[] arr1= {10, 20, 30, 40};
        int[] arr2= {50, 60, 70, 80};
        int[] arr3= {90, 100};
        int[] arr4= {900, 1000};

        System.out.println("__________________________________");

        //two-dimensional array is container for one dimensional arrays
              // index:      0   1   3
        int[][] arr2D = {  {10, 20, 30} , {40, 50, 60, 70, 80} ,  {90, 100}, arr4}; // index: 0 ~ 3
        //  index :             0                    1                2       3



        System.out.println(arr2D.length); // 4

        System.out.println(Arrays.toString(arr2D[1])); // [40, 50, 60, 70, 80]
        System.out.println(arr2D[1][4]); // 80










    }
}
