package java_Programming_Lessons.day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Lolli", "Golden Retriever", "large", "gold", 3, 'F');
        System.out.println(dog1);
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1.getName());

        Cat cat1 = new Cat();
        cat1.setInfo("Caramello", "British short hair", "medium", "beige", 2, 'M');
        System.out.println(cat1);
        cat1.meow();
        cat1.scratch();
        cat1.drink();
        cat1.sleep();

        System.out.println(cat1.getAge());


        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Haily", "Bengal", "Large", "Orange", 5, 'M');
        System.out.println(tiger1);
        tiger1.hunt();
        tiger1.drink();
        tiger1.sleep();
        tiger1.eat();



      boolean isequal  = tiger1.equals(dog1); // Object Class:  parent of all the classes ( implicitly inherited)
        System.out.println(isequal);




    }


}
