package java_programming_lessons.day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        // Queue:
        //       Duplicates are allowed
        //       Insertion order not preserved, random
        //       Does not have index
        //       Does not accept null
        //       First in, first out order (FIFO)

        // PriorityQueue:
        //              Random order
        //              Does not accept null
        //              Has no Index number (can not get index of element)
        //              FIFO

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90)); // since Queue is a Collection, can access also the methods of it
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //  queue1.addAll(Arrays.asList(null, null, null, null)); NullPointerException

        System.out.println(queue1); // [10, 10, 10, 40, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200, 90]
        int num1 = queue1.poll(); // -> FIFO -> it removes the first element
        System.out.println(num1); // 10 -> returns the first element
        System.out.println(queue1); // [10, 40, 10, 90, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200] -> first element is removed

        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1); // [40, 90, 40, 200, 90, 200, 200, 300, 300, 300, 90] -> first 3 elements is removed

        // System.out.println(queue1.get(4)); we do not have get() method in PriorityQueue
        System.out.println("___________________________");

        // ArrayDeque:
        //            Insertion order
        //            Does not accept null
        //            Has no Index number (can not get index of element)
        //            FIFO


        // FIFO is the only reason we may use the queue over List or Set,
        // otherwise we always use the List or Set.
        // When we use Queue FIFO, and want to know which element will be removed, we can use ArrayDeque
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //  queue2.addAll(Arrays.asList(null, null, null, null)); //NullPointerException

        // which element we added first will be the first, and last will be the last
        System.out.println(queue2); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll(); // -> returns first element
        System.out.println(queue2); // [200, 300, 40, 90, 10, 200, 300, 40, 90] first element is removed

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2); // []  there is no elements left  in the queue2

        // System.out.println(queue2.get(3)); we do not have get() method in ArrayDeque

        System.out.println("_________________________");

        // LinkedList:
        //            insertion order
        //            accepts null
        //            has Index number
        //            FIFO


        Queue<Integer> queue3 = new LinkedList<>();
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null, null));

        System.out.println(queue3); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null, null]

        System.out.println(((LinkedList) queue3).get(4)); // LinkedList has get() method
        // we can access get() method by down-casting

        System.out.println("_________________________");

        // LinkedList implements both List(I) & Queue(I), so has IS RELATION with both of them
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(list.get(1)); // 200

        //before calling LinkedList object
        System.out.println(list); // [10, 200, 300, 40, 90]

        // casting from super to sub
        System.out.println(((LinkedList) list).poll()); // 10
        // In order to access the poll() method,
        // we need to cast the reference type List to the object type LinkedList

        // after calling LinkedList object
        System.out.println(list); // [200, 300, 40, 90] -> removes the first element


        // we cannot use pop() method for LIFO(Last in first out)
        // This method is a unique method for Stack
        // System.out.println(((Stack) list).pop()); // ClassCastException (NO IS RELATION between Stack & LinkedList)

        // Additional Information:
        // if we want to use pop() method from Stack to remove last element, we can not use Constructor Conversion method.
        // Stack does not have a Constructor accepts a collection

        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);

        stack.pop(); // Remove the last element

        list.clear(); // Clear the existing list

        list.addAll(stack); // Reassign the modified stack to the list

        System.out.println(list); // [200, 300, 40]
    }
}
