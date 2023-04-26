package java_practice.day14_forLoop;

public class SumOfDigits {
    public static void main(String[] args) {

        /*
        6. Write a program that can return the sum of digits from a string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
         */


        String str= "A1B2C3";          //length is 6 --> in Ascii value of 6 --> 54

        int sum= 0;

        for (int i = 0; i < str.length(); i++) {   // in Ascii value of 0 --> 48
           char ch = str.charAt(i);
        if (ch >= '0' && ch <= '9'){
            sum += ch - 48;            //  ---->    54 - 48 = 6

        }
        }

        System.out.println(sum);       // --> 6











    }
}
