package office_hours.week12.season;

public class Summer extends Season {


    public Summer(int highestTemperature, int lowestTemperature) {
        super(highestTemperature, lowestTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
/*
 Create a class Summer
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Drink Lemonade
 */