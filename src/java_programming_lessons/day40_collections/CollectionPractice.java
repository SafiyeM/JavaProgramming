package java_programming_lessons.day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        // List(parent) ref type -> there IS A RELATION between ref type and obj. type (Polymorphism)
        // ref type         =     obj type
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        //List<Integer> list = new HashSet<>();
        // List can not be reference type of Set Classes (No Relation between List & Set)

        // Collection is parent of Link and Set (Is A Relation), can be reference type for both
        Collection<Integer> list5 = new HashSet<>();

        // Collection methods:
        // size(), isEmpty(), add(), addAll(), remove(), removeAll(), removeIf(), contains(), containsAll(), retainAll(), clear(), toArray()
        // we can only use these methods with the reference type of the Collection Interface

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        // List accepts duplicates
        collection.addAll(Arrays.asList(100, 200, 300, 200, 400, 400, 500, 600, 700));

        System.out.println(collection); // [100, 100, 200, 300, 200, 400, 400, 500, 600, 700]

        // Collection does not have get() method (But Is A Relation with ArrayList, so we can down cast)
        System.out.println(((ArrayList) collection).get(2)); // 200 -> in order to use get() method of ArrayList,
        // we need to make down-casting (casting from super to sub)
        // after down-casting is completed, we call the get() method


        // 'collection' is referencing to the ArrayList object and ArrayList cannot be cast to Stack
        // Stack is the Child of Vector (type of list)
        //System.out.println( ((Stack)collection).pop() ); -> no compile/checked error but unchecked exception -> ClassCastException (No relation between ArrayList & Stack)

        System.out.println("_____________________________________________");

        // Collection can be reference type of Set (Is A Relation)
        Collection<Integer> collection2 = new HashSet<>();        // random order
        Collection<Integer> collection3 = new LinkedHashSet<>();  // insertion order
        Collection<Integer> collection4 = new TreeSet<>();        // sorted order

        // addAll() method is in Collection interface
        // The use of Arrays.asList helps in quickly initializing the list of Integers before adding them to the HashSet
        collection2.addAll(Arrays.asList(100, 200, 300, 200, 400, 400, 500, 600, 700));

        System.out.println(collection2); // [400, 100, 500, 200, 600, 300, 700] -> random order, no duplicates (Hashset)

        // we can not cast the HashSet to ArrayList
       // System.out.println( ((ArrayList)collection2).get(4) ); -> ClassCastException (NO 'IS RELATION' between ArrayList & HashSet)

        // If we want to CONVERT one Collection type to another, even though they do not have 'IS RELATION',  we have to use the
        // CONSTRUCTOR

        // We use ArrayList' Constructor to convert the HashSet to ArrayList
        // Constructor takes Collection as an argument, since 'collection2' ref type is a Collection, we can convert it to ArrayList
        // without getting any ClassCastException when it creates a new object.

        // (this obj is only for one use, not reassigned to a ref variable, and after using will be eligible for Garbage Collection)
        System.out.println(new ArrayList<>(collection2).get(4)); // [400, 100, 500, 200, 600, 300, 700]

        // if we want to use it more than once, we should assign it to a reference variable
        List<Integer> list = new ArrayList<>(collection2); // now we can constantly use ArrayList Obj, which has the same Elements as HashSet






    }
}
