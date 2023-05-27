package java_programming_lessons.day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 2, 3, 5, 6, 7));

        // those loop examples are for seeing why using the loop and remove() method of Collection will not work

        /*

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 2, 3, 5, 6, 7));

        for (Integer each : list) {
         if (each < 5){
             list.remove(each); // remove method supposed to be called from the iterable
         }
        }
        System.out.println(list); // ConcurrentModificationException 
         */

        /*
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 5){
                list.remove(i);
            }
        }
        System.out.println(list); // [2, 4, 5, 6, 2, 3, 5, 6, 7] it still not able to remove the elements less than 5
                                  // because every time when one element is being removed during the iteration, index number is going to changed
                                  // for the next elements. The size of lists dynamic.

 */


        // For each loop is implicitly using this code fragments to for getting each element

        // while loop
        Iterator<Integer> it = list2.iterator(); // iterates collection
        while (it.hasNext()) {
            Integer each = it.next();  // then gets and returns each element
            if (each < 5) {
                it.remove();           // removes the elements based on the condition
            }
        }

        System.out.println(list2); // [5, 6, 5, 6, 7]

        System.out.println("_________________________________________________");


        // for loop
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 2, 3, 5, 6, 7));

        // iterator is initialization of loop      // as for condition we give hasNext() method
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {         // We do not need increment or decrement.
            // Because hasNext() method becomes automatically false
            Integer each = i.next();                                          // whenever there is not any elements left, the loop terminates

            if (each < 5) {
                i.remove();    // removes the elements based on the condition
            }

        }

        System.out.println(list3); // [5, 6, 5, 6, 7]

        // removeIf()

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 2, 3, 5, 6, 7));

        list4.removeIf(p-> p < 5);
        System.out.println(list4); // [5, 6, 5, 6, 7]

    }

}
