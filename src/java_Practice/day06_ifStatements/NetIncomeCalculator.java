package java_Practice.day06_IfStatements_Practices;

public class NetIncomeCalculator {

    public static void main(String[] args) {

        double salary = 110_000;
        boolean isMarried = true;

        double taxRate = 0;

        if (salary >= 130_000) {
            taxRate = 0.35; //35%
        }
        if (salary <= 129_000 && salary >= 100_000) {
            taxRate = 0.30; //30%
        }

        if (salary <= 99_000 && salary >= 80_000) {
            taxRate = 0.25; //25%
        }

        if (salary <= 79_000) {
            taxRate = 0.20; //20%
        }

        if (isMarried) {  // if the person is married
            taxRate -= 0.5; // subtracting 5% from the original tax rate
        }


        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);


    }
}
/*

9. Create a class named NetIncomeCalc,
 Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */