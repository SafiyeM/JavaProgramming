package java_programming_lessons.day16_nestedLoop;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        String str= "aabbbcccc";
        char ch= 'c';

        int count= 0;

        for (int i = 0; i <str.length() ; i++) { // index numbers of str


            /*to find the characters of the string--> From the str we call charAt method
            and then pass the index number i
             */
            if (str.charAt(i) == ch){          // if character of the string is matching with given ch
                count ++;                      //every time loops gets executed and this condition
            }                                 //is true, that means this ch has appeared in the str
                                              // so we need to count how many times this ch appeared.
                                             //The only time count will be increased is when the given ch
                                             // is matching with given string ->str.charAt(i)


        }
        System.out.println(count); // it gives the total appearance of 'c' //4 times


    }
}
/*
2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */