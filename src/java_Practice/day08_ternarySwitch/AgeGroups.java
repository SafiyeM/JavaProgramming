package java_Practice.day08_ternarySwitch;

public class AgeGroups {

    public static void main(String[] args) {


        // Nested Ternary If Statement

        int age = 15;
        String result = "";

        if (age >= 0 && age <= 150) {
            // -->> Pre-Condition Statement


            result =  (age <= 2)  ? "infant"   : (age <= 5)  ? "Toddler"
                    : (age <= 9)  ? "Kid"      : (age <= 12) ? "Pre-Teen"
                    : (age <= 17) ? "Teenager" : (age <= 20) ? "Young Adult"
                    : (age <= 39) ? "Adult"    : (age <= 49) ? "Young Middle-Aged Adult"
                    : (age <= 54) ? "Middle-Aged Adult"    : (age <= 64) ? "Very Young Senior Citizen"
                    : (age <= 74) ? "Young Senior Citizen" : (age <= 84) ? "Senior Citizen"
                    : "Old Senior Citizen";


        } else {
            result = "Invalid age";// -->> Else Statement of Pre-Condition
        }
        System.out.println(result);



        // also: result= (age<=2) ? "infant"
        //              :(age <=5) ? "Toddler"
        //              :(age<=9) ? " Kid" ............


    }
}
/*
        3. Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
         */