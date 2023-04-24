package java_Practice.day07_ifStatements;

public class WeekDays {
    public static void main(String[] args) {

        //Nested If Statement

       int number= 1;
       String result= "";

       if(number >=1 && number <=7){ // Pre-Condition Statement


           if (number==1){
               result= "Monday";
           } else if (number==2) {
               result= "Tuesday";
           } else if (number==3) {
               result= "Wednesday";
           }else if (number==4) {
               result= "Thursday";
           }else if (number==5) {
               result= "Friday";
           }else if (number==6) {
               result= "Saturday";
           }else {
               result= "Sunday";
           }

       }else {
           result="Invalid number";
       }

        System.out.println(result);


    }
}
/*
Task5
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
(only if the given number is a valid number, then print the name of the
day. otherwise print Invalid)
Ex:
Given:
number = 1
output:
Monday
 */