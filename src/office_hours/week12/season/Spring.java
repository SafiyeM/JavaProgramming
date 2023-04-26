package office_hours.week12.season;

public class Spring extends Season{

    public Spring(int highestTemperature, int lowestTemperature ){
        super(highestTemperature, lowestTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }
}

/*
 Create a class Spring
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside

 */