package java_Practice.day27_static.dog;

public class TestDog {


    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Hasky", "Medium", "Gold", 'M',3, true);

        dog.bark();
        dog.play();
        dog.drink();
        System.out.println(Dog.numberOfLegs);
        System.out.println(Dog.numberOfEyes);
        dog.sleep();

        System.out.println(dog);


    }
}
