package java_Programming_Lessons.day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255); // placed to the index 3 and 400 shifted index 4

        // numbers.add(300, 2000); -> indexOutOfBounds

        System.out.println(numbers);  // [100, 200, 300, 255, 400, 500]

        System.out.println("_________________________________");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("___________________________________");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        for (Integer each : numbers) {
            System.out.println(each);
        }
        System.out.println("___________________________________");




    }
}
