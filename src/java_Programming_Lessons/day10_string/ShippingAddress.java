package java_Programming_Lessons.day10_string;
import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {
        /*

Warmup tasks:
	1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your building name:");
        String buildingName= scan.next();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName= scan.nextLine();


        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();

        System.out.println("Enter your state");
        String state= scan.nextLine();

        System.out.println("Enter your zip code");
        String zipCode= scan.next();


        System.out.println("Your shipping address is:" +
                           "\n\t" + fullName+
                           "\n\t"+ buildingName +" "+ streetName+
                           "\n\t"+ cityName +", "+ state + " "+zipCode);







        scan.close();
    }
}
