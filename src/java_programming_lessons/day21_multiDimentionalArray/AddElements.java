package java_programming_lessons.day21_multiDimentionalArray;

import java_programming_lessons.utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        int elements= 6;

        int[] new_Array = Arrays.copyOf(array, array.length +1); // it contains arrays length and + 1 more element
        new_Array[new_Array.length-1]= elements;

        System.out.println(Arrays.toString(new_Array)); // [1, 2, 3, 4, 5, 6]

        int[] numbers= {100, 90, 80, 70, 60};
        System.out.println(Arrays.toString(numbers));// [100, 90, 80, 70, 60]

       numbers= ArraysUtility.addElement(numbers, 50); // we call addElement method and reassigned to numbers
        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60, 50]


        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);

        nums = ArraysUtility.addElement(nums, 6.5);

        nums = ArraysUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums)); // [1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5]


        System.out.println("------------------------------------------");

        String[] students = {"Mehmet", "Ali", "Umut"};


        students = ArraysUtility.addElement(students, "Mina");

        students = ArraysUtility.addElement(students, "Nalan");

        students = ArraysUtility.addElement(students, "Safiye");

        System.out.println(Arrays.toString(students)); // [Mehmet, Ali, Umut, Mina, Nalan, Safiye]




    }
}
