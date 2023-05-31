package java_programming_lessons.day41_maps;

import java_programming_lessons.day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        // object type has been specified List of Integer -> nested List - List of List (NOT multidimensional list)
        List<List<Integer>> lists = new ArrayList<>();
        //non-primitive(object)

        // List<List<int>> list -> Collection does not support primitives (we can not use it in this way) X
        // List<List<int[]>> list -> List of Array -> Array supports primitive -> this list can contain int Array object ✓
        // List<List<Queue<Integer>> list -> List of Queue -> List supports to use in this way ✓

        // lists.addAll(Arrays.asList(list1, list2)); -> we can use instead addAll only add() ✓
        // 'lists' object accepts only List objects now
        // whatever we store into this 'lists', it has to have Is A Relationship with the object type
        //  we specified within the diamond <> operator  -> List<Integer>


        lists.add(list1); //  add(List<Integer> object)
        lists.add(list2);

        System.out.println(lists); // [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]] -> we stored 2 list objects
        // index of lists                     0          ,         1

        //we want to get 10 -> so get first second obj. then 4th element of the second obj.

                               // index          3
        // this get(1) first list2 -> [7, 8, 9, 10, 11]
        System.out.println(lists.get(1).get(3)); // 10
        // ArrayList object has index number

        // if we need to iterate List of List, we can use for each loop

        // in this ArrayList each object is List of Integer
        //data type List of Integer
        for( List<Integer>     eachList:  lists ){  //  gets each list
            for (Integer eachElement : eachList) {  // gets each element
                System.out.print(eachElement); // 1234567891011
            }
        }
        System.out.println();

        System.out.println("__________________________________________________________");

        // the specified type Set<Integer>
        List<Set<Integer>> listOfSet = new ArrayList<>();
        // it is allowed to store only the Set objects in listOfSet
        listOfSet.add(new LinkedHashSet<>());   // we need to add set objects (if order matters, we use LinkedHasSet obj)
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        // we stored 4 Set object -> size is 4 now

        System.out.println(listOfSet); // [[], [], [], []]

        //{10, 5, 20} we want to add this set into the first set of listOfSet object  [[],       [],      [],        []]
                                                                        // Set         0          1        2          3

        // first we need to get the first set object
        // to get the first set object, we use get() method (Note: if we want to retrieve anything from the Collection we use get())
        // then add() method
        listOfSet.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        System.out.println(listOfSet);  // [[10, 5, 20], [], [], []]  // duplicates are not allowed

        listOfSet.get(1).addAll(Arrays.asList(30, 15, 30));
        listOfSet.get(2).addAll(Arrays.asList(300, 150, 40, 90));
        listOfSet.get(3).addAll(Arrays.asList(1000, 3, 40, 55));

        System.out.println(listOfSet); // [[10, 5, 20], [30, 15], [300, 150, 40, 90], [1000, 3, 40, 55]]
        // Set objects                         0            1                2                  3

        System.out.println("___________________________________________________________");

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        // List of Array -> supports primitive -> Array is object -> List support Array
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1); // add.(int[] e) -> primitive int Array
        listOfArrays.add(arr2);

        System.out.println( Arrays.toString(arr1)); // [1, 2, 3, 4]
        System.out.println( Arrays.toString(arr2)); // [5, 6, 7, 8, 9, 10]

        // first get Array, then inside the square brackets [] we assigned 35 to the specified index number[2]
        listOfArrays.get(0)[2] = 35;
        System.out.println(Arrays.toString( listOfArrays.get(0))); // [1, 2, 35, 4] -> 3 updated to 35


        System.out.println("___________________________________________________________");

        // we can store List object that contains Employee objects
        List<List<Employee>>  teams = new ArrayList<>();

        // List<int[][]> list = new ArrayList<>(); // List of multidimensional Array ✓


    }
}
