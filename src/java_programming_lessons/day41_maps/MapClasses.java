package java_programming_lessons.day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        // HasMap:
        //       implements Map interface
        //       maintains random order
        //       accepts one null value as a key (key can not be duplicated)

      //     key     value
        Map<String, Integer> hashMap = new HashMap<>();        // random order, accept null key & null value
        hashMap.put("Daniel", 95000);
        System.out.println(hashMap); // {Daniel=95000} -> size of the map is 1(first pair)

        hashMap.put("Emily", 100000); // second pair
        hashMap.put("Bella", 85000); // third pair
        System.out.println(hashMap); // {Emily=100000, Daniel=95000, Bella=85000} HashMap-> random order
      /*
        map1.put("Daniel", 100000);
        map1.put("Daniel", 85000);
        map1.put("Daniel", 75000); // put() method can update the value of the key, if the key is already existed

        System.out.println(map1); // {Emily=100000, Daniel=75000, Bella=85000} -> no duplication of key, printed last pair we added
       */
        hashMap.put("Aaron", 78000);
        System.out.println("hashMap = " + hashMap); // hashMap = {Aaron=78000, Emily=100000, Daniel=95000, Bella=85000}-> not insertion order

        hashMap.put("Chris", null);
        System.out.println(hashMap); // {Aaron=78000, Emily=100000, Chris=null, Daniel=95000, Bella=85000} -> null accepted as a value

        hashMap.put(null, 120000);
        System.out.println(hashMap); // {Aaron=78000, null=120000, Emily=100000, Chris=null, Daniel=95000, Bella=85000} -> null accepted as a key & value

        hashMap.put(null, 100000);
        hashMap.put(null, 90000);
        hashMap.put(null, 85000);

        // only one null key accepted, the last updated one
        System.out.println(hashMap); // {Aaron=78000, null=85000, Emily=100000, Chris=null, Daniel=95000, Bella=85000}


        System.out.println("______________________________________________________________");


        // LinkedHashMap:
        //               child class of HashMap
        //               maintains the insertion order
        //               accepts one null value as a key (key can not be duplicated)

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();  // insertion order, accepts null key & null value
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap); // linkedHashMap = {Daniel=95000, Emily=100000, Bella=85000,
                                                                // Arron=78000, Chris=null, Breanna=null, null=100000}

        System.out.println("--------------------------------------------------------------------");

        // TreeMap:
        //        implements the SortedMap interface
        //        maintains the (key) sorted order (ascending)
        //        does not accept null as a key (but allows null value)

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); // value can be null in treeMap
        // treeMap.put(null, 120000); key can not be null in treeMap -> NullPointerException
        // treeMap.put(null, 110000);
        // treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap); // treeMap = {Arron=78000, Bella=85000, Breanna=null,
                                                              // Chris=null, Daniel=95000, Emily=100000} -> ascending order

        System.out.println("--------------------------------------------------------------------");

        // Hashtable:
        //           implements Map Interface
        //           maintains the random order
        //           does not accept null as a key & value
        //           synchronized(Thread-Safe) -> one at a time

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key & null values, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); Value in Hashtable can not be null
        // hashtable.put("Breanna", null); Value in Hashtable can not be null
        // hashtable.put(null, 120000); Key in Hashtable can not be null
        // hashtable.put(null, 110000); Key in Hashtable can not be null

        try {
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashtable = " + hashtable); // hashtable = {Arron=78000, Daniel=95000, Diana=100000, Emily=100000, Bella=85000}



    }
}
