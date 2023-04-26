package office_hours.week12.season;

public class Winter extends Season {


    public Winter(int highestTemperature, int lowestTemperature) {
        super(highestTemperature, lowestTemperature);
    }


    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
/*
 Create a class Winter
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace

 */