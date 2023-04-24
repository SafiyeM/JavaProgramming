package java_Practice.day25_constructor.salaryCalculatorTask;


public class TestSalary {

    public static void main(String[] args) {


        SalaryCalculator employee1 = new SalaryCalculator(25, 5.0, 10,40 );

        System.out.println(employee1);

        SalaryCalculator employee2 = new SalaryCalculator(20,6.0,8,40);

        System.out.println(employee2.salary());
        System.out.println(employee2);


    }
}
