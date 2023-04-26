package java_live_review.week11.olympicSports;

public class Track extends OlympicSport {

    // we get compile error, because there is no default constructor in OlympicSport class.
    // That's why we need to create constructor matching super class

    public Track(String name, int participants) {
        super(name, participants);
    }


    @Override
    public void compete(){
        System.out.println("Track for running, juming, throwing");
    }


}
/*
- Create a class Track

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Track for running, jumping, throwing
 */