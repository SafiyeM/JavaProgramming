package java_Practice.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5)); // adding multiple elements at once by using bulk operation

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {    // if each element is odd number
                list.set(i, list.get(i) * 2);  // then we set this odd element to the list after multiplying by 2

                System.out.println(list);  // 2 2 5 4 10
            }
        }

        System.out.println("list = " + list);

    }
}
/*
6. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */