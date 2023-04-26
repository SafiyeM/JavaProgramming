package java_live_review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(5);
        list2.add(10);

        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(list2); // this creates a new ArrayList with the same elements as list2
        System.out.println(list3);

        list3.add(0, 100);

        ArrayList<Integer> list4 = list3; // this is a new reference that points to the same object as list3


        System.out.println("______________________________________");

        System.out.println(list2); // [3, 5, 10]
        System.out.println(list3); // [100, 3, 5, 10]
        System.out.println(list4); // [100, 3, 5, 10]

        System.out.println("______________________________________");


        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));














    }
}
