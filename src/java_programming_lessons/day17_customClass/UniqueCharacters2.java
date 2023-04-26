package java_programming_lessons.day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {            //responsibility of outer loop -> to repeat the inner statement
                                                            // for every single indexes of string



            // inner statement
            char ch = str.charAt(j);   // a
            int frequency = 0;

            //inner loop
            for (int i = 0; i < str.length(); i++) {          // checks how many times the ch has appeared in str
                if(str.charAt(i) == ch ){                     //if the ch has appeared in the string
                    frequency++;                              // increase the frequency by 1
                }
            }
            if(frequency == 1){                              // if the frequency is one, then it's unique
                unique += ch;
            }




        } // outer loop ends


        System.out.println(unique);  //bd




    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */
