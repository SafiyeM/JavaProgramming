package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);



        int a = 1;
        list.remove(a); // the remove() method of ArrayList takes an index as an argument, not a value.
                        // removing the element at index 1
        System.out.println(list); // 1,3

        System.out.println("____________________________________");



        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        /*
         Integer is an object type, so when a is passed as an argument to remove(),
         it will be treated as a value to be removed from the list, rather than an index.
         */
        Integer a1 = 1; // with this a it will remove element 1 so the output : 2, 3
        list1.remove(a1);
        System.out.println(list1); // 2,3


        System.out.println("____________________________________________");



        ArrayList<Character> list3= new ArrayList<>();

        for (char i= 'a'; i <= 'z'; i++){
            list3.add(i);
        }

        boolean r= list3.containsAll(Arrays.asList('a', 'c', 'D'));// false

        System.out.println(r);

        System.out.println("_________________________________________");


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        for (Integer each : list2) {
            if (each %2 !=0){
                continue;
            }
            System.out.println(each); // 2
            break;
        }







    }
}
