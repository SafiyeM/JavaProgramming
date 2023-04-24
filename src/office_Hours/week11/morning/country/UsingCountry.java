package office_Hours.week11.morning.country;

public class UsingCountry {


    public static void main(String[] args) {

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.co2Level);
        System.out.println();
        Country.countryInfo(); // calling the method to display the info we have


        // Country.name; name is an instance variable so it can not be accessed in a static way. We need to create an object

        Country us= new Country("US", 350, "North america");

        System.out.println(us);




    }


}
