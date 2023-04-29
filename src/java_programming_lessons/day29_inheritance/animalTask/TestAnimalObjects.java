package java_programming_lessons.day29_inheritance.animalTask;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setInfo("Caramello", "BSH","Medium","Beige",2,'M');
        cat.sleep();
        cat.drink();
        cat.eat();
        cat.meow();
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setInfo("Max", "Golden Retriever", "Large", "Gold", 3, 'M');
        dog.drink();
        dog.bark();
        dog.eat();
        dog.sleep();
        System.out.println(dog);


    }




}
