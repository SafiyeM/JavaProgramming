package java_Programming_Lessons.day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {



        Employee employee1= new Employee();
        employee1.setInfo("John", 40,'M', "Java Developer", 100_000, "A12");

        Employee employee2= new Employee();
        employee2.setInfo("Emily", 35, 'F', "SDET",  95_000, "B34");

        Employee emplyee3= new Employee();
        emplyee3.setInfo("Mia", 38, 'F', "Developer", 98_000, "C22");


        System.out.println(employee1);
        employee1.work();

        System.out.println();

        System.out.println(employee2);
        employee2.work();

        System.out.println();

        System.out.println(emplyee3);
        emplyee3.work();







    }
}
