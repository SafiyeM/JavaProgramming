package java_live_review.week13.exercise;

public class Bench extends Lifting {

    // if we implement in Lifting class all the abstract method,
    // we do not have to implement here all of them

    @Override
    public void perform() {
        System.out.println("Bench pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }

    @Override
    public void rackWeight() {

        System.out.println("Racking on top");
    }
}
/*
create a class Bench
	inherit the Lifting class and implement the abstract methods
	for calories method return minutes * 5
 */