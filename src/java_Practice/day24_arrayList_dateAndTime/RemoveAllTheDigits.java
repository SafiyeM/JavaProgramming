package java_Practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllTheDigits {


    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        //or: list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> Character.isDigit(p));  //This lambda expression tests each element(p) of the list
        // to see if it is not a digit.

        System.out.println(list);


    }
}
/*
2. Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops

 */