package java_Live_Review.week11.olympicSports;

import office_Hours.week11.morning.workout.OlympicSport;

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