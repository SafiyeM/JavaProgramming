package java_programming_lessons.day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {


    public static void main(String[] args) {

        //  Id(key)   name(value)
        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");


        // Id(key)   name(value)
        Map<String, String> employees = new TreeMap<>();
        // add one Map into another -> putAll()
        employees.putAll(map);


        System.out.println(employees);

        System.out.println(map == employees);// -> false, they are two different objects, they have two different memory allocations
        System.out.println(map.equals(employees)); // -> it compares every pair between the maps




    }
}
