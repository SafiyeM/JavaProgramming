package java_Practice.day07_ifStatements;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        // Nested If Statement


        String size = "grande";
        double price = 0.0;
        int calories = 0;

        if (size == "tall" || size == "grande" || size == "venti") {

            if (size == "tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }

            System.out.println("Price is: $" + price + "\n" + calories + " calories");

        } else {
            System.err.println("Invalid Size: " + size);
        }

       /* 2. solution

        String size="small";
        String result= "price is $";

        if (size == "tall" || size == "grande" || size == "venti"){

            if (size=="tall"){
                result += "3.69 \n90 calories";
            } else if (size=="grande") {
               result += "3.99 \n120 calories";
            }else {
               result += "4.29 \n150 calories";
            }

        }else {
            result = "invalid";
        }

        System.out.println(result);

        */


    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */