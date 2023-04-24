package java_Programming_Lessons.day18_garbageCollection;

public class Pizza {

    // instance objects --> it means for each pizza all the information can be different
public char size;
public int numberOfCheeseTopping,  numberOfPepperoniTopping;

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


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){

        this.size= size;
        this.numberOfCheeseTopping= numberOfCheeseTopping;
        this.numberOfPepperoniTopping= numberOfPepperoniTopping;


    }

// It is used for displaying pizza info
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }







}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping,
				and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping

 */

