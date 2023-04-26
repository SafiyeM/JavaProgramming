package java_practice.day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate= scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int workHours= scan.nextInt();

        System.out.println("Enter the state tax rate in percentage eg. 7.5:");
       double stateTaxRate= scan.nextDouble();

        System.out.println("Enter federal tax rate in percentage eg. 24.5:");
        double federalTaxRate= scan.nextDouble();

        double salary = hourlyRate * workHours*4;
        double stateTax= salary* stateTaxRate/100;
        double federalTax= salary * federalTaxRate/100;
        double totalTax=stateTax+federalTax ;
        double netIncome= salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
