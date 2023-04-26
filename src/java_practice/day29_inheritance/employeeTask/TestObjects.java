package java_practice.day29_inheritance.employeeTask;

public class TestObjects {


    public static void main(String[] args) {


        Driver driver = new Driver();
        driver.setInfo("Mark", 'M', 35, "A2345", "Driver", 50000);
        System.out.println(driver);
        driver.driver();

        System.out.println("______________________________________");

        Teacher teacher = new Teacher();
        teacher.setInfo("Malike", 'F', 37, "B8765", "Teacher", 70000);
        System.out.println(teacher);
        teacher.teaching();

        System.out.println("______________________________________");

        Developer developer = new Developer();
        developer.setInfo("Mehmet", 'M', 48, "C2345", "Developer", 120000, "Java");
        System.out.println(developer);
        developer.coding();

        System.out.println("______________________________________");

        Tester tester = new Tester();
        tester.setInfo("Safiye",'F', 39,"D3986","Tester", 100000);
        System.out.println(tester);
        tester.testing();








    }
}
