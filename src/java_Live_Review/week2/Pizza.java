package java_Live_Review.week2;

public class Pizza {
    public static void main(String[] args) {

        String  pizzaType= "Margarita";
        int     slices= 8,
                numberOfPeople= 3;

        int     eachShare= 2, // each gets 2 slices
                remainderSlices= slices % numberOfPeople; // remainder slices

        System.out.println("We ordered a "+ pizzaType+ " pizza with " +slices+ " slices. "+ numberOfPeople+ " people ate "+ eachShare+ " slices each," +
                " so there was " +remainderSlices+ " slices left");

        System.out.println("________________________________-");


        // Saim's Code
        String summary = "We ordered a " + pizzaType + " pizza with " + slices + " slices. " + numberOfPeople +
                " people ate " + (slices/numberOfPeople) + " slices each so there was " + (slices % numberOfPeople) +
                " slices left";
        System.out.println(summary);



    }
}
/*
Pizza [variables, operators, concatenation]

	Declare and assign the following variables
		type (type of pizza), slices (how many slices the pizza has), and people (the number of people eating this pizza)

	Calculate how many slices each person will get and how many are left over. Print the output in this format:

		We ordered a $type pizza with $slices slices. $number_of_people people ate $each_share slices each,
		 so there was $remainder slices left

		Ex: We ordered a cheese pizza with 8 slices. 3 people ate 2 slices each, so there was 2 slices left

 */