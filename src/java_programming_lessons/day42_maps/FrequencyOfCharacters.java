package java_programming_lessons.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

         //   key        value             insertion order
        Map<Character, Integer> map = new LinkedHashMap<>(); // we want to keep order the same and without duplication of the key,
                                                             // that's why characters must be key and frequency will be value

        /*
         // to be able to use the frequency() method, we need to convert the string to a Collection
            so in Collection each character of the String can be an element of the Collection
        Step 1: convert the String to an Array 'str.split("")'
        Step 2: convert the String Array to the List by calling Arrays.asList() method from Arrays utility class
        */

                         // split() -> for converting to Array
        for (String each : str.split("")) {  // we get each character

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            System.out.println(each + " : " + frequency); // b : 2  b : 2  c : 3  c : 3  c : 3 a : 5 a : 5

            // add the characters and frequencies in the map
            map.put(each.charAt(0), frequency);  // if the String has one character the string is converted to the char
        }

        System.out.println(map); // {b=2, c=3, a=5}





    }
}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */