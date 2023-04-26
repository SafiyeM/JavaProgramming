package java_programming_lessons.day20_forEachLoop;

import java_programming_lessons.utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str= "Cydeo School";

        char[] ch= str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch)); // [C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("__________________________________");

        String str2= "Today is a great day to learn Java";

       String[] words=  str2.split(" ");

        System.out.println(Arrays.toString(words)); //[Today, is, a, great, day, to, learn, Java] 8 Array Elements


        System.out.println("_______________________________________");



        String sentence= "I love Java";
        sentence.split(" ");  // [I, love, Java]

       String[] arr= ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr)); // [Java, love, I]

        String reversedSentence = ""; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }


        System.out.println(reversedSentence); // Java love I







    }
}
