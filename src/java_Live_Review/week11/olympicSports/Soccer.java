package java_Live_Review.week11.olympicSports;

public class Soccer extends OlympicSport{


    public Soccer(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println(name+ " playing a soccer game");
    }
}
/*
- Create a class Soccer

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Playing a soccer game

 */