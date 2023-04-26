package java_practice.day17_customClass;

public class SalaryCalculator {


    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHour;


    public void setInfo(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHour = weeklyHours;
    }


    public double salary(){

        return hourlyRate * weeklyHour * 52;
    }

    public double stateTax(){

  return salary() * stateTaxRate/100;
    }

    public double federalTax(){

  return salary() * federalTaxRate/100;
    }

    public double salaryAfterTax(){

        return salary() - stateTax() - federalTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {

        SalaryCalculator salary=new SalaryCalculator();

        salary.setInfo(15, 8, 10, 40);

        System.out.println(salary.toString());

    }


}
/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will be responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object

 */

