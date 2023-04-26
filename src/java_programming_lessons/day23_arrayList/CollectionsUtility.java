package java_programming_lessons.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list); // unboxing
        int min = Collections.min(list);


        System.out.println("max = " + max); // max = 8
        System.out.println("min = " + min); // min = 1


        System.out.println("___________________________________________");

        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice",
                "Orange", "Strawberry", "Blueberry" , "Paper towels"));

        Collections.sort(items); // sorts ascending order ( A ~ Z )

        System.out.println("items = " + items); // items = [Blueberry, Eggs, Milk, Orange, Paper towels, Potato, Rice, Strawberry, Tomato]


        System.out.println("___________________________________________");


        Collections.reverse(items); // sorts descending order (Z ~ A)

        System.out.println("items = " + items);


        System.out.println("___________________________________________");


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Mina", "Nalan", "Lina", "Sarah"));


        Collections.swap(students, 0, 1);

        System.out.println(students); // swapped index 0 to 1 [Nalan, Mina, Lina, Sarah]

        Collections.swap(students, 0, students.size()-1);

        System.out.println(students); // [Sarah, Mina, Lina, Nalan]



    }
}
