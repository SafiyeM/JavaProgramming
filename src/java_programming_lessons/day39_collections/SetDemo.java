package java_programming_lessons.day39_collections;

import java.util.*;

public class SetDemo {


    public static void main(String[] args) {


        // Duplicates are allowed
        // order is preserved
        List<Integer> list = new ArrayList<>();  // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(list); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println("________________________________");

        //__________________________ Set Interface __________________________//
        // (I)-> Interface
        // (C)-> Class

        // Set(I):
        //     Child interface of Collection
        //     Duplicates are not allowed
        //     Insertion order not preserved
        //     Does not have index


        //HasSet(C):
        //       Duplicates are not allowed!
        //       Order is random (not maintaining order)
        //       Performance is faster than other sets
        //       Accepts null keyword
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(set1); // [200, 40, 10, 90, 300]
        set1.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set1); // [null, 200, 40, 10, 90, 300]

        System.out.println("________________________________");


        // LinkedHashSet(C):
        //               extends HasSet (child class of HashSet)
        //               Duplicates are not allowed!
        //               Keeps insertion order
        //               Accepts null keyword
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2); // [10, 200, 300, 40, 90, null]

        System.out.println("----------------------------------------");


        String str = null;
        // System.out.println(str.toLowerCase());  NullPointerException

        // TreeSet(C):
        //          Keeps sorted order
        //          Does not accept duplicate
        //          Null is not allowed
        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //  set3.addAll(Arrays.asList(null, null, null, null, null)); NullPointerException

        System.out.println(set3); // [10, 40, 90, 200, 300]


        System.out.println("----------------------------------------");


        // None of the Set has index numbers, we can not use get() method to get elements
        // Once we remove the duplicates from List or from Array by using the Set, the only way to retrieve the elements
        // will be through the iteration (for each loop), or we have to convert the Set to the List


        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        // We want to remove the duplicates words in Array.
        // If the order does not matter, we can use HashSet.
        // But if the order matters, then we can use LinkedHashSet
        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words)); // we add the Array into the LinkedHashSet to remove the duplicates

        System.out.println(result); // [Java, Python, C#, C++, Ruby]


        /*
        System.out.println(result.get(1)); -> Set does not have index number, we can not use get() method to get the second
        element of Set

       -> * To get each element of the Set we can use for each loop
        for (String each : result) {
            System.out.println(each);
        }
       -> * But instead of using for each loop, we can convert the Set to the List to use get() method of List
          */

        // in ArrayList constructor we have a constructor that takes a collection type
        // result is a collection type
        // It means that this ArrayList has all the elements that LinkedHashSet has, in the same exact order
        System.out.println(new ArrayList<>(result).get(1)); // now we can use get() method to get the second element

        words = result.toArray(new String[0]);  // converting Set to Array
        // the reason we convert is that Array is the fastest data structure

        System.out.println("Words Array : " + Arrays.toString(words)); // Words Array : [Java, Python, C#, C++, Ruby]

        System.out.println("----------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 5, 5, 5, 1, 1, 1, 2, 2, 2));

        // this constructor takes collection (numbers is List-> so it is a collection)
        Set<Integer> n = new TreeSet<>(numbers); // List to Set

        // removes the duplicate and sorted the order
        System.out.println(n); // [1, 2, 5, 10, 20, 30, 40, 50]

        // if we want to convert TreeSet 'n' back to the ArrayList 'numbers'
        // we could have a new object of ArrayList that is referenced by this list variable 'numbers' and in the constructor
        // we can pass the Set 'n' collection
        //  numbers = new ArrayList<>(n); -> this constructor takes a collection argument
        // after reassigning we have a new ArrayList


    }
}
