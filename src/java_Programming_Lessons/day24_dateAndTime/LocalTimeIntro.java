package java_Programming_Lessons.day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {



        LocalTime startingTime = LocalTime.of(10, 30);

        System.out.println(startingTime); // 10:30

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now); // 17:58:58.366209800


        System.out.println("__________________________________________");

        LocalTime time1 = LocalTime.of(23, 59, 59); // max number we give for hour, minutes and seconds -> 23, 59, 59
                                                                      // otherwise we get exception

        System.out.println(time1);


        time1 = time1.plusHours(1);

        System.out.println(time1); // 00:59:59


        time1 = time1.plusMinutes(45);

        System.out.println(time1);  // 01:44:59





    }
}
