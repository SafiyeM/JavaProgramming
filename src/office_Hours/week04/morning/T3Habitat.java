package office_Hours.week04.morning;

public class T3Habitat {
    public static void main(String[] args) {

        /*
        T3Habitat [switch, variables]

	Create a program that will define a String variable of the habitat you want information on.
	 We should get back information about the animals that can be found in those habitats

	use the following data and make creative messages for the output
		habitat - animals

		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
         */

        String habitat = "jungle", animals = "";

        switch (habitat){

            case "grasslands":
                animals= "goats, bison, badgers, coyotes";
                break;
            case "jungle":
                animals= "snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                animals= "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                animals= "lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                System.out.println("No data for "+habitat);


        }

        System.out.println("In the " + habitat + " you will able to find: " + animals);





    }
}
