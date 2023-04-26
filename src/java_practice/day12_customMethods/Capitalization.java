package java_practice.day12_customMethods;

public class Capitalization {
    public static void main(String[] args) {




      /*  2. Create a method named capitalization that can format the first and last names
        of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School


       */
capitalization("cyDeO", "sCHooL");



    }

    public static void capitalization (String firstName, String lastName){




        String formattedFirstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formattedLastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName=  formattedFirstName + " " + formattedLastName;

        System.out.println("Full name : " + fullName);




    }






    }

