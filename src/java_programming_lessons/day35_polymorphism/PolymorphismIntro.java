package java_programming_lessons.day35_polymorphism;

import java_programming_lessons.day31_inheritance.shape_methodOverriding.Circle;
import java_programming_lessons.day33_abstraction.employeeTask.*;
import java_programming_lessons.day34_abstraction.animalTask.*;
import java_programming_lessons.day34_abstraction.carTask.Audi;
import java_programming_lessons.day34_abstraction.carTask.Car;
import java_programming_lessons.day34_abstraction.carTask.Honda;
import java_programming_lessons.day34_abstraction.carTask.Tesla;

import java.util.Arrays;


public class PolymorphismIntro {


    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', 4, "small", "white");
        Cat cat = new Cat("Caramello", "BSH", 'M', 2, "medium", "beige");

        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        /*
        Reference Type       Object Type
        Animal animal1   =   new Dog();
        Flyable anima2   =   new Parrot();
                      POLYMORPHISM RULES
        * Reference type can be parent class or interface
        * Object type can be any extending or implementing child class
        * REFERENCE TYPE = decides what is accessible
        * OBJECT TYPE = determines which implementation will be executed when we call the method
                      because reference types method could be overridden in many subclasses,
                      so it could have different implementations
         */



        // Parent Class is being referenced to all the child objects
        // This is a POLYMORPHISM
        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        // There is no "IS A" relationship between Animal and Tesla, It is not a Polymorphism
        // Animal can not be referenced to the Tesla objects
        // Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);



        Animal animal = new Dog("Max", "Husky", 'M', 4, "small", "white");

        animal.eat();
        animal.drink();
        animal.sleep();

        // methods from child class
        // animal.play(); child can never reference to the parent
        // animal.bark();

        System.out.println("________________________________");

        String str = "Java";

        Integer n = 108;

        Boolean r = false;

        Double d = 10.5;


        Circle circle = new Circle(4);


        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);


        Teacher teacher = new Teacher("Rebecca", 35, 'F', "B1", "Math Teacher", 75000);

        Tester tester = new Tester("Safiye", 40, 'F', "C34", "SDET", 80000);

        Driver driver = new Driver("Max", 38, 'M', "W35", "Taxi Driver", 50000);

        Developer developer = new Developer("Lucy", 35, 'F', "C2", "Java Developer", 95000, "Java");


        // This is POLYMORPHISM
        //Object, parent of all classes, is referencing to any objects
        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, tester, driver, developer};

        System.out.println(Arrays.toString(objects));

        // Object we use rare, we use 'Object' only, if the objects are not from the same categories,
        // and we still want the reference type to reference to them all.


        // when we have objects in the same category, it is better to specify instead of using Object Class
        // Benefits -> more specify
        Employee[] employee = {teacher, tester, driver, developer};

        // Polymorphism -> Only the methods/variables in reference type can be called
        Object obj = new Developer("Lucy", 35, 'F', "C2", "Java Developer", 95000, "Java");
        // obj.work(); compile error -> the method is from Developer object type, not exist in Object

        // It is better to use more specified reference type of the objects in the same category
        Employee obj1 = new Developer("Lucy", 35, 'F', "C2", "Java Developer", 95000, "Java");
        obj1.work(); // no error -> this method exists in Employee Class and was inherited in Developer object
        // When we call a method, it will call overridden version from a child class

        Employee obj2 = new Teacher("Rebecca", 35, 'F', "B1", "Math Teacher", 75000);
        obj2.work();  // obj2 is referencing teacher object, it will be executed object types version

        Employee obj3 = new Driver("Max", 38, 'M', "W35", "Taxi Driver", 50000);
        obj3.work(); // object type decides what implementation should be executed.
        // But REFERENCE TYPE makes the ULTIMATE DECISION, whether we can call or not call the method


        //NO POLYMORPHISM -> both reference and object type is Tesla Class
        Tesla car1 = new Tesla("Model Y", "White", 2020, 55000);
        car1.start();
        car1.autoPilot();

        // with POLYMORPHISM
        Car car2 = new Tesla("Model Y", "White", 2020, 55000);
        car2.start();
        //  car2.autoPilot(); -> we can not call, because reference type does not have this method
        //  The reference type is the one that decides what kind of feature and methods we can call.


    }
}
