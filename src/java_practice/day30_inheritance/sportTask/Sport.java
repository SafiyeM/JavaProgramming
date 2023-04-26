package java_practice.day30_inheritance.sportTask;

public class Sport {


    private String name;
    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;


    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    //numberOfPlayers can not be set to zero or negative
    public void setNumberOfPlayers(int numberOfPlayers) {

        if (numberOfPlayers <= 0){
            System.err.println("Invalid number of player: " +numberOfPlayers);
            return;
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    //numberOfReferee can not be set to zero or negative
    public void setNumberOfReferee(int numberOfReferee) {
        if (numberOfReferee <=0){
            System.err.println("Invalid number of Referee: " + numberOfReferee);
            return;
        }
        this.numberOfReferee = numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void play(){
        System.out.println(name +" is playing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
/*
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferee, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferee can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

					2. create the following subclasses of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on Google
 */