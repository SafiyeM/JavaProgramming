package java_live_review.week13.exercise;

public class Gym {

    public static void main(String[] args) {

       // Exercise obj = new Exercise();
        // can not instantiate abstract classes


        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));


       // Lifting lifting = new Lifting();
        // can not instantiate abstract classes

        Bench bench = new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(15));


    }
}
/*
create a class Gym to test the objects and methods
 */