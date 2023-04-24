package java_Programming_Lessons.day19_array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {


        int[] arr1= new int[100];



        /*for (int i = 0, j= 1; i < arr1.length; i++, j++) { // i: index number -> j: elements of arr1
            arr1[i]=j;

        }

         */

       // for (int i = 0, j= 10; i < arr1.length; i++, j+= 10) { 'j' begin to increase 10 and increase by 10. 10, 20, 30, ....
          //  arr1[i]=j; -> j is assigned to index numbers of arr1
       // }

        for (int i = 0; i < arr1.length; i++) {

            arr1[i]= i+1;

        }

        System.out.println("arr1: "+ Arrays.toString(arr1)); // 1 - 100


        System.out.println("_________________________________");


        int[] arr2= new int[100];

        for (int i = 0, j= 100; i < arr2.length; i++, j--) { // we use secondary variable to reverse
            arr2[i]= j;
        }

        /*for (int i =0; i < arr2.length; i++) { without using secondary variable
            arr2[i]= 100 -i;
        }

         */

        System.out.println("arr2 = " + Arrays.toString(arr2)); // 100-1 reversed order






    }
}
