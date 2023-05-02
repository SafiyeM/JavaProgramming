package java_programming_lessons.day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoDevStudent student = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1982, 5,26),"A1", "Alumni Dev", 2);

        System.out.println(student);

        student.drink();
        student.sleep();
        student.eat();
        student.breath();



    }
}
