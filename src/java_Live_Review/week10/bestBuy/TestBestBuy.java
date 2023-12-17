package java_Live_Review.week10.bestBuy;

public class TestBestBuy {

    public static void main(String[] args) {


        System.out.println("MAIN METHOD RUNNING");

       // System.out.println(BestBuy.ceo);

        /*
        MAIN METHOD RUNNING
        STATIC BLOCK RUNNING
        Corrie Barry
         */

        System.out.println(new BestBuy("2284746 Cook Drive", 213, 40));


        /* Execution flow:

        MAIN METHOD RUNNING
        STATIC BLOCK RUNNING
        INSTANCE BLOCK RUNNING
        CONSTRUCTOR RUNNING
        BestBuy{address='2284746 Cook Drive', grossIncome=213.0, expenses=40.0}
         */


        BestBuy store1 = new BestBuy("2284746 Cook Drive", 213, 40);
        store1.reportProfits();

        System.out.println(BestBuy.revenue);
      //  System.out.println(store1.revenue); Not good practice


    }
}
/*
create a class to run the code and create BestBuy objects
 */