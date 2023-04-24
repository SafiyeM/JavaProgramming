package java_Live_Review.week11.olympicSports;

public class Surfing extends OlympicSport {


    public Surfing(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete(){
        System.out.println(name + " is surfing the waves");
    }

}
/*
 Create a class Surfing

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Surfing the waves
 */