package java_live_review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggest {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 3, 1, 4, 5, 2, 4, 8, 4, 8));

        System.out.println(list); // [4, 3, 1, 4, 5, 2, 4, 8, 4, 8]

        int max = Integer.MIN_VALUE; // 5
        int secondMax = list.get(0); // 4

        for (Integer each : list) {
            if (each > max){
                secondMax = max;
                max = each;
            }


            if (each > secondMax && each < max){
                secondMax = each;
            }

        }


        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);

    }
}
/*
    [IQ] Second Biggest Number [ArrayList, loop, conditional]

    Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
    Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
    Input:
        [4,3,1,4,5,2,4,8,4,8]
    Output:
     */