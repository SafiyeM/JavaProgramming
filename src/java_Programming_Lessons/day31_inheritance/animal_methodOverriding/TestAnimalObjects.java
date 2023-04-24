package java_Programming_Lessons.day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {


        Cat cat = new Cat("Caramello", "BSH", 'M', 2, "Medium", "Beige");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African lion", 'F', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("_____________________________________________");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();


        System.out.println("______________________________________________________");

        cat.sleep(); // we override it -> Cat Caramello sleeps 18 hours in a day
        dog.sleep(); // no override -> Max sleeps 8 hours      (parents class' implementation gets executed)
        lion.sleep(); // no override -> Simba sleeps 8 hours   (parents class' implementation gets executed)
        eagle.sleep(); // no override -> Bella sleeps 8 hours  (parents class' implementation gets executed)






    }



}
