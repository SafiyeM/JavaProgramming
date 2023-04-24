package java_Programming_Lessons.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;


public class TestPersonObjects {


    public static void main(String[] args) {


        Employee employee = new Employee("Derya", 'F', LocalDate.of(1985, 5, 26),
                "Java Developer", "A233499", 100000);

        President president = new President("Daniel", 'M', LocalDate.of(1980, 3, 5),
                LocalDate.of(2020, 7, 10));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1982, 9, 2),
                "Math Teacher", "C1", 95000);


        System.out.println(employee);
        System.out.println(president);
        System.out.println(teacher);


        employee.work();
        president.lie();
        teacher.teach();

        System.out.println("______________________________________________________");


        employee.eat("Pizza");
        president.eat("Ravioli");
        teacher.eat("Pie");

        employee.drink("Coffee");
        president.drink("Tea");
        teacher.drink("Water");




    }
}
