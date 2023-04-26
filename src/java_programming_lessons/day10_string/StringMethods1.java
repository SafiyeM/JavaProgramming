package java_programming_lessons.day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str= "Cydeo";
        // index   : 01234

       // int strlength= str.length(); ==> str length = 5


        char firstChar= str.charAt(0);  // C
        char secondChar= str.charAt(1); // y
        char thirdChar= str.charAt(2);  // d
        char fourthChar= str.charAt(3); // e
        char fifthChar= str.charAt(4);  // o



        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("____________________________________");

        String sentence= "Java Programming Language";

        int length= sentence.length(); // 25

        System.out.println("length = " + length);

        int lastIndex= length-1; //to calculate the last index

        System.out.println("lastIndex = " + lastIndex); // 24


        System.out.println("____________________________________");


        String s1= "Java is the best programming language";
        char firstCh= s1.charAt(0); // to find the first char 'J'

        int lastIndexNum= s1.length() - 1; // length method calculate all the characters and if we want to learn
                                         // the last characters we subtract 1 from length
        char l= s1.charAt(lastIndexNum); // and assign the lastIndexNum to char to print the last character

        System.out.println(firstCh+" : " + l);


        System.out.println("____________________________________");


        String name1= "Javac";
        String name2= new String("Javac"); // this is now a new String value, even the texts are identical
                                                   // it is stored in the heap memory as a new object

        System.out.println(name1 == name2); // false    // reference is not same
        //
        System.out.println(name1.equals(name2)); //true    // the String of text are same

        System.out.println("____________________________________");

        String r1= "Java";   // They are all the same object. Therefor they are all stored in the String pool
        String r2= "Java";   // in heap memory. It will only one "Java" object created.
                             //  They are referencing to the same object

        String r3= new String("Java"); // we have now the same literal but not the same object with r1 & r2
        // it is stored in the heap memory as a new object out of the String pool.


        System.out.println(r1==r2); //true
        System.out.println("r1 == r2 is" + r1==r2); //false  //!!! if we have a String in print statement then it turns false!!!
        System.out.println(r1==r3); //false
        System.out.println(r2 ==r3); //false

        System.out.println( r1.equals(r3)); // now it is true because we compare the texts not the objects
        System.out.println(r2.equals(r3));  // true


        System.out.println("_________________________________________________");






        Scanner input= new Scanner(System.in);

        System.out.println("How old are you?");
        int age= input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer= input.next();

        if (age >=21 && answer.equals("yes") ){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }






input.close();
    }
}
