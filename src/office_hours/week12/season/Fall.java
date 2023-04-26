package office_hours.week12.season;

public class Fall extends Season {


    public Fall(int highestTemperature, int lowestTemperature) {
        super(highestTemperature, lowestTemperature);
    }


    @Override
    public void activity() {
        System.out.println("Read A Book");
    }
}
/*
Create a class Fall
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book

 */