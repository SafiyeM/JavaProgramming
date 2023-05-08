package java_programming_lessons.day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle " + getName() + " can fly as high as 10,000 to 20,000 feet above sea level");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle " + getName() + " is hunting Owls");
    }
}
