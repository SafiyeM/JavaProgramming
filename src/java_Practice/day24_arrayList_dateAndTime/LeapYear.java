package java_Practice.day24_arrayList_dateAndTime;

import java.time.LocalDate;

public class LeapYear {

    public static boolean isLeapYear(int birthyear){

        return LocalDate.of(birthyear,3 ,5).isLeapYear();
        // Since we only need to check if the year is a leap year, we can choose any month and day.

}


    public static void main(String[] args) {

        System.out.println(isLeapYear(2012)); // true
        System.out.println(isLeapYear(1982)); // false
        System.out.println(isLeapYear(1972)); // true

    }
}
/*
8. Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false

 */