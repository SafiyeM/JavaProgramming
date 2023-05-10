package java_live_review.week13.exercise;

public final class Running extends Exercise {


    @Override
    public void perform() {

        System.out.println("Running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }

}
/*
	create a class Running
	inherit the Exercise class and implement the abstract methods
	for calories method return minutes * 15
 */