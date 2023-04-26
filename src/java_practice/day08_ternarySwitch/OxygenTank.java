package java_practice.day08_ternarySwitch;

public class OxygenTank {

    public static void main(String[] args) {


        int oxygenLevel = 100;
        String result = "";


        // Solution mix ternary & if statement
        if (oxygenLevel >= 0 && oxygenLevel <= 100) {

            result = (oxygenLevel > 90) ? "Your tank is full" : (oxygenLevel > 80) ? "still okay"
                    : (oxygenLevel > 70) ? "Don't go too far" : (oxygenLevel > 60) ? "Start to head back"
                    : "Be careful now, you are at 50%";

        } else {
            result = "invalid oxygen level";
        }

        System.out.println(result);

        System.out.println("__________________________________________");


        //Solution 2: If statement

        String result2 = "";

        if (oxygenLevel >= 0 && oxygenLevel <= 100) {

            if (oxygenLevel > 90) {
                result2 = "Your Tank is full";
            } else if (oxygenLevel > 80) {
                result2 = "still okay";
            } else if (oxygenLevel > 70) {
                result2 = "Don't go too far";
            } else if (oxygenLevel > 60) {
                result2 = "Start to head back";
            } else {
                result2 = "Be careful now, you are at 50%";
            }


        } else {
            result2 = "invalid oxygen level";
        }

        System.out.println(result2);


    }
}
/*
        4. Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */