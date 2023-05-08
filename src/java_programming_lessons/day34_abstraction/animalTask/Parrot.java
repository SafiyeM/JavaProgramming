package java_programming_lessons.day34_abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    // Parrot inherits second interface Flyable that has abstract method.
    // So it can not have a method without a body, therefore it has ti override the abstract fly() method



    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+ getName() + " is eating birdseed");
    }

    @Override
    public void play() {
        System.out.println("Parrot "+ getName() + " is playing with noisy toys");
    }

    @Override
    public void fly() {
        System.out.println("Parrot " + getName() + " can fly on a non-stop flight of 100km" );
    }
}
