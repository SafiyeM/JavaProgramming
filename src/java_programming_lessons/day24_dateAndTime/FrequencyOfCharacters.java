package java_programming_lessons.day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str= "aaabbbbccccc";

        String result= "";


       String[] str1 = str.split("");  // split to convert String to String Array

        for (String each : str1) {
           int frequency = Collections.frequency(Arrays.asList(str1),each);   // since str1 is not Collection we need to call Arrays.asList

            if(!result.contains(each)){         // this if condition is used in order to avoid the duplication of character, not aaa3 instead a3
                result+= each + frequency;
            }


        }

        System.out.println(result);






    }




}
