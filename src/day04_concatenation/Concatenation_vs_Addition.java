package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {


        System.out.println("32" + 1); // "321" on the console --> String + number= String

        System.out.println(7 +"1"); // "71"

        System.out.println("13" + "2"); //"132"


        System.out.println("________________________________________");

        System.out.println(12+2.5); // this is addition not concatenation because there is no String

        System.out.println("________________________________________");

        System.out.println("the value is " +true); // concatenation allows us to link anything to a String
                                                  //  to get the String value at the end

    }
}
