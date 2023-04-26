package java_live_review.week11.olympicSports;

import office_hours.week11.morning.workout.OlympicSport;

public class Surfing extends OlympicSport {



    public Surfing(String name, int participants) {
        super(name, participants);
    }


    @Override
    public void compete() {
        System.out.println("surfing the waves");
    }
}



/*
 Create a class Surfing

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Surfing the waves
 */