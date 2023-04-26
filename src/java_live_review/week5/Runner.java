package java_live_review.week5;

public class Runner {
    public static void main(String[] args) {

        // calling the method:
        // ClassName.method()


        System.out.println(CurrencyConverter.convertFromDollar("yen", 50));
        System.out.println(CurrencyConverter.convertFromDollar("won", 50));
        System.out.println(CurrencyConverter.convertFromDollar("lira", 50));


        System.out.println("__________________________________________");


        MultiplicationTable.multiplicationTable(5);




    }
}
