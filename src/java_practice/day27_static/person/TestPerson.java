package java_practice.day27_static.person;

public class TestPerson {

    public static void main(String[] args) {


        Person person = new Person("Hazal", "Turkish", 29, 'F');


        person.drink("Water");
        person.eat("Pizza");
        System.out.println(Person.isHuman);
        System.out.println(Person.numberOfHead);

        System.out.println(person);


    }









}
