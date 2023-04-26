package java_practice.day28_encapsulation.credentials;

public class TestCredential {

    public static void main(String[] args) {


        Credentials credentials = new Credentials("Cydeo", "Woodenspoon@29");

        System.out.println(credentials);

        credentials.setPassword("Cydeo#Batch29");

        System.out.println(credentials.getPassword());









    }



}
