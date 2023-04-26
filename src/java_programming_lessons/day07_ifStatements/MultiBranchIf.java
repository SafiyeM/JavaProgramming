package java_programming_lessons.day07_ifStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int number= 100;
        String result= "";

        if (number>0){
            result="positive";
        }

        if (number<0){
            result="negative";
        }
        if (number==0){
            result= "zero";

        }
        System.out.println(result);


        System.out.println("_____________________________________");

        String result2="";

        if (number > 0){ // if the first block is true, remaining blocks will not be checked
            result2= "positive";

        } else if (number<0) {
            result2 ="negative";

        }else {
            result2= "zero";
        }

        System.out.println(result2);


    }
}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive

 */