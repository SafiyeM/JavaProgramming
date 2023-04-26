package java_programming_lessons.day29_inheritance.animalTask;

public class Dog extends Animal{ // Dog Is An animal
    //      Child        Parent


 /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        setInfo();
        eat();
        drink();
        sleep();
        toString();

7 variables
5 methods

    }
    */

    public void bark(){

        System.out.println(getName() + " is barking");
    }

}
/*
1. Dog
			attributes:

			methods:
					 bark()

 */