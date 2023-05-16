package java_live_review.week14.bank;


// This class is the user, the person who would use this Bank/code
public class UseBank {

    public static void main(String[] args) {



        Bank bank = new Bank(1000, 132456788);

        bank.withDraw(400);// had unchecked exception, so exception would occur during runtime
        System.out.println(bank.getBalance());

        Bank bank2 = new Bank(0,0);
        try {
            bank2.setBalance(-100);
        } catch (CannotBeNegativeException e) {
            e.printStackTrace();
           // System.out.println(e.getMessage());
        }

        System.out.println("END");

    }
}
