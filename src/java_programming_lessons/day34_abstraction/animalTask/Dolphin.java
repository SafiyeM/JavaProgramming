package java_programming_lessons.day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

        System.out.println("Dolpin "+ getName() +" is eating fish");
    }

    @Override
    public void play() {
        System.out.println("Dolphin " +getName() + " loves to play with ball");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin " + getName() + " likes to swim in group");
    }
}
