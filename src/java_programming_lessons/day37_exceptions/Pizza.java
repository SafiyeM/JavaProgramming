package java_programming_lessons.day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    //calculates the total price of the pizza, returns it a double
    public double calcCost() {
        double totalPrice= 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice= 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice= 12 + 2 * (numberOfCheeseTopping +numberOfCheeseTopping);
                break;
            case  'L':
            case 'l':
                totalPrice= 14 + 2 * (numberOfCheeseTopping + numberOfCheeseTopping);
                break;

            default:
                System.out.println("invalid size: " +size);
        }
        return totalPrice;

    /*
                        S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
     */

    }


    // It is used for displaying pizza info
    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }


   // Parameter of equals method is Object because it is using the Parent of all the class
    // so when we call the equals method any object can be accepted into it.
    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Pizza)){ // // if the given object is not Pizza
           System.err.println("Invalid object " +obj);
           System.exit(1);
       }


       // this variable referencing the same obj to the obj in parameter referencing to.
       // assigned down-casting in a reference variable, if we need to use it more than once
       Pizza givenPizza  = ((Pizza)obj);

       // we use nested if instead of && operator because the condition will be too long
       if (size == givenPizza.getSize()){ // if the size of the Pizza is equal to the given Pizza' size
           if ( numberOfPepperoniTopping == givenPizza.getNumberOfPepperoniTopping() ){ // if numberOfPepperoniTopping of the Pizza is equal to the given Pizza' numberOfPepperoniTopping
               return true;
           }
       }
       return false;
    }
}
/*
1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object


 */