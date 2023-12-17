package java_Practice.day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("Enter a string");
        String str= input.nextLine().toLowerCase();

        System.out.println("Enter a char");
        char ch= input.next().toLowerCase().charAt(0);
        
        int frequency= 0;

        for (int i = 0; i < str.length(); i++) {
            char each= str.charAt(i);

            if (each == ch){
               frequency ++;
            }


        }

        System.out.println(frequency);



input.close();
    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
 the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */