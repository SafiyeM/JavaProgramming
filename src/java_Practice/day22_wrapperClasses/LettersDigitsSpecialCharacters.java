package java_Practice.day22_wrapperClasses;


import java.util.Arrays;

public class LettersDigitsSpecialCharacters {


    public static void main(String[] args) {


        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialCharacters = "";


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isLetter(each)) {
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {                         // or: else if(!Character.isLetterOrDigit(each))
                specialCharacters += each;
            }

        }


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);


        System.out.println("____________________________________________________________________");

        // Group Solution:
        char[] chars = str.toCharArray(); // String to char[]

        System.out.println(Arrays.toString(chars)); //[W, o, o, d, e, n,  , S, p, o, o, n,!]

        String letter = ""; //Woo
        String digits2 = "";
        String specialChars = "";
/*
                        #1   Old Version

        for (char ch : chars) {
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letter += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                specialChars += ch;
            }
        }*/

        //    #2 New Version ( Wrapper classes methods (Character))

        for (char ch : chars) { //W
            if (Character.isLetter(ch)) {
                letter += ch;
            } else if (Character.isDigit(ch)) {
                digits2 += ch;
            } else { //#2 alternative of else : else if(!Character.isLetterOrDigit(ch))
                specialChars += ch;
            }
        }

        System.out.println("letter = \"" + letter + "\"");
        System.out.println("digits = \"" + digits2 + "\"");
        System.out.println("specialChars = \"" + specialChars + "\"");





    }


}

/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

 */