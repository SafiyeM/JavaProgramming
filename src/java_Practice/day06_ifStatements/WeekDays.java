package java_Practice.day06_ifStatements;

public class WeekDays {

    public static void main(String[] args) {


        int number = 1;

        boolean monday = number == 1;
        boolean tuesday = number == 2;
        boolean wednesday = number == 3;
        boolean thursday = number == 4;
        boolean friday = number == 5;
        boolean saturday = number == 6;
        boolean sunday = number == 7;
        String result = "";

        if (monday) {
            result = "Monday";
        }

        if (tuesday) {
            result = "Tuesday";

        }
        if (wednesday) {
            result = "Wednesday";

        }
        if (thursday) {
            result = "Thursday";

        }
        if (friday) {
            result = "Friday";

        }
        if (saturday) {
            result = "Saturday";

        }
        if (sunday) {
            result = "Sunday";
        }


        System.out.println(result);


    }
}

/*

1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
Ex:
Given:
number = 1
output:
Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */