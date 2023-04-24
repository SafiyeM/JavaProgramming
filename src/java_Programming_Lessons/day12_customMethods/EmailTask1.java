package java_Programming_Lessons.day12_customMethods;

public class EmailTask1 {
    public static void main(String[] args) {

        /*
        2. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and
       followed by an underscore and last name.

        Write a program that can swap first name with last name in the email
         (Separated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

         */

        String email= "mike_tyson@gmail.com";

        String firstName= email.substring(0, email.indexOf("_")); // till underscore but it is excluded!
        String lastName= email.substring(email.indexOf("_") +1, email.indexOf("@")); // beginning Index is included that's why we use +1
        String rest= email.substring(email.indexOf("@"));

        email= lastName+ "_" + firstName + rest;
        System.out.println(email);





    }
}
