package java_practice.day24_arrayList_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDates {

    public static void main(String[] args) {


        ArrayList<LocalDate> list = new ArrayList<>();
        list.addAll(Arrays.asList(

                LocalDate.of(2015, 4, 3),
                LocalDate.of(2022, 2, 7),
                LocalDate.of(1998, 11, 13),
                LocalDate.of(2017, 1, 6)
        ));

        list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(list); // [2022-02-07, 2017-01-06]
    }

}
/*
9. create an Arraylist of LocalDate,
   write a program that can remove all the dates before August-15-2016
 */