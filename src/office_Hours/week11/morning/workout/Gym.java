package office_Hours.week11.morning.workout;

public class Gym {

    public static void main(String[] args) {



        src.office_Hours.week11.morning.workout.Workout bench = new src.office_Hours.week11.morning.workout.Workout("Bench Press", 60, 100);
        System.out.println(bench);

        src.office_Hours.week11.morning.workout.Workout pushup = new src.office_Hours.week11.morning.workout.Workout("Pushup23", -10, 2000); // invalid data we get only default value-> Workout{name='null', minutes=0, caloriesBurned=0}
        System.out.println(pushup);

        pushup.setName("Push Up");
        pushup.setMinutes(10);
        pushup.setCaloriesBurned(120);
        System.out.println("Doing "+ pushup.getName() + " for "+ pushup.getMinutes()+
                " minutes and burning "+ pushup.getCaloriesBurned() + " calories");

    }
}
