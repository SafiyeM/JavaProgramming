package java_practice.day26_statics.person;

public class TestPerson {

    public static void main(String[] args) {


        Person person1 = new Person("Nina", 30, 'F');

        Person person2 = new Person("Asya", 35, 'F');

        System.out.println(person1);
        System.out.println(person2);

        person1.eat("Pizza");
        person2.drink("Water");
        person1.sleep();
        person2.sleep();


    }
}
