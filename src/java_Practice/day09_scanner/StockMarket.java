package java_Practice.day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your total shares:");
        int totalShares= scan.nextInt(); //100

        if (totalShares>0)
        {
            System.out.println("Enter your total value in the stock market:");
            double totalValue= scan.nextDouble(); // 25_000

            scan.nextLine();

            System.out.println("Enter the name of the company you have the most shares in:");
            String company= scan.nextLine(); // Apple INC

            System.out.println("Your total stock market holding is $" +totalValue+ "" +
                    " which is made up of " + totalShares+" shares. "+ company+" is your company holdings.");

        }else {
            System.out.println("Invalid numbers");
        }



    scan.close();
    }
}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */