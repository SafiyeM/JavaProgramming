package java_programming_lessons.day39_collections;

import java.util.*;

public class ListDemo {


    public static void main(String[] args) {

        // With Polymorphism -> Parent is referencing to the child object
        // parent     ref name =  child object
        List<Integer> arryList = new ArrayList<>();// reference type of arryList object is List
        arryList.add(100);
        arryList.get(0); // this get() method is from List interface -> the ref type decide what we can call/access
        // if we did not have get() method in List Interface, we would not be able to call it
        List<Integer> linkdList = new LinkedList<>();  // reference type of linkdList object is List
        linkdList.add(100);
        linkdList.get(0); // this get() method is from List interface


        //___________________________________ Collection -> List __________________________//
        // (I)-> Interface
        // (C)-> Class

        // List(I):
        //      Child Interface of Collection Interface
        //      Duplicates are allowed
        //      Insertion order preserved
        //      Has index numbers

        // ArrayList, LinkedList, Vector -> Stack

        // Without Polymorphism
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);

        arrayList.remove(0);
        arrayList.get(0);  // from arrayList we can use get() method and provide index number
        // when we call get() method through the reference type of ArrayList, it is faster than LinkedList reference type.
        // Retrieving the element from ArrayList is faster because it uses implicitly Array
        // LinkedList does not use implicitly Array, instead it uses Node

        //ArrayList(C):
        //          is an Array based class (it allow random access to the elements)
        //          retrieving the elements is faster
        //          implements the List interface

        //LinkedList(C):
        //           is a Node based class (pointer to the next & previous value)
        //           inserting and deleting elements are faster than ArrayList
        //           implements the List Interface

        // when we are managing the data, if we have to do lots of insertion and deletion, it is better to use LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(100);

        linkedList.remove(0);
        linkedList.get(0); // from linkedList we can also use get() method and provide index number
        // because get() method is inherited from the List Interface

        // Node:
        //      Every Node has pointer to the next and to the previous Nodes.
        //      Every element that we store in the LinkedList will be stored as a Node
        //      Internally uses doubly linked list
        //      It is not fast as ArrayList class because ;
        //      Everytime when we retrieve the element, LinkedList does not allow us random access.
        //      However, Array allows to retrieve the elements randomly (retrieving the elements is faster)

        // Fast methods linkedLinks:
        //                          add(), addAll(), remove(), removeAll(), removeIf(), retainAll()
        // Inserting and deleting elements are faster than ArrayList

        // we can use the same methods for both ArrayList and LinkedList but the background implementation is different


        System.out.println("______________________________________________");

        // Vector(C):
        //       Is the synchronised version of ArrayList -> Threads get executed one at a time (thread-safe)
        //       The methods of the Vector have synchronised keyword
        //       Uses Array internally
        //       Implements the List Interface
        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("______________________________________________");

        // Stack(C):
        //          Is child of Vector (extends Vector class)
        //          All the methods in the Vector Class are inherited as it is in the Stack Class
        //          Is also synchronised version of ArrayList
        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack); // [100, 200, 300]

        int lastElement = stack.pop(); // this method removes the last element
        System.out.println(lastElement); // 300
        System.out.println(stack); // [100, 200] last object is removed


        // Difference between Stack & Vector :
        //         There is a unique order for the Stack
        //         Last-in, first out order (LIFO)
        //         In Stack whenever we call the special method, it is going to follow LIFO order
        //         The last inserted object, will be the first object out from the Stack object
        //         pop() method is unique method of Stack
        //         When we call the pop() method the last inserted element of the Stack will be removed


    }
}
