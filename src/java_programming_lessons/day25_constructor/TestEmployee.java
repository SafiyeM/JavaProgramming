package java_programming_lessons.day25_constructor;

import java.time.LocalDate;

public class TestEmployee {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Emily", 32,'F',"Java Developer", 100000, LocalDate.of(2022, 12, 5));
        Employee employee2 = new Employee("Noah" , 40, 'M', "Tester", 90000, LocalDate.of(2022, 11, 4));

        System.out.println(employee1);

        System.out.println(employee2);

    }
}
