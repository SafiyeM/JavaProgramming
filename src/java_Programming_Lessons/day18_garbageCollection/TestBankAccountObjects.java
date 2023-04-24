package java_Programming_Lessons.day18_garbageCollection;

public class TestBankAccountObjects {

    public static void main(String[] args) {




        BankAccount obj1= new BankAccount();
        obj1.setInfo("John", 123456789);

        System.out.println(obj1); // balance is $0


        obj1.deposit(1000);
        obj1.checkBalance();  // after depositing balance is $1000


        obj1.withdraw(700);
        obj1.checkBalance();  // after withdrawing balance is $300

        obj1.deposit(-100); //insufficient amount to deposit

        obj1.checkBalance();


        obj1.withdraw(5000); // insufficient withdraw amount
        obj1.checkBalance();


        System.out.println("_______________________");



        BankAccount account1= new BankAccount();

        BankAccount account2= new BankAccount();


        account1.setInfo("Sebastian", 123456767);
        account2.setInfo("Millie", 231345678);

        account1.deposit(5000);
        account2.deposit(4000);


        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);

        account1.withdraw(1000);
        account1.checkBalance();



















    }


}
