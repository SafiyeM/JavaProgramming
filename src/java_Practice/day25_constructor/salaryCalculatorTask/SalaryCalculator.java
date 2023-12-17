package java_Practice.day25_constructor.salaryCalculatorTask;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100; //  // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHour = weeklyHours;

        /*
         it is better to leave the division by 100 in the constructor
         because it helps to ensure that the stateTaxRate and federalTaxRate values are always
          correctly set as decimal values. This makes it easier for users to input values without
           having to remember to convert percentages to decimals.
         */
    }

    public double salary(){

        return hourlyRate * weeklyHour * 52;
    }

    public double stateTax(){

        return salary() * stateTaxRate; // /100 we can add here, too
    }

    public double federalTax(){

        return salary() * federalTaxRate; // /100 we can add here, too
    }

    public double salaryAfterTax(){  // this method calls the others methods to calculate net income

        return salary() - federalTax() - stateTax();
    }
    /*
    It does this by calling the salary() method to calculate the gross income,
    and then subtracting the amounts of state tax and federal tax
    calculated by the stateTax() and federalTax() methods
     */


    public String toString() {
        return " Salary calculator: " +
                " hourly rate= " + hourlyRate +
                ", weekly hour= " + weeklyHour +
                ", salary= " + salary() +
                ", state tax rate= " + stateTax()+
                ", federal tax rate= " + federalTax() +
                ", salary after tax= " + salaryAfterTax() ;
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */