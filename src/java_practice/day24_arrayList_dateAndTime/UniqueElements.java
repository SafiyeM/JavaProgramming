package java_practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5)); // initialize

        list.removeIf(p -> Collections.frequency(list, p) > 1); // removes all the elements from the ArrayList that occur more than once.

        System.out.println(list);


/*
The removeIf() method removes all elements
 from the list for which the lambda expression returns true.
 */


    }
}
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops

 */