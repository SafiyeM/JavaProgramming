package src.java_Practice.day08_ternarySwitch;

public class Loan {
    public static void main(String[] args) {


        int salary = 59_000,
                creditScore = 750;

        String result = (salary >= 60_000 && creditScore >= 650) ? "Loan Approved"
                : "Loan Denied";

        System.out.println(result);


    }
}
 /*
        2. Create a class called Loans, Given two variables salary and credit score,
         use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

         */