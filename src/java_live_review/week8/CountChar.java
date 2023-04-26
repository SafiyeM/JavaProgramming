package java_live_review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {


    public static void main(String[] args) {



        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        System.out.println(countCharInList(list, 'a')); // 6
        System.out.println(countCharInList(list, 's')); // 4
        System.out.println(countCharInList(list, 'j')); // 3




    }

    public static int countCharInList(ArrayList<String> list, char letter) {

        int count = 0;
        for (String eachWord : list) {

            for (char eachLetter : eachWord.toCharArray()) { // iterates through each character of the String elements
                if (eachLetter == letter) {
                    count++;
                }
            }
        }
        return count;
    }
/*
    CountChar [ArrayList, String, loop]

    Create a program that defines an ArrayList of Strings and a char letter. Find how many times the given char letter is found in the words defined in the ArrayList

        Ex:
        Input:
            "java", "html", "css", "java", "javascript", "selenium"
            letter: ‘a’
        Output:
            6
     */


}
