package java_practice.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {


        //This program finds the nth largest element from an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 5;        //-> indicates that we want to find the 5th largest element from the list

        for (int i = 1; i < n; i++) {
            //In each iteration, find max with the help of 'Collections.max' method and remove all the occurrences of that max element

            list.removeAll(Arrays.asList(Collections.max(list)));

            System.out.println(list);
            /*
            [1, 2, 3, 4, 5, 6, 7, 7] i:1  -> size = 8
            [1, 2, 3, 4, 5, 6]       i:2  -> size = 6
            [1, 2, 3, 4, 5]          i:3  -> size = 5
            [1, 2, 3, 4]             i:4  -> size = 4
             */
        }

       System.out.println(Collections.max(list)); // 4


    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */
