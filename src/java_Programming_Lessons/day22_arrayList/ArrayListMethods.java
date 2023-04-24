package java_Programming_Lessons.day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        //--------Methods -> add - get - size--------//


        ArrayList<Integer> list = new ArrayList<>();
// advantage of list is always ordered so every element we added they all follow the index order

        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3     -> arrayList accepts duplicates

        System.out.println(list); // [10, 20, 30, 10]


        list.add(1, 15); //-> now 20 is shifted to the right and 15 is replaced to instead of 20 into the index of 1

        System.out.println(list); // [10, 15, 20, 30, 10]

        list.add(2, 25);

        System.out.println(list);  // [10, 15, 25, 20, 30, 10] so 20 shift to the right and 25 is replaced to its place


        System.out.println("___________________________________________________");


        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Emily");
        studentList.add("Laura");
        studentList.add("Maxima");
        studentList.add("Lina");

        System.out.println(studentList.size()); // 4 Elements
        System.out.println(studentList);        // [Emily, Laura, Maxima, Lina]
                                // index number:      0      1       2      3


        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get(studentList.size() - 1);

        System.out.println("firstStudent = " + firstStudent); // firstStudent = Emily
        System.out.println("lastStudent = " + lastStudent);   // lastStudent = Lina


    }
}
