package java_programming_lessons.day41_maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {


        // Collections supports Array objects
        // Array also supports Collection objects

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));


        /*
        If we want to add the objects above into an Array,
        our data type of Array needs to be a List<>[] (the [] indicates that this is an Array)
         */

        // in the Array we can store the List of Integer object
        List<Integer>[] arrayOfLists = new List[3]; // the size of the List Array is 3
        arrayOfLists[0] = list1; // set the objects to the index of List Array one by one
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        // single dimensional Array is printed through toString method
        System.out.println(Arrays.toString(arrayOfLists)); // [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]
        // This is an Array that contains List objects

        arrayOfLists[0].set(4, 50);    // index of List objects  0  1  2  3   4  5
        System.out.println(Arrays.toString(arrayOfLists));  // [[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]
                                       // Index of Array objects         0                    1                  2

        // We can only store Set objects into the Set Array object
        Set<Integer>[] arrayOfSet = new Set[5]; // the size of the Set Array is 5 ,

        arrayOfSet[0] = new LinkedHashSet<>();
        arrayOfSet[1] = new LinkedHashSet<>();
        arrayOfSet[2] = new LinkedHashSet<>();
        arrayOfSet[3] = new LinkedHashSet<>();
        arrayOfSet[4] = new LinkedHashSet<>();
        // arrayOfSet[5] = new ArrayList<>(); -> compile error we can not store ArrayList object into the Array
        // because this Array we created only accepts Set data type, and ArrayList does not have relationship with Set

        arrayOfSet[2].addAll(Arrays.asList(1,2,3,4));
        System.out.println(Arrays.toString(arrayOfSet)); // [[], [], [1, 2, 3, 4], [], []]
                                                // added elements in the third Set

















    }
}
