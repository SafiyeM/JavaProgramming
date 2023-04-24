package java_Practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMinNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int firstMax = Collections.max(list);
        int firstMin = Collections.min(list);

        list.removeIf(p-> p == firstMax || p == firstMin);     // we remove in this step our first max and min num,
                                                               // so that we can reach second max and min

       // System.out.println("secondMax = " + firstMax); // 8
       // System.out.println("secondMin = " + firstMin); // -2

        System.out.println("second maximum number is : " + Collections.max(list) ); // 7
        System.out.println("second minimum number is : " + Collections.min(list) ); // 1




    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops

 */
