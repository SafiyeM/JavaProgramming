package java_practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfFirstAndLastCharacterSame {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

       list.removeIf(p-> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
       System.out.println(list); // [Canada, Lan, Ebrahim, Farida]

        System.out.println("____________________________");

        // Or :
        list.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length() - 1)); // p.length() > 1 && -> we can add this condition, too.
        System.out.println(list); // [Canada, Lan, Ebrahim, Farida]

        /*
       the lambda expression checks if the length of the string(p) is greater than 1
        and if the first and last characters of the string are the same.
        If both conditions are true, the lambda expression returns true,
        and the element is removed from the list.
         */




    }
}
/*
7. Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
 */