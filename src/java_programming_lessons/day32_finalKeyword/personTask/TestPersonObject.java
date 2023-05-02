package java_programming_lessons.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person = new Person("Daniel", 'M', LocalDate.of(1991,5,26));
        System.out.println(person); // Person: name='Daniel', gender=M, age=32, dateOfBirth=1991-05-26
        person.breath(); // final -> the same implementation for all subclasses

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 4, 2), "Developer", 100000);
        System.out.println(employee);
        employee.breath(); // final -> the same implementation for all subclasses





    }




}
