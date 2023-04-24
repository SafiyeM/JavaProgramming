package java_Practice.day11_string;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        /*
        5. Create a class named CombineWords.
        Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
     print that character once.

                Input:
                    one
                    eight
                Output:

         */
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord= input.next();

        System.out.println("Enter second word:");
        String secondWord= input.next();


        String result = "";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){
            result = firstWord+ secondWord.substring(1);
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);




        // another practice

        System.out.println("__________________________________--");

        String word1= input.next(); // Java
        String word2= input.next(); // avan

        if (word1.charAt(word1.length()-1) == word2.charAt(0)){ // Eger word1 in ilk kelimesinin son harfi word2 nin ilk harfi ile
            System.out.println(word1+word2.substring(1)); // esitse, ikisini birlestir ve word2 yi
        }


/*
        System.out.println(firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0));

        // firstWord.charAt(firstWord.length()-1) --> if the last letter of the first word

       // == secondWord.charAt(0) -->  equal to the last letter of second word

        System.out.println(firstWord+secondWord);


 */



    }
}
