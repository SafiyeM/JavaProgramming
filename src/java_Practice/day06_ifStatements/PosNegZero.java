package java_Practice.day06_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {


        int number = 20;
        String result = "";


        if (number > 0) {
            result = "positive";
        }
        // if the number is greater than zero, is positive

        if (number < 0) {
            result = "negative";
        }
        // if the number is less than zero, is negative

        if (number == 0) {
            result = "zero";
        }
        // if the number is equal, then it is zero

        System.out.println(result);


    }
}
