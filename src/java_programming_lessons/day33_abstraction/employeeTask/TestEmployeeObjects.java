package java_programming_lessons.day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {


        /*
        //Employee is ABSTRACT CLASS, can not be instantiated -> COMPILE ERROR
        Employee employee = new Employee("Daniel", 30, 'M', "A1","SDET", 85000);
         */

        Teacher teacher = new Teacher("Rebecca", 35,'F',"B1","Math Teacher",75000);

        Tester tester = new Tester("Safiye",40, 'F',"C34","SDET",80000);

        Driver driver = new Driver("Max",38,'M',"W35","Taxi Driver",50000);

        Developer developer = new Developer("Lucy", 35, 'F', "C2","Java Developer",95000,"Java");


        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(driver);
        System.out.println(developer);

        System.out.println();

        teacher.work();
        tester.work();
        driver.work();
        developer.work();

    }
}
