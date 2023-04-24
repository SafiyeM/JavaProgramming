package java_Programming_Lessons.day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {
        int number= 11;
        String month="";


        if (number >=1 && number <=12){ // this nested if block has only ONE multi-branch if statement!
            // which begins with if (number ==1) and ends with else {month= "december";}
            //if the block contains only one statement, it is not necessary
            // to give curly braces to this pre-condition  block,
            // but it is preferable


            if (number == 1){
                month="January";
            } else if (number==2) {
                month="February";
            }else if (number==3) {
                month="March";
            }else if (number==4) {
                month="April";
            }else if (number==5) {
                month="May";
            }else if (number==6) {
                month="June";
            }else if (number==7) {
                month="July";
            }else if (number==8) {
                month="August";
            }else if (number==9) {
                month="September";
            }else if (number==10) {
                month="October";
            }else if (number== 11){
                month="November";
            }else {
                month="December";
            }

        }else{
            month="no such a month";
        }

        System.out.println("month = " + month);




    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. otherwise print Invalid)
Ex:
Given:
number = 10
output:
October
 */