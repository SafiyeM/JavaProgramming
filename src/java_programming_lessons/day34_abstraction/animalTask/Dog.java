package java_programming_lessons.day34_abstraction.animalTask;

public class Dog extends Animal implements Playable {
    // as soon as the Dog Class implements Interface Playable,
    // we are getting compile error because Dog is non-abstract class
    // non-abstract classes can not inherit the abstract method as it is.
    // Every method in non-abstract method needs body.
    // So we give body by overriding the abstract method play() in the interface


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

        System.out.println("Dog " + getName() + " is eating dog food");
    }

    @Override
    public void play() {

        System.out.println("Dog " + getName() + " is playing with dog toys");
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

}
