package office_Hours.week07;

public class SportsTeam {





    /*
    T5SportsTeam [object type]

    Create a class called SportsTeam
    declare these instance variables:
        name, number of players, coach, win/loss record, country, number of fans
    */
    String name;
    int numberOfPlayers;
    String coach;
    String winLossRecord;
    String country;
    int numberOFFans;



    /*
    create a setInfo() method to initialize these variables
    */

    public void setInfo(String name, int numberOfPlayers, String coach, String winLossRecord, String country, int numberOFFans) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
        this.winLossRecord = winLossRecord;
        this.country = country;
        this.numberOFFans = numberOFFans;
    }

    /*
    create a method joinFanclub
        it is a void method with no parameters, but whenever it is run the number of fans increases by one

    */
    public void joinFanClup(){
        numberOFFans++;
    }

    /*
    create a toString() that shows the information in the following format:
        The $name sports team is based out of $country. A total of $player players are led by
         $coach and currently hold a $record record of wins and losses. They have $fans fans.

    use the ObjectTester class and create some SportsTeam objects
     */



    public String toString(){
        return "The " + name+ " sports team is based out of " + country+ ". A total of " +numberOfPlayers+ " players are led by\n" +
                coach+" and currently hold a "+ winLossRecord+  " of wins and losses. They have " + numberOFFans+ " fans.";
    }



}
