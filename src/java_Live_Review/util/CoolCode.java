package java_Live_Review.util;

import java.util.ArrayList;

public class CoolCode {




    /**
     * Converts dollars to other currency types
     * Possible currency conversions:
     * Euro, Yen, Lira, Won, Rupee
     * No other currency conversions
     * These rates are also hard coded
     *
     * @param currency The currency you are trying to convert to
     * @param dollars  The initial amount of dollars being converted
     * @return the converted rate amount. If no valid currency type is given the initial dollars are returned
     */

    public static double convertFromDollar(String currency, double dollars) {
        switch (currency.toLowerCase().trim()) {
            case "euro":
                return dollars * 0.91;
            case "yen":
                return dollars * 121.03;
            case "lira":
                return dollars * 14.85;
            case "won":
                return dollars * 1_217.52;
            case "rupee":
                return dollars * 181.45;
        }

        return dollars; // the return if none of the case match
    }

    /**
     * Creates a multiplication table of the given number to 10
     * number x 1 =  number x 2 =
     * etc...
     *
     * @param number the multiplication table is created for this number
     * @return a String with the multiplication table
     * @see #multiplicationTable(int, int)
     */

    public static String multiplicationTable(int number) {
        return multiplicationTable(number, 10);
    }

    /**
     * Create a dynamic multiplication table for the given number up to a certain limit
     *
     * @param number the multiplication table is created for this number
     * @param limit  starting from 1 give the multiplication of the number up to the limit
     * @return a String with the multiplication table
     */

    public static String multiplicationTable(int number, int limit) {
        String result = "";
        for (int i = 1; i <= limit; i++) {
            result += "\n" + number + " x " + i + " = " + (number * i);
        }
        return result;
    }

    /**
     * An alternative to printing a 2D int array
     *
     * @param arr the 2D int array that will be printed
     * @return the String format of the 2D array. Format is: \line break \tab (element)(element)(element)... etc each element from the inner 1D array are on one line with parenthesis grouping the element
     */

    public static String print2D(int[][] arr) {
        String print = "";
        for (int[] inner : arr) {
            print += "\n\t";
            for (int each : inner) {
                print += "(" + each + ")";
            }
        }
        return print;
    }

    /**
     * Converts a primitive int array to an ArrayList of Integer
     *
     * @param arr the int array that will be converted
     * @return a ArrayList of Integer
     */

    public static ArrayList<Integer> convertArrToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
    }

    /**
     * Converts an ArrayList of Integer to a primitives int array
     *
     * @param list the ArrayList of Integer that will be converted
     * @return an int array
     */

    public static int[] convertListToArr(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
