package java_Programming_Lessons.day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = ""; // b & d are determined as unique and stored in this variable

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);


            if(str.indexOf(each) == str.lastIndexOf(each)  ){ // -> 1. condition determines: (each) ch first time appeared in the string
                unique += each;                               // -> 2. condition determines: this ch is unique, if it is not equal to 1. condition
            }


        }


        System.out.println(unique);

    }
}
/*

Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */