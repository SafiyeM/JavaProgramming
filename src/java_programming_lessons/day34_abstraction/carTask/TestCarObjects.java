package java_programming_lessons.day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

       // Car car1 = new Car("X6", "Red", 2020,45000); -> Car is abstract, can not be instantiated

        // Subclasses are concrete classes(non-abstract), we can create objects from those classes
       Honda honda = new Honda("Pilot", "Black", 2019, 35000);
       Audi audi = new Audi("Q6", "Silver", 2020, 36000);
       Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        System.out.println();

        honda.stop(); // final method -> the same implementations for all objects
        audi.stop();
        tesla.stop();

        System.out.println();

        honda.start(); // abstract method -> different implementation
        audi.start();
        tesla.start();

        System.out.println();
        audi.autoPark();
        tesla.autoPilot();

    }
}
