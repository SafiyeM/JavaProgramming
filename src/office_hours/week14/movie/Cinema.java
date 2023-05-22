package office_hours.week14.movie;

import java.util.ArrayList;

public final class Cinema implements PlayMovie {
//final->  we do not make this parent class


    String location;
    int numberOfTheaters;
    ArrayList<Movie> movies;

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);

    }

    @Override
    public void playMovie(Movie movie) {

        System.out.println(movie.getTitle() + " Starting, please grab your popcorn and turn your phones off");
    }

    public void buyTicket(Movie movie) {
        int cost = 0;

        switch (movie.getRating()) {
            case 5:
                cost = 25;
                break;
            case 3:
            case 4:
                cost = 20;
                break;
            default:
                cost = 15;
        }

        System.out.println(movie.getTitle() + " costs $" + cost);

    }

    @Override
    public String toString() {
        return "location: " + location + " has " + numberOfTheaters +
                " theaters\nmovies available: " + movies;
    }
}
/*

    - Create a final class Cinema
        create the following instance variables:
            location, number of theaters, List of Movies

              create a constructor to initialize all the variables
        implement the PlayMovie & implement the playMovie method to say:
         "Moving Starting, please grab your popcorn and turn your phones off"

        create a method buyTicket(Movie):
            print how much a movie ticket is. The cost is based on the rating of the movie.
            If it is a 5 the movie costs 25, if it is 3 or 4 it cost 20 and any other rating is 15

        create a toString that will display the information about the Cinema and which Movies are available to watch
 */