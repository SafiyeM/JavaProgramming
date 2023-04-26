package java_practice.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetElement {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5)); // adding multiple elements at once by using bulk operation

        list.set(list.size()-1, 0);    // the last element of the ArrayList is modified to 0 using the set method.

        System.out.println("list = " + list); // list = [1, 2, 3, 4, 0]

        /*
        A bulk operation in Java refers to the process of adding,
        removing or modifying multiple elements of a collection in a single step.
         */

    }

}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */

