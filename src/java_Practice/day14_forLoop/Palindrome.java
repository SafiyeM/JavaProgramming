package java_Practice.day14_forLoop;

public class Palindrome {
    public static void main(String[] args) {


        String str = "Anna";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);










    }
}
/*
7. Task
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true
         _________________________

				input:
					Anna

				output:
					true
        __________________________

 */

/* Other Approach:
        String str = "Anna";
        String reverse = "";

        int sequence = 0;
        int i = str.length() - 1;

        if (i == 3) {
        reverse += str.charAt(i);
        i--;         //i =2                                    Anna Anka

        if (i == 2) {                           //for(i =3 ; i >=0 ; i--){ reverse += str.charAt(i);   }
        reverse += str.charAt(i);
        i--;     //i=1

        if (i == 1) {
        reverse += str.charAt(i);
        i--; //i = 0

       if (i == 0) {
       reverse += str.charAt(i);
       }


                }
            }
        }


        System.out.println(reverse);

 */

        /*
                String reverse = ""; // a Reverse: annA
        for (int i = 3; i >= 0; i--) {
            reverse += str.charAt(i);
         */


/*
    boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
 */