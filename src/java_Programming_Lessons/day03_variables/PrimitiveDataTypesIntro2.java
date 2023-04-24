package java_Programming_Lessons.day03_variables;

public class PrimitiveDataTypesIntro2 {


    public static void main(String[] args) {

        //Datatype variableName = data; // our variable declaration syntax

        char a = 'Q';
        System.out.println(a);
        char b = '!';
        System.out.println(b);

        //char c= 'ab'; // compiler error- char only accepts single character

        System.out.println("--------------------------------------------");

        char ch1= 'A'; // The range of the char (Unicode value) from 0 to 65,535
        System.out.println(ch1); // it gives A on the console

        char ch2= 65;            //if we assign the number to the char, we get the single character from Unicodes-Ascii table
        System.out.println(ch2); // it gives A on the console,
                                 // because it(65) is the corresponding number for A on the Ascii table

        System.out.println("--------------------------------------------");


        //char ch3= 85000; // compiler error- It is out of range of char unicode values
                           /*
                           The number we assign should be within the range of char data type
                           from 0 to 65,535.
                           Ascii table has a range from 0 to 127.
                           What if the number that we give out of Ascii table's range?
                           Even if the characters out of the Ascii table's range, the characters can still be assigned
                           char variable because char data type support the characters within the range from 0 to 65.535.
                           If the number we assign is bigger than 127 that the character is not from the Ascii table,
                           we will still get different character out of Ascii table. See the example below.

                            */

        char ch4= 40000;  // it is within the range of char
        System.out.println(ch4);// 鱀 --> we get a character or symbol from other languages

        System.out.println("--------------------------------------------");

        int sum = 'A' + 'B'; // we can also assign the char characters to the int
        System.out.println(sum); // it prints 131 because each character has corresponding number.
                                  /* From the Ascii table the corresponding number of A is 65 and
                                  the number of B is 66, so A+B ==> 65 + 66 = 131.

                                     */

        System.out.println("--------------------------------------------");

        // boolean variable is only for true or false answer
        // boolean r1= 123; // we can not assign integer to boolean variable
        // boolean r2= 2.5; // we can not assign also decimal numbers
        // boolean r3= "Java"; // we can not assign also String of text to boolean

        boolean r4= true; // true and false are the both keywords we could assign to boolean
        boolean r5= false;
        boolean r6= 100 > 10; //  the evaluation is true
        boolean r7= 0 < -1; //    the evaluation is false
                             /*
                             If we do not assign the both true and false keywords directly, we can also assign
                             expressions that can be either evaluated true or false.
                              */
        System.out.println(r6); // true
        System.out.println(r7); // false













    }
}
