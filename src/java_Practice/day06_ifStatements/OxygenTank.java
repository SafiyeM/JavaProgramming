package java_Practice.day06_ifStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenNumber = 50;
        String result = "";


        if (oxygenNumber >= 90) {

            result = "Your tank is full";
        }

        if (oxygenNumber >= 80 && oxygenNumber < 90) {
            result = "Still okay";
        }

        if (oxygenNumber >= 70 && oxygenNumber < 80) {

            result = "Don't go too far";
        }

        if (oxygenNumber >= 60 && oxygenNumber < 70) {
            result = "Start to head back";
        }

        if (oxygenNumber >= 50 && oxygenNumber < 60) {
            result = " Be careful now you are at 50%";
        }

        System.out.println(result);

    }
}
/*

8. Create a class named OxygenTank. You are diving in the ocean.
 Your oxygen tank has a certain level (number)
 and you must print a message based on the level:

                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY
 */