package java_programming_lessons.day36_polymorphism;

import java_programming_lessons.day29_inheritance.animalTask.Animal;
import java_programming_lessons.day29_inheritance.animalTask.Cat;
import java_programming_lessons.day29_inheritance.animalTask.Dog;
import java_programming_lessons.day30_inheritance.phoneTask.IPhone;
import java_programming_lessons.day30_inheritance.phoneTask.Nokia;
import java_programming_lessons.day30_inheritance.phoneTask.Phone;
import java_programming_lessons.day33_abstraction.employeeTask.*;
import java_programming_lessons.day35_polymorphism.transportation.AutoPilot;
import java_programming_lessons.day35_polymorphism.transportation.Electric;
import java_programming_lessons.day35_polymorphism.transportation.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //  Cat cat = new Dog();

        // Polymorphism - Parent(Animal) is referencing to the child(Dog)
        Animal animal = new Dog();  // upcasting (implicitly) -> (Animal)new Dog();

        System.out.println("_____________________________________");


        Animal animal1 = new Dog(); // upcasting implicitly --> Polymorphism
        animal1.setInfo("Max", "Husky", "Small", "White", 4, 'M');

        //reference type decides accessible of variables and methods
        animal1.eat();
        animal1.drink();
        animal1.sleep();

        // animal1.bark(); -> no access because reference type is animal not dog

        // but we can apply DOWN-CASTING to call and get the method of dog
        ((Dog) animal1).bark(); // we can not reuse this down-casting

        //    Dog dog1 = (Dog)animal1; // this down-casting is reusable because we assign it into a variable
        //     dog1.bark();


        //  ( (Cat)animal1 ).scratch(); ClassCastException
        // when down-casting, make sure if there is a relationship between the object and the type that we are casting to.
        // because this reference variable 'animal1' is referencing the object 'Dog'
        // and there is no relationship between cat and dog, so Dog can not be converted to Cat


        System.out.println("_____________________________________");

        // Parent class being referenced to the child object -> Polymorphism
        // UpCasting
        Phone phone = new Nokia("XR20", "Blue", "Small", 350);

        phone.call(911);
        phone.text(123456789);
        ((Nokia) phone).selfDefense();  //-> this method is in object type, belongs to Nokia class

        // down-casting
        //  ((IPhone)phone).faceTime(1234567); // ClassCastException
        // because phone is referencing to Nokia not Iphone


        Employee employee = new Developer("Lucy", 35, 'F', "C2","Java Developer",95000,"Java");

        employee.work(); // we can call because Employee has work() method
        System.out.println( ((Developer) employee).getProgrammingLanguage() );  // employee does not have this method, so we down cast

       // Tester tester = (Tester)employee; 'employee' is referencing Developer and there is NO 'IS RELATION' between Developer and Tester
       // System.out.println(tester);  ->  ClassCastException


        Electric electric = new Tesla("Model Y", "White", 2020, 55000);

        // upcasting -> parent type(Electric) being referenced to the child obj.(Tesla)
        electric.charge();

        // down-casting -> reference type decides what can be accessed/called
        ((Tesla)electric).autoPilot();
        ((AutoPilot)electric).autoPilot(); // Tesla obj. can be referenced by AutoPilot instead of Electric because
                                           // there is relationship between Tesla and AutoPilot


        Employee employee1 = new Teacher("Rebecca", 35,'F',"B1","Math Teacher",75000);

        Employee employee2 = new Tester("Safiye",40, 'F',"C34","SDET",80000);

        Employee employee3 = new Driver("Max",38,'M',"W35","Taxi Driver",50000);

        Employee employee4 = new Developer("Lucy", 35, 'F', "C2","Java Developer",95000,"Java");


        // when we call the method as long as it is overridden, the overridden version(in subclass) always gets executed
        // if it is not overridden, then the original version (in parent class) gets executed
        employee1.work(); // object type's method gets executed -> object type decides which implementation will be executed
        employee2.work();
        employee3.work();
        employee4.work();




    }

}
