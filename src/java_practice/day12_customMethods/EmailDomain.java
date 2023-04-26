package java_practice.day12_customMethods;

public class EmailDomain {
    public static void main(String[] args) {


        /*
        1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
         */

        emailDomain("Cydeo@gmail.com");


    }

    public static void emailDomain(String email){


        email= email.toLowerCase();


        String domain= email.substring(email.indexOf('@') +1, email.indexOf('.'));
        System.out.println(domain);



        /* or other solution
       int at= email.indexOf("@");

       int dot= email.indexOf(".");

        String domain= email.substring(at +1, dot);

        System.out.println(domain);

       */




    }




}
