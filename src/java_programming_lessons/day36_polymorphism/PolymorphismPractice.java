package java_programming_lessons.day36_polymorphism;

import java_programming_lessons.day30_inheritance.phoneTask.IPhone;
import java_programming_lessons.day30_inheritance.phoneTask.Nokia;
import java_programming_lessons.day30_inheritance.phoneTask.Phone;
import java_programming_lessons.day30_inheritance.phoneTask.Samsung;

public class PolymorphismPractice {

    public static void main(String[] args) {


        // In Polymorphism Reference type can be one but the object type could be many

        //reference  type
        Phone[] phones = {

                // object types
                new IPhone("Iphone 11 Pro", "Black", "Large", 900),
                new IPhone("Iphone 12 Pro Max", "Black", "Large", 1200),
                new IPhone("Iphone 9", "Gold", "Medium", 800),
                new Samsung("Galaxy S19", "Pink", "Medium", 700),
                new Samsung("Galaxy S20", "Silver", "Large", 850),
                new Samsung("Galaxy S21", "Pink", "Large", 950),
                new Nokia("XR20", "Blue", "Small", 350),
                new Nokia("G10", "Gray", "Medium", 99),
                new Nokia("G50", "Silver", "Large", 250),
                new IPhone("Iphone 12 Pro", "Black", "Large", 1200),
                new IPhone("Iphone 11 Pro Max", "Silver", "Large", 1100),
                new Samsung("Galaxy S18", "White", "Medium", 750),
                new Samsung("Galaxy S17", "Silver", "Medium", 650),
                new Nokia("G10", "Black", "Medium", 99),
                new IPhone("Iphone 6", "Gold", "Small", 400),
                new IPhone("Iphone 7", "White", "Small", 500)
        };


        // print in this format : model - color - price
        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("__________________________________________");

        // How many Iphone in the array of phones?
        // How many Samsung in the array of phones?
        int countIphone = 0;
        int countSamsung = 0;


        // to use instanceOf keyword "Is A Relationship" MUST
        for (Phone eachPhone : phones) {
            if (eachPhone instanceof IPhone) {  // If the phone is Iphone
                countIphone++;
            }

            if (eachPhone instanceof Samsung) {  // If the phone is Samsung
                countSamsung++;
            }
        }

        System.out.println(countIphone);
        System.out.println(countSamsung);


        System.out.println("__________________________________________");


        for (Phone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung) { // If the phone is Iphone or Samsung
                if (each.getPrice() >= 700) {
                    System.out.println(each.getModel());
                }
            }
        }


    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphone in the array of phones?

	3. How many Samsung in the array of phones?

	4. Display the models of Iphone and samsung that has the price of 700 or greater

 */