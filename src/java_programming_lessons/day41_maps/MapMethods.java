package java_programming_lessons.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println( map.size()); // 9
        System.out.println(map); // {A02=Khashayar, A03=Tatiana, A04=Tatiana, A05=Tatiana, A06=Tatiana, A07=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}

        System.out.println( map.get("A04")); // Tatiana

        map.put("A04", "Lucy");
        map.put("A06", "Madiyar");

        System.out.println(map); // {A02=Khashayar, A03=Tatiana, A04=Lucy, A05=Tatiana, A06=Madiyar, A07=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}

        System.out.println(map.get("B03")); // Nora

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");
        System.out.println(map); // {A02=Khashayar, A03=Tatiana, A04=Lucy, A05=Tatiana, A06=Madiyar, A07=Marika, B03=Nora, C02=Aseel, D02=Abidullah}

        map.remove("A05");

        System.out.println(map); // {A02=Khashayar, A03=Tatiana, A04=Lucy, A06=Madiyar, A07=Marika, B03=Nora, C02=Aseel, D02=Abidullah}


        System.out.println(map.containsKey("B03")); // true
        System.out.println( map.containsKey("H98")); // false

        System.out.println(map.containsValue("Lucy")); // true
        System.out.println(map.containsValue("Muhtar")); // false

        System.out.println(map.isEmpty()); // false
        System.out.println(map.equals(map)); // true
        map.clear();

        System.out.println(map); //{}


    }


}

/*
pair: id - name
 */

