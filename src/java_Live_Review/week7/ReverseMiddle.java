package java_Live_Review.week7;

import java.util.Arrays;

public class ReverseMiddle {
    public static void main(String[] args) {

String str= "more java please";

String[] eachword= str.split(" ");

     //   System.out.println(Arrays.toString(eachword));
       // System.out.println(Arrays.toString(eachword).replace(",", "").replace("[","").replace("]",""));

        String reverse= "";

     for (int i= eachword[1].length() -1; i>= 0; i--){ // eachWord[1] is the middle word
         reverse+= eachword[1].charAt(i); // eachword[1] is always the middle word,  so we are doing charAt(i) on that value.
         //The charAt(i) reads the characters of the middle word backwords.

     }

        System.out.println(eachword[0] + " "+ reverse + " "+ eachword[2]); // more avaj please


    }
}
/*
ReverseMiddle [array, String, loop]

	Create a program that will have a String consisting of three words.
	 Print the String, but the middle word should be reversed

	Ex:
		input: more java please
		ouput: more avaj please

 */