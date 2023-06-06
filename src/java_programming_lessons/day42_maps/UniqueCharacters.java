package java_programming_lessons.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );

            if(frequency == 1)  // if the character is unique

                map. put(each.charAt(0), frequency); // If the Map's key is Character we can call it charAt() method and pass the index 0
                                                     // because this String 'each' has only one character

        }

        System.out.println(map); // {b=1, d=1, f=1}



    }

}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */