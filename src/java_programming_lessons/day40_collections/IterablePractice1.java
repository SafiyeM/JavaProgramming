package java_programming_lessons.day40_collections;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator1 = list.iterator(); // 0 iteration
        System.out.println(iterator1.hasNext()); // false no element to iterate
      //  System.out.println(it.next());    // NoSuchElementException

        System.out.println("_________________________________________");


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"
        ));

        Iterator<String> it = names.iterator(); // we can get the iterator object, which contains whole iteration of this list collection

         // check every single iteration one by one, we need to apply the loop to this iterator
        while ( it.hasNext() ){ // hasNext method becomes false whenever there is no iteration left
            String each = it.next();   // get the element of the collection during each iteration
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();    // we should call the remove() method from the iterator not list(names) remove() method
            }

        }

        System.out.println(names); // [John, Ercan, Daniel, Mustafa, Mohammed, Yulia, Chris]

        System.out.println("______________________________________________");

        //removeIf()

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2); // [John, Ercan, Daniel, Mustafa, Mohammed, Yulia, Chris]


        System.out.println("_____________________________________________________");

        // find the nth largest number
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 6, 8, 7, 8, 5, 9, 9,8));

        int n = 5;
        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max= Collections.max(numbers);
        System.out.println(max); // 5




    }

}
