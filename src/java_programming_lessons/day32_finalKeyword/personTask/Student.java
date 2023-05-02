package java_programming_lessons.day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person {


    private char grade;

    public Student(String name, char gender, int age, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        this.grade = grade;
    }



}
