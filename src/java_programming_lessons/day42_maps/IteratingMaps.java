package java_programming_lessons.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {


    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();  // insertion order, accepts null key & null value
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map); // {Daniel=95000, Emily=100000, Bella=85000, Jimmy=78000, Breanna=98000}

        // Iterating the map by the keys ONLY
        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);
            // another way of iterating the map by keys with forEach() method and lambda expression inside as a parameter
            // map.keySet().forEach(eachKey -> System.out.println(eachKey));

            /* Each key output:
            Daniel
            Emily
            Bella
            Jimmy
            Breanna
             */
            // two ways to update a Map:
            //                         with put() method -> updates existing key's value
            //                         replace() method -> locates the key and update it's value(better way)
            //                   current value * by 2 -> in order to replace the doubled salary
            // map.replace(eachKey, map.get(eachKey) * 2);
        }

        System.out.println(map); // {Daniel=190000, Emily=200000, Bella=170000, Jimmy=156000, Breanna=196000}


        System.out.println("______________________________________________________");

        // Iterating the map by value ONLY
        // return type of value() Collection -> the size dynamic and has many methods we can use
        // once we got the Collection, we can apply for each loop for this Collection
        for (Integer eachValue : map.values()) {  // to get each value from the Map
            System.out.println(eachValue);

            /* Each value output:
            95000
            100000
            85000
            78000
            98000
             */
        }
        System.out.println("______________________________________________________");

        // Iterating the map by entries/pairs ONLY
        // Entry<> is inner interface of Map Interface     // entrySet() returns entries
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            //          key     value
            System.out.println(eachEntry);

            /* Each Entry output:
            Daniel=95000
            Emily=100000
            Bella=85000
            Jimmy=78000
            Breanna=98000
                */
        }

        System.out.println("______________________________________________________");


        // once we have the entry, and want to call keys and values separately, we can call getKey() method

        for ( Map.Entry<String, Integer>  eachEntry  :  map.entrySet() ){
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000); // added 10_000 for each value

            System.out.println(eachKey + " : " + eachValue);
        }


        System.out.println(map); // New Values-> {Daniel=105000, Emily=110000, Bella=95000, Jimmy=88000, Breanna=108000}
    }
}
