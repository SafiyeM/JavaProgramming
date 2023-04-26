package java_programming_lessons.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // list1.addAll(numbers); // we add all the elements from the ArrayList collection "numbers" to another list1

        // System.out.println(list1); // [1, 2, 3, 10, 20, 30, 40]


        list1.addAll(1, numbers);

        System.out.println(list1); // [1, 10, 20, 30, 40, 2, 3] -> so we inserted elements of numbers list beginning from index 1,
        // the original element of index 1 shifted to the right

        System.out.println("_______________________________________________");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores); // [75, 85, 95, 70, 80]


        System.out.println("_______________________________________________");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Mina", "Nalan", "Lina", "Sarah"));


        System.out.println(students);

        students.addAll(2, Arrays.asList("Adriana", "Anna"));

        System.out.println(students); // [Mina, Nalan, Adriana, Anna, Lina, Sarah] -> we added two elements starting from index 2
        // and original element at index 2 shifted to right


        System.out.println("_______________________________________________");


        //Converting Array to ArrayList

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // first way to convert is using constructor of ArraysList
        // -> make sure it is non-primitive array you want to convert

        //another way:  l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("_______________________________________________");

        ArrayList<String> employeesList= new ArrayList<>();

        employeesList.addAll( Arrays.asList("Mina", "Nalan", "Lina", "Sarah", "Alina", "Katarina"));


        System.out.println(employeesList);

        boolean hasAlina = employeesList.contains("Alina");

        boolean hasLinaNalan= employeesList.containsAll(Arrays.asList("Lina", "Nalan")); // true -> order does not matter, when you ask elements

        boolean hasHamideSafiyeNalan= employeesList.containsAll(Arrays.asList("Hamide", "Safiye", "Nalan")); // false

        System.out.println("hasAlina = " + hasAlina); // true

        System.out.println("has Lina and Nalan = " + hasLinaNalan);



        ArrayList<Integer> list= new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 20, 20, 20, 20));

        list.removeAll( Arrays.asList(10, 20));

        System.out.println(list); // [30, 40, 50, 60, 70]


        System.out.println("_______________________________________________");

        ArrayList<String> developers= new ArrayList<>();

        developers.addAll( Arrays.asList("Mina", "Nalan", "Lina", "Sarah", "Alina", "Nina", "Nalan", "Lina"));

        developers.retainAll( Arrays.asList("Mina" , "Nalan", "Lina"));  // keep/retain them and remove others

        // retainAll removes all the un-matching specified elements and keep the specified ones

        System.out.println(developers); // [Mina, Nalan, Lina, Nalan, Lina]

        System.out.println("_______________________________________________");



        ArrayList<String> groceryList= new ArrayList<>();

        groceryList.addAll( Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice",
                                          "Orange", "Strawberry", "Blueberry" , "Paper towels"));

        groceryList.retainAll( Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));


        System.out.println(groceryList); // [Eggs, Potato, Milk, Tomato]








    }
}
