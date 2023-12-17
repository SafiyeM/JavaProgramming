package java_Live_Review.week10.drink;

import java.util.ArrayList;
import java.util.Arrays;

public class Mall {

    public static void main(String[] args) {

        // This is an ArrayList of Drink objects
        ArrayList<Drink> soda = new ArrayList<>(Arrays.asList(
                new Drink("Coke", 1.99, 20),
                new Drink("Pepsi", 1.89, 10),
                new Drink("7UP", 1.55, 25),
                new Drink("Fanta", 1.25, 10),
                new Drink("Mountain Dew", 2.49, 5),
                new Drink("Water Bottle", 4.99, 10)
        ));

        // Another ArrayList of Drink objects
        ArrayList<Drink> juice = new ArrayList<>(Arrays.asList(
                new Drink("Orange Juice", 2.39, 10),
                new Drink("Apple Juice", 2.39, 9),
                new Drink("Pomegranate Juice", 3.55, 10),
                new Drink("Cranberry Juice", 3.21, 10),
                new Drink("Lemonade", 3.59, 17),
                new Drink("V8", 1.99, 0)
        ));


        DrinkVending vending1 = new DrinkVending();
        vending1.alldrinks.add(new Drink("Redbull", 2.99, 10));
        //System.out.println(vending1.alldrinks);

        vending1.alldrinks.addAll(soda);
        System.out.println(vending1);

        DrinkVending vending2 = new DrinkVending(juice);
        System.out.println(vending2);



        ArrayList<Drink> newDrinks = new ArrayList<>(Arrays.asList(
                new Drink("Orange Juice", 2.39, 5),
                new Drink("Pomegranate Juice", 3.55 , 15),
                new Drink("Water", 1.99, 20)

        ));

        vending2.stock(newDrinks);
        System.out.println(vending2);

        System.out.println(vending2.vend("Lemonade"));
        System.out.println(vending2.vend("Coke"));
        System.out.println(vending2.vend("V8"));


    }
}
