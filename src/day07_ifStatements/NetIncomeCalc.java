package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {


        int     salary= 50_000;
        boolean isMarried= true;

        double  taxRate= 0;


        if (salary>=130_000){// if the salary is 100000 or more, then the tax rate should be 35%
            taxRate= 0.35;
        }

        if (salary>=100_000 && salary <130_000){// if the salary is between 100_000 and 130_000 (excluded), then the tax rate should be 30%
            taxRate= 0.3;
        }

        if (salary>=80_000 && salary <100_000){// if the salary is between 80_000 and 100_000 (excluded), then the tax rate should be 25%
            taxRate = 0.25;
        }

        if (salary<80_000){ // if the salary is less than 80_000, then the tax rate should be 20%
            taxRate=0.2;
        }

        if (isMarried){// if the person is married
            taxRate -= 0.05;//tax is reduced by %5
        }


        double totalTax= salary*taxRate;
        double netIncome= salary-totalTax;

        //This is another way to calculate net income: we do not use in this case --> double totalTax= salary*taxRate;
        // double netIncome= salary * (1-taxRate); // how to calculate net income: 1 is equal to here 100%
                                                /* if the tax rate is 30%, (1-30% -->> 100-30=70) will return you 70%,
                                                 so whatever the salary is 70% is the net income
                                                    */
        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome=" + netIncome);
    }
}
/*

    3. Create a class named NetIncomeCalc,
     Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */