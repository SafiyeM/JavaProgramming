package java_practice.day08_ternarySwitch;

public class BiggerNum {
    public static void main(String[] args) {


        int n1 = 3;
        int n2 = 5;
        int n3 = 8;


        String result = (n1 > n2 && n1 > n3) ? "n1 is the biggest number"
                      : (n2 > n1 && n2 > n3) ? "n2 is the biggest" : "n3 is the biggest number";

        System.out.println(result);


    }
}
  /*
        6. Create a class called BiggerNum, write a program that checks for the biggest of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

         */