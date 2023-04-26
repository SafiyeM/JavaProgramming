package java_programming_lessons.day28_encapsulation.employee;

public class TestEmployee {


    public static void main(String[] args) {



       // Employee employee1= new Employee();
        // employee1.salary = -200000; -> private access modifier, in order to read and set the value we need getter and setter

      //  employee1.setSalary(-100000); invalid salary
       // System.out.println(employee1.getSalary());  //Salary can not be negative: -100000.0

        //employee1.setSalary(100000);
       // System.out.println(employee1.getSalary());


       // employee1.setName("      ");
        //System.out.println(employee1.getName());  // Employee name can not empty or blank

       // employee1.setName("Marry");
      //  System.out.println(employee1.getName());


        Employee employee2 = new Employee("Lena", 30,"Developer",60000);

        System.out.println(employee2);


    }
}
