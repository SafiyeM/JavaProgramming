package java_Practice.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveTheNames {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));


        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);



    }
}
/*
2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

 */