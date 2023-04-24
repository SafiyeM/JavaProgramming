package java_Programming_Lessons.day25_constructor;

import java_Programming_Lessons.day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {


        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", "Gray", 'M', 4);
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", "Gold", 'F', 8);
        dogs[2].setInfo("Molly", "Beagle", "Small", "White", 'F', 5);
        dogs[3].setInfo("Oliver", "Bulldog", "Small", "Black", 'M', 2);
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", "White", 'F', 3);
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", "Gold", 'M', 7);


        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));

       /* for (Dog dog : dogs) {
            if (dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }
        */
        System.out.println(smallDogs);

        System.out.println("________________________");

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age > 4);

        /*
           for (Dog dog : dogs) {
            if (dog.age <= 4){
                youngDogs.add(dog);
            }
        }


         */
        System.out.println(youngDogs);

        System.out.println("________________________");

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');

        System.out.println(femaleDogs);
        System.out.println("________________________");


        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println(maleDogs);
        System.out.println("________________________");


        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", "Medium", "Gray", 'M', 4);
        dogs2[1].setInfo("Chloe", "Golden Retriever", "Large", "Gold", 'F', 8);
        dogs2[2].setInfo("Molly", "Beagle", "Small", "White", 'F', 5);
        dogs2[3].setInfo("Oliver", "Bulldog", "Small", "Black", 'M', 2);
        dogs2[4].setInfo("Bella", "Bichon Frise", "Small", "White", 'F', 3);
        dogs2[5].setInfo("Loki", "Chow Chow", "Medium", "Gold", 'M', 7);


        ArrayList<Dog> list = new ArrayList<>( Arrays.asList(dogs2));

        list.removeIf(p-> p.size.equalsIgnoreCase("small"));

        // make sure that list is assigned to the array. -> wrong way to assign Arraylist to Array-> dogs2 = list;
        // dogs2 array variable should be referencing those dogs, so we convert arrayList to Array

        dogs2 = list.toArray(new Dog[0]);
        //when we instantiate the size of new Array,
        // size should be equal to list size, or we can give [0] or [list.size()]
        //if we give greater number than this list the remaining number will be null

        System.out.println(Arrays.toString(dogs2));














    }
}
/*
warmup tasks:
	1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops


 */
