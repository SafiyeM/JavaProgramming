package java_Live_Review.week4;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        /*
        MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word.
	 Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length)
	 or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.next();
        input.close();

        word= word.toLowerCase();
        int middleIndex= word.length() /2;
        String firstPart, middlePart, lastPart;


        if (word.length() % 2 == 0){
            // even length - 2 middle characters

            firstPart= word.substring(0, middleIndex -1);
            middlePart= word.substring(middleIndex-1, middleIndex+1);
            middlePart= middlePart.toUpperCase();
            lastPart= word.substring(middleIndex+1);

        }else{
            // odd length - 1 middle characters

            firstPart= word.substring(0, middleIndex);
            middlePart= "" + word.charAt(middleIndex);

            middlePart = middlePart.toUpperCase();// word.substring(middleIndex, middleIndex + 1)
            lastPart= word.substring(middleIndex+1);

        }
        System.out.println(firstPart + middlePart + lastPart);

        // abcde --> c - index 2 | 5/2 = 2

        // abc -> b - index 1 | 3 / 2 = 1

        // java | 4 / 2 = 2








    }
}
