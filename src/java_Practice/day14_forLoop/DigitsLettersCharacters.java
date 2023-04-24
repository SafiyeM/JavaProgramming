package java_Practice.day14_forLoop;

public class DigitsLettersCharacters {
    public static void main(String[] args) {



        /*
        5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */


        String word="mn@'123Ab!"; // word.length 10
        // initialize a string variable called "word" to the value "mn@'123Ab!"


        String digits = "";
        String letters = "";
        String specialChars = "";
        //three empty strings to hold the results of the analysis

        for (int i = 0; i < word.length(); i++) { // if 0 < 10 then add by one and prints 10 times.
                                                  // Begin to evaluate from first character and adds each time other by one.

            char ch= word.charAt(i); // we use ch to analyse each character of our String


            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }

            }

            System.out.println("digits = " + digits);
            System.out.println("letters = " + letters);
            System.out.println("specialChars = " + specialChars);







    }
}
}
