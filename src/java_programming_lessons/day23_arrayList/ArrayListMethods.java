package java_programming_lessons.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));


        System.out.println("_________________________________");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("paper towels");
        groceryList.add("Apples");
        groceryList.add("Olive oil");

        System.out.println(groceryList); // [Eggs, paper towels, Apples, Olive oil]


        groceryList.set(2, "Oranges"); // [Eggs, paper towels, Oranges, Olive oil]

        System.out.println(groceryList);

        groceryList.add(2, "Chicken");

        System.out.println(groceryList); // [Eggs, paper towels, Chicken, Oranges, Olive oil] Oranges shift to the right

        groceryList.remove(0); // Eggs will be removed

        System.out.println(groceryList); // [paper towels, Chicken, Oranges, Olive oil]

        groceryList.remove("paper towels");

        System.out.println(groceryList); // [Chicken, Oranges, Olive oil]

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove(Integer.valueOf(10)); // we convert primitive into object using value method and object will be removed

        System.out.println(numbers); // [20, 30, 40, 50]
        System.out.println(r1); // true

        numbers.clear();

        System.out.println(numbers); // []
        System.out.println(numbers.size()); // 0

        System.out.println("_________________________________");


        ArrayList<String> names = new ArrayList<>();

        names.add("Lena");
        names.add("Max");
        names.add("Valentina");
        names.add("Gretcher");
        names.add("Nina");
        names.add("Mina");
        names.add("Max");
        names.add("Max");

        System.out.println(names.indexOf("Nina")); // 4
        System.out.println(names.lastIndexOf("Max")); // 7

        System.out.println(names.lastIndexOf("Max"));  // 7


        boolean hasMuhtar = names.contains("Muhtar"); // false

        boolean hasMina = names.contains("Mina"); // true


        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasMina = " + hasMina);


        System.out.println("________________________________________");

        // two different reference name sharing the same object

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1); // [10]
        System.out.println(list2); // [10]


        System.out.println(list1 == list2); // true ->  both referencing the same object

        System.out.println("___________________________________________");


        // two different objects, have same elements in the same order, but they do not share

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1); // [10]
        System.out.println(l2); // [10]

        System.out.println(l1 == l2); // false -> Not same object -> they are allocated in two different locations


        System.out.println(l1.equals(l2)); //  true -> if they are having the same elements in the same order, they are equal


        System.out.println("_______________________________________");

        // They both the same elements but not in the same order

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);


        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);


        System.out.println(n1.equals(n2)); // false -> Not in the same order


        System.out.println(n1.isEmpty()); // false -> has elements, not empty
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true -> it is empty now after clean method
        System.out.println(n2.isEmpty());


    }
}
