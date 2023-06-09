package office_hours.week11.morning.workout;

public class OlympicSport {



    String name;
    int participants;

    static int yearOfFirstOlympics= 1896;


    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public void compete(){

        System.out.println(name + " is competing");
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
/*
Create a class OlympicSport
		instance variables
			- name (String)
			- participants (int)
		static variable: year of first Olympics: 1896
		constructor:
			- initialize all fields
		methods:
			- compete()
		-> override compete in subclasses
		 - override toString()
 */
