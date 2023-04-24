package java_Practice.day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryNames {


    public static void main(String[] args) {


        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("Germany", "Turkey", "United States of America", "Italy",
                                           "United Kingdom of Great Britain and Northern Ireland",
                                           "El Salvador", "Luxembourg", "Bangladesh", "Holland", "Spain"));

        countryNames.removeIf(p-> p.length() >= 10);

        System.out.println(countryNames);  // [Germany, Turkey, Italy, Holland, Spain]



    }
}
/*
6. Create an ArrayList of string called country names,
   write a program that can remove all the country names that have length of 10 or greater

 */