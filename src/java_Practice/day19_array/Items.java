package java_Practice.day19_array;

public class Items {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

// Find the first index of "Gloves"

        int glovesIndex = -1; //the variable glovesIndex is initialized to -1 as a flag value.

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                glovesIndex = i;
                break;
            }
        }

        System.out.println("glovesIndex = " + glovesIndex);
// Check if "iPad" is in the list

        boolean iPadContains = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                iPadContains = true;
                break;
            }
        }
        System.out.println("iPadContains = " + iPadContains);


// Print the report of each shopping item

        System.out.println("Shopping Report:");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }






       /* String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0,  9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};


        int indexNumOfGloves= -1;
        boolean hasIPad= false;
        String report= "";

        for (int i = 0; i < items.length; i++) {

            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            if (itemName.equals("Gloves")){
                indexNumOfGloves= i;
            }

            if (itemName.contains("iPad")){
               hasIPad= true;
            }

            report += itemName + " - " + itemPrice + " - " + itemID + "\n";

        }


        System.out.println("indexNumOfGloves = " + indexNumOfGloves);
        System.out.println("hasIPad = " + hasIPad);
        System.out.println(report);



        */


    }
}



/*

3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */
