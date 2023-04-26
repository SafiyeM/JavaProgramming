package office_hours.week12.season;

import java_live_review.week10.drink.Drink;

public class Season {


    String name;
    int highestTemperature;
    int lowestTemperature;


    public Season(int highestTemperature, int lowestTemperature) {
        this.name = getClass().getSimpleName();
        this.highestTemperature = highestTemperature;
        this.lowestTemperature = lowestTemperature;
    }


    public void activity(){

    }

    @Override
    public String toString() {
        return "Season= " + name +
                ", the highest average temperature= " + highestTemperature +
                ", the lowest average temperature= " + lowestTemperature ;
    }
}

/*

    Create a class Season

        instance variables
            - name
            - the highest average temperature
            - the lowest average temperature

        constructor:
            - initialize all fields

        methods:
            - activity(), toString()
            override activity in subclasses

 */