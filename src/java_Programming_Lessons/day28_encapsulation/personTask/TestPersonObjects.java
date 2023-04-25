package java_Programming_Lessons.day28_encapsulation.personTask;

public class TestPersonObjects {


    public static void main(String[] args) {


        Person person1 = new Person("Ina");
        Person person2 = new Person("Nala", 20);
        Person person3 = new Person("Mehmet", 'F');
        Person person4 = new Person("Lucy", 25, 'F', "English");


        System.out.println(person4.name);
        person4.name ="James";
        System.out.println(person4.name);
        System.out.println();

        // person1.planet = "Mars"; //-> calling static through object name is not a good practice
        // Person.planet = "Mars"; // because static does not belong to objects, it belongs to class
        System.out.println(Person.planet); // we can call through class name

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Person.printPlanetName();

        person1.eat("pizza");
        person2.drink("water");
        person4.drink("tea");






    }
}
