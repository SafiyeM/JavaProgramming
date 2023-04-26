package java_programming_lessons.day05_operators;

public class ShortHandOperator {

    public static void main(String[] args) {

        // = assignment // addition assignment x += //subtraction assignment x -=
        //multiplication assignment x *= // division assignment x /=
        // remainder assignment x %=

        // _____________ assignment = _____________________//

        int a = 20; // we store 20 to the variable 'a'. We assign 20 to a variable

        System.out.println(a); // every time when we call a variable the value is a 20 but
                               // until we assign the new value
                               // Java executes from top to bottom!

        a= 40; // to update the value we do not declare one more time. We use assignment operator! (=)
               // We do not use int data to change the value. We only assign new value.

        System.out.println(a); // the new value of 'a' is now 40

        System.out.println("___________________________");

        // _____________ addition assignment x += _____________________//
        // increase the value of variable

        double balance= 100; // your bank account balance now

        balance += 1000;  // we deposited $1000 to the balance
                          // balance will be reassigned to the old value + new value
                         // balance = $100 + $1000. We added new balance with += operator

        System.out.println("balance = " + balance); // new balance is $1100


        balance += 500; // we deposited/increased more $500 to the balance
                        // then updated balance will be $1600
                        // balance = 1100 + 500

        System.out.println("balance = " + balance); // new balance is $1600

        balance += 10_000;

        System.out.println("balance = " + balance);// new balance is $11.600

        System.out.println("___________________________");


        // _____________ subtraction assignment x -= _____________________//
        // decrease the value of variable
        
        balance -= 1000; // when we withdraw money our bank balance, it will decrease.
                         // balance = 11.600 - 1000

        System.out.println("balance = " + balance); // new balance is $10.600
        
        balance -= 5000; // from the current balance 5000 will be subtracted

        System.out.println("balance = " + balance); // new balance 5600

        System.out.println("___________________________");


        // _____________ subtraction assignment x *= _____________________//
        // double the value of variable

        double salary= 45_000;

        salary *= 2; // salary = 45.000 * 2
                     // the salary is reassigned and doubled by multiplying

        System.out.println(salary); // so new salary 90.000

        salary *= 3; // salary = 90.000 * 3
                     // the salary is reassigned and tripled

        System.out.println(salary); // new salary is 270.000

        double eth = 4; // crypto ethereum ==> cryptocurrency
        eth *= 250; // eth= 250 *4
        System.out.println("eth =" +eth); // 1.000 eth


        System.out.println("___________________________");

        // _____________ division assignment x /= _____________________//
        // divide the value of variable

        eth /= 2; // the price of ethereum decreased by health, and it is crashed by 50 %.

        System.out.println("eth = " + eth); // the price of eth is 500 now

        System.out.println("___________________________");

        // back to the salary

        System.out.println("salary = " + salary); // current salary $270.000

        salary /= 2; // if the salary of employees is reduced by health
                     // we update the salary, and we divide it
                     // salary=  270.000 / 2

        System.out.println("salary = " + salary); // new salary $135.000

        // _____________ remainder assignment x %= _____________________//
        // first calculate the remainder and assign the remainder to the variable


        int b =39;

        b %= 7; // we assign the remainder of 39 divided by 7 to variable b
               // b = 39 % 7

        System.out.println(b); // remainder is 4

        /*

        Remainder: numerator - (denominator * integer result) (Syntax)

        39 / 7= 5.571428....

        Remainder of 39 : 39-(7*5)
                         7*5= 35
                         39-35= 4 // Remainder is 4

         */












        






    }
}
