package java_programming_lessons.day20_forEachLoop;

import java.util.Arrays;
import java_programming_lessons.utilities.ArraysUtility;

public class MergeToArrays {

    public static void main(String[] args) {

        int[] arr1= {1, 2, 3, 4,};
        int[] arr2= {5, 6, 7,};

        int[] arr3= new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain
                                                       // all the elements of arr1 & arr2

        // the size of the array has to be fixed, when we instantiate the size of arr3,
        // we can not give random number to contain the elements -> i.e. int[] arr3= new int[200]; ->false
        /*
        "Instantiating an array" in Java means creating a new array object and allocating memory for it.
         This involves specifying the type of elements that the array will contain, as well as the number of elements
         that the array will hold.
         */


        int k=0; // it is for holding & tracking the index numbers of arr3 during each iteration of first and second array's loop

        for (int i = 0; i < arr1.length; i++, k++) { // i: index number of arr1 from 0-till last index number
                                                      // everytime 'i' increased, 'k' is also increased
            arr3[k]= arr1[i]; //-> we add elements of add1 to add3
        }


        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
                                                   // everytime 'i' increased, 'k' is also increased
            arr3[k]= arr2[i]; //-> we add elements of add2 to add3

        }


        System.out.println(Arrays.toString(arr3)); // [1, 2, 3, 4, 5, 6, 7] -> we merged two arrays into the third array


        System.out.println("_____________________________________________");


      /*
       1. import the class through the class name & package we created to call the method
       -> import java_Programming_Lessons.utilities.ArraysUtility;
       2. once we imported, through the class name we can call the method merge
       3. And pass two array as arguments that we wanted to merge
       4. At the end it will return new int array merged both two arrays into it

       */
      int[] a1= {10, 20, 30, 40, 50, 60};
      int[] a2= {70,80, 90};
      int[] a3=ArraysUtility.merge(a1, a2);


        System.out.println(Arrays.toString(a3)); // [10, 20, 30, 40, 50, 60, 70, 80, 90] merged two integer arrays a1 & a2 into a3

      double[] b1= {10.5, 5.5, 3.5, 6.5, 8.5};
      double[] b2= {20.5, 15.5, 13.5};

      double[] b3= ArraysUtility.merge(b1, b2); // we have now new array object b3, merged the other two arrays into it


        System.out.println(Arrays.toString(b3)); // [10.5, 5.5, 3.5, 6.5, 8.5, 20.5, 15.5, 13.5]


        System.out.println("_______________________________________________");


        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.merge(c1, c2);

        System.out.println(Arrays.toString(c3));







    }
}
/*
	2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */