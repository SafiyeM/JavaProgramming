package java_programming_lessons.day24_dateAndTime;

import java.time.LocalDate;

public class Person {


    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;


    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() -dateOfBirth.getYear();
        // We do not have a local variable named age inside setInfo method.
        // THat's why we do not have to use this.


    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }



    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return dateOfBirth;
    }










}
