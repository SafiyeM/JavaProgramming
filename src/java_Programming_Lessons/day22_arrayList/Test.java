package java_Programming_Lessons.day22_arrayList;

import java_Programming_Lessons.utilities.ArraysUtility;

public class Test {


    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.println(ArraysUtility.contains(numbers, 25));

        boolean has20 = ArraysUtility.contains(numbers, 20);
        System.out.println(has20);


        System.out.println("____________________________________________");


        String[] students = {"Nalan", "Mina", "Hamide"};

        System.out.println(ArraysUtility.contains(students, "Mina"));

        boolean hasLina = ArraysUtility.contains(students, "Lina");
        System.out.println(hasLina);


    }
}
