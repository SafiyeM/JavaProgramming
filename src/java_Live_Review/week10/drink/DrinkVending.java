package java_Live_Review.week10.drink;

import java.util.ArrayList;

public class DrinkVending {

    public ArrayList<Drink> alldrinks;

    //create a constructor that will create an empty ArrayList
    public DrinkVending() {

        alldrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks) {

        this(); // calling the first constructor
        alldrinks.addAll(inputDrinks);  // add all of Drinks objects from the inputDrinks into the instance allDrinks ArrayList
        // filling vending machine with whatever arraylist has
    }

    //Create a method stock() that will accept an ArrayList of Drinks to fill the allDrinks ArrayList up.
    // If the Drink exists add to the quantity


    // the loop label outer: is used to target a specific loop. It gives a name/label to a loop
    public void stock(ArrayList<Drink> newDrinks) {

       outer:  for (Drink each : newDrinks) {


            for (Drink existingDrink : alldrinks) {


                if (existingDrink.name.equalsIgnoreCase(each.name)) {
                    existingDrink.quantity += each.quantity;
                    continue outer; // if this runs the drink will not be duplicated, skips the next codes after it and go back the begininng of outer loop
                }
            }

                alldrinks.add(each); // if the Drink is not in the machine, it will be added

        }
    }


    public double vend(String drink){

        for (Drink each : alldrinks ){

            if (each.name.equalsIgnoreCase(drink)){
                if (each.quantity > 0){
                    return each.price;
                }else{
                    System.out.println("Sorry " + drink + " is out of stock");
                    return  -1;
                }
            }
        }

        System.out.println("Sorry " + drink + " not offered");
        return -2;


    }





    public String toString() {
        String output = "";
        for (Drink each : alldrinks) {
            output += each + "\n";
        }
        return output;
    }
}

/*
Create a DrinkVending class:
		create an instance variable: allDrinks (ArrayList of Drink objects)
		create a constructor that will create an empty ArrayList
		create an overloaded constructor that will accept an ArrayList of Drinks of objects to initialize the vending machine with some Drinks
		create a toString to display the drinks in a nice format

	Create a method stock() that will accept an ArrayList of Drinks to fill the allDrinks ArrayList up.
	 If the Drink exists add to the quantity

	Create a method vend(): that will accept a String for the Drink name the person wants
		Search for the drink in the vending machine
			-> if we have the drink return the price
			-> if the drink is out of stock print: Sorry $name is out of stock and return -1
			-> if the drink is not in the vending machine print: Sorry $name not offered and return -2

		For the valid scenario after the price is printed reduce the quantity of that drink by 1.
 */