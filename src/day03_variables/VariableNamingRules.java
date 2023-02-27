package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        // age of the student is 28
        // salary is 10000

        int age = 28; // if we write here x or y, we can not understand.
        int salary = 10000; // Names we give to variables should be understandable for everyone.

        // int age = 32; // we've already used age variable! Variable Name MUST be unique

        int phoneNumber = 123456789; /* when variable names contain two or more words,
                                       in order to make it more readable and understandable,
                                       the first character of second word should be upper case.
                                        We call it as Camel Case - ex. phoneNumber
                                      */

        double salaryBeforeTax = 100000.5; // Camel Case
        double salary_after_tax = 80000.5; // Underscore
        double salary_after$ = 70000.5; // we can use _ underscore and $ dollar sign to name variable
        // can not have special characters other than _ and $


        System.out.println("_________________________________________");

       /*
        int number= 10;
        int number= 20; // variable names must unique, can not be duplicated.
        */

        int number1 = 10; // digits after words or first character
        int _number2 = 40; // first character must be a-z or _ and $

        /*
        int 2number= 20; // variable names can not start with digits
        int 3number= 30;
         */
        int n$umber4 = 50; // after first character, we may use letters, digits,
        // _ underscore or  dollar sign $

        //double abstract= 5.5; // variable names can not be reserved words
        //such as abstract, if, public, final, boolean, etc.



        System.out.println("_________________________________________");

        //gender is male

        String gender= "Male";

        String fullName= "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);

    }
}
