package java_programming_lessons.day35_polymorphism;

import java_programming_lessons.day34_abstraction.animalTask.*;
import java_programming_lessons.day35_polymorphism.transportation.*;

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


        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "White", 2020, 55_000);

        // There must be relationship with reference type and object type
        // Tesla extend Car and implements Electric and AutoPilot(AutoPilot extends AutoPark)
        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla); // true
        // Car is not referencing Audi. It is only referencing Tesla Object, that's why Audio is not an instanceOf car
        System.out.println("isAudi = " + isAudi); // false
        System.out.println("isElectricCar = " + isElectricCar); // true
        System.out.println("hasAutoPark = " + hasAutoPark); // true
        System.out.println("hasAutoPilot = " + hasAutoPilot); // true

        System.out.println("------------------------------------------------");








    }
}
