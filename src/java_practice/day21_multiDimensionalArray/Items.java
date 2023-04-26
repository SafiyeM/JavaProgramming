package java_practice.day21_multiDimensionalArray;

public class Items {


    public static void main(String[] args) {


        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

       // #1
        for (String[] eachItem : items) {

            for (String eachElement : eachItem) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();

        }

        System.out.println("______________________________");

        // #2

        for (String[] eachItem : items) {

            for (int i = eachItem.length - 1; i >= 0; i--) {

                System.out.print(eachItem[i] + "\t");
            }

            System.out.println();
        }

        System.out.println("_________________________________");


        for (int i = items.length - 1; i >= 0; i--) {  //iteration begins from reversed order 2. index of items array

            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

/*
 j is the index variable used to access the elements of each subarray in the items 2D array,
 one subarray at a time, as determined by the outer loop variable i.
 */





    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado


 */