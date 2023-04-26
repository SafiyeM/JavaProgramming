package java_programming_lessons.day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = ""; // it is now a temporary result but it will hold then "abc" value

        /*
        The loop we created gets us every single character of the String, and then it will add
        the characters into the new String result, under the condition if the character
        is not included in the new result String yet.
         */

        for (int i = 0; i < str.length(); i++) { // i --> is now assigned as all index numbers of the given str
            //starting from 0 till last index
            //  (< str.length() means -->last index)


            char each = str.charAt(i); // each character of the String str


            if (!result.contains("" + each)) { // if the String result does NOT contain the character of String str yet
                result += each; //then we will add the character to string result
            }

        }

        System.out.println("result = " + result);


    }
}
/*
3. Write a program that can remove the duplicated characters from the string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */