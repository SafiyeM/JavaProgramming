package java_programming_lessons.day32_finalKeyword.carTask_MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }


    public void autoPilot(){

        System.out.println(getMake() + " " + getModel() + " is in self-driving mode");
    }

    @Override // optional to use this @Override keyword - it is used to verify, if it is overridden or not
    public void setModel(String model) {

        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));

        if (!models.contains(model)){  // if specified model is not valid model
            System.err.println("Invalid Tesla Model " +model );
            System.exit(1);
        }
           super.setModel(model); // to set model variable from Car class we use 'super' keyword instead of 'this'

    }


    @Override
    public void setColor(String color) {
        //or we can use an ArrayList

        String[] colors = {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"};

        if (!Arrays.asList(colors).contains(color)){
            System.err.println("Invalid Tesla Color " + color);
            System.exit(1);
        }
        super.setColor(color);  // if it is valid, we set the super class' color

    }


    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Invalid Year: " +year);
            System.exit(1);
        }
        super.setYear(year);
    }


    @Override
    public void setPrice(double price) {

        if (price < 50000){
            System.err.println("Invalid price for Tesla car: " + price);
            System.exit(1);
        }

        super.setPrice(price);
    }
}
/*
 Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k

 */