package java_Programming_Lessons.day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {


        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2024, 5, 5, 2, 0);

        System.out.println(ends.getHour()+ ":" + ends.getMinute()); //2:0
        System.out.println(ends.getMonthValue()); // 5
        System.out.println(ends.getMonth()); // May

        System.out.println(starts.getDayOfWeek()); // local time thursday
        System.out.println(starts.getHour() + ":" + starts.getMinute()); // 11:6










    }
}
