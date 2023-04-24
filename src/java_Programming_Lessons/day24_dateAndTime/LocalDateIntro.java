package java_Programming_Lessons.day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println(today);


        LocalDate birthday = LocalDate.of(1982, 5, 26);

        System.out.println(birthday);


        System.out.println("_____________________________________");

        System.out.println(today.getYear()); // 2023 - current year

        System.out.println(today.getMonth()); // April -current month

        System.out.println(today.getMonthValue()); // 4 - current month number (April)

        System.out.println(today.getDayOfWeek()); // Today is Wednesday (current day- April-05-2023)

        System.out.println(today.getDayOfMonth()); // 5 -> It's the 5th month of the year
        System.out.println(today.getDayOfYear()); // 95 -> Today is the 95th day of the year
        System.out.println("_____");
        System.out.println(birthday.getDayOfWeek());


        System.out.println("______________________________________________________");


        today = today.plusYears(1); // 2024-04 -05

        System.out.println(today);


        System.out.println("_______________________________________________");

        LocalDate graduationDate = LocalDate.of(2025, 6, 20);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusYears(1);

        System.out.println(graduationDate);

        System.out.println("_____________________________________________");

        LocalDate yourBirthday = LocalDate.of(2005, 4, 1);

        LocalDate yourBrothersBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println("your Birthday = " + yourBirthday);
        System.out.println("your Brothers Birthday = " + yourBrothersBirthday);


        System.out.println("__________________________________________");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);

        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);

        System.out.println("____________________________________________________");


        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isBefore( LocalDate.of(2022, 12, 31) )); // false
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 31) ));  // true


        System.out.println("__________________________________________");

        System.out.println(LocalDate.now().isLeapYear());




    }
}
