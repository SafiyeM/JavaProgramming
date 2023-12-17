package java_Practice.day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        // Nested If Statement


        int gradeLevel = 11;
        String result = "";


        if (gradeLevel >= 1 && gradeLevel <= 18) { //Pre-Condition

            if (gradeLevel >= 1) {
                result = "Elementary";
            } else if (gradeLevel >= 6) {
                result = "Middle School";
            } else if (gradeLevel >= 9) {
                result = "High School";
            } else if (gradeLevel >= 13 && gradeLevel <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
/*
   Task3    1. Create a class named GradeLevel.java

        2. An integer variable named gradeLevel is declared and given, Write a
        program to determine and print which school type someone is in.
        (Only if the given number is a valid number, then print the school type.
        otherwise print Invalid)
        Ex:
        gradeLevel = 2
        output:
        Elementary School
        The grade level and types are:
        1 ~ 5: Elementary school
        6 ~ 8: Middle school
        9 ~ 12: High school
        13 ~ 16: College
        17 ~ 18: Grad School

 */