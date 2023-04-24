package java_Live_Review.week7;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //- Find and print all the first and last characters

        for (String country:countries ){ // country will be each element

            System.out.println(country.charAt(0) + " "+ country.charAt(country.length()-1));
        }

        System.out.println("_____________________________________________________");
        //- Find the largest and smaller countries based on the length of their names

        String small= countries[0];
        String large= countries[0];

        for (String each : countries){

            if (each.length() < small.length()){
                small= each;
            } else if (each.length() > large.length()){
                large=each;
            }
        }

        System.out.println(small);
        System.out.println(large);


        System.out.println("_______________________________________");

        // - Show all the countries that start with a 'C'

        String hasC= "";

        for (int i = 0; i < countries.length; i++) { // this loops iterates the array
            if (countries[i].startsWith("C")){ //  if (countries[i].toLowerCase().startsWith("c"))
                hasC+= countries[i] + ", ";
            }
        }
        System.out.println(hasC);
        String[] hasCArr= hasC.split(", ");
        System.out.println(Arrays.toString(hasCArr));

        System.out.println("----------------------------------------");
        // - Show all the countries that end with an 's'

        String ends = "";
        for(String each : countries){
            if(each.endsWith("s")) {
                ends += each + ", ";
            }
        }

        System.out.println(ends);
        String[] endsArr = ends.split(", ");
        System.out.println(Arrays.toString(endsArr));

        System.out.println("----------------------------------------");
        // - Show the countries names in alphabetical order
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));




    }
}
/*
Countries [array, String, loops]

    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

    - Show the countries names in alphabetical order

 */