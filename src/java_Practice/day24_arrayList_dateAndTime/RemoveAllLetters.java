package java_Practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLetters {


    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> Character.isLetter(p));   // list.removeIf(Character::isLetter); -> lambda can be replaced with method reference

        System.out.println(list);


    }
}
/*

3. Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */