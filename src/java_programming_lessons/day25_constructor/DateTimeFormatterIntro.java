package java_programming_lessons.day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {


        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM.dd.y"); // EEEE -> day of the week
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7, 1);
        LocalDate date2 = LocalDate.of(2023, 7, 2);

        System.out.println(date1.format(df)); // July.01.2022
        System.out.println(date2.format(df));



        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:m a");

        LocalTime time1 = LocalTime.of(17, 30);

        System.out.println( time1.format(tf)); // 05:30 PM


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf)); // Thursday, Apr/06/2023  10:47 AM








    }
}
