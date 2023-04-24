package java_Practice.day25_constructor.movieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {


    public String country, title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;


    public Movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        casts = new ArrayList<>();
    }


    public void addCast(String name){

        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts


 */