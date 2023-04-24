package java_Programming_Lessons.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {




        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        // make sure when converting array, that the arrays data type is not primitive
        // -> collection does not support primitive


        System.out.println("________________________________________________");


        //Advantage and disadvantage Array & ArrayList

        // Advantage of Array over the collection:
        // Array supports all data types, can be multidimensional,
        // Array has the fastest performance in terms of retrieving data and managing data

        //  Disadvantage: the size fixed
        //There are still many methods that are not available in the array, so we need to create our own methods

        /*
        Collection advantage: Size is dynamic -> can be increased and decreased
                              It is a standard data structure, because it has lots of ready methods we
                              can call and use
                  disadvantage: performance of the Collection is not as fast as Array
         */


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python","C#"));

        String[] languages = list2.toArray(new String[list2.size()]); // or (new String[0])

        System.out.println(Arrays.toString(languages)); // [Java, Python, C#]

        System.out.println("________________________________________________");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[] n = nums.toArray(new Integer[0]);
        //   int[] n = nums.toArray(new Integer[0]); ->compiler error -> collection does not support primitive

        System.out.println(Arrays.toString(n));





    }
}
