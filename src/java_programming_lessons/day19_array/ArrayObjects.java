package java_programming_lessons.day19_array;

import java.util.Arrays;

public class ArrayObjects {


    public static void main(String[] args) {



        int[] arr1 = {10, 20, 30, 40, 50}; // one object can be stored to different variable. -> 1 obj 3 variable
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0] = 1000;
        arr2[2] = 3000;

        System.out.println("arr1" + Arrays.toString(arr1) );
        System.out.println("arr2" +Arrays.toString(arr2) );
        System.out.println("arr3"+ Arrays.toString(arr3) );




        System.out.println("----------------------------------------------------");

        String[] a1 = {"Lina", "Henry"};

        a1 = new String[]{"James", "Daniel"};


        System.out.println(Arrays.toString(a1));




    }
}
