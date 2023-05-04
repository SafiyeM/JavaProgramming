package java_programming_lessons.day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

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
