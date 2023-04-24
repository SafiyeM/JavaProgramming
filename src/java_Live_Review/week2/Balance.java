package java_Live_Review.week2;

public class Balance {

    public static void main(String[] args) {

        double  balance= 800,
                withdrawAmount= 900; // withdraw is more than balance

        //balance = balance-withdrawAmount; //800-900= -100
        //1. Saim's Solution

       /* balance -= withdrawAmount; // This is shorthand operator -= // same as line 10 // 800-900=-100


        if(balance < 0){ // this if only runs, if you took out too much money
            System.out.println("Withdrew more than you in the account. Overdraft applied");
            balance += (balance * 0.2);
        }

        System.out.println("Total balance:" + balance);

        */




        // 2. solution


        double  overdraftFee= 20 ;
        double remainingBalance= balance - withdrawAmount;


        if (remainingBalance < balance){
            remainingBalance -= overdraftFee; // or remainingBalance < 0

        }



        // Balance $600, I withdrew $800 (more than balance amount) so I have -$200.
        // Overdraft fee is $100. So I have in my account -$300 (This is the remaining balance)

        System.out.println("Remaining balance: $" + remainingBalance);




    }
    }



/*

Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing
 */