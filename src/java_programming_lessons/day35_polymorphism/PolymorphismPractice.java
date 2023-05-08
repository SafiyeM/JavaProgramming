package java_programming_lessons.day35_polymorphism;

import java_programming_lessons.day34_abstraction.animalTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        //NOT COMPLETED


        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        // When we call a method, it will call overridden version from a child class
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //  tiger.hunt(); -> if method does not exist in reference type(Animal Class), we can not call it in polymorphism


        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly(); does not exist in reference type
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");;
        // obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);


        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        Flyable[] birds = { parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck, dolphin};


        // Instanceof keyword can be used to check if the object is certain class. (Returns boolean)
        boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal);  // true

        System.out.println(isAnimal);







    }
}
