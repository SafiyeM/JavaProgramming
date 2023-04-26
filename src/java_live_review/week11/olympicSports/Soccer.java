package java_live_review.week11.olympicSports;

import office_hours.week11.morning.workout.OlympicSport;

public class Soccer extends OlympicSport {


    public Soccer(String name, int participants) {
        super(name, participants);
    }

    public void compete(){
      System.out.println(" \" playing a soccer game\"");

    }
}
/*
- Create a class Soccer

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Playing a soccer game

 */