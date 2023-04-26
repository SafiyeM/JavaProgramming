package java_practice.day25_constructor.movieTask;

import java.time.LocalDate;

public class TestMovie {


    public static void main(String[] args) {



        String[] casts = {"Ozzy", "Ali", "Muhtar", "Sevilay", "Gulnaz", "Ibrahim", "Hamide", "Sahide", "Cigdem"};

        Movie obj1 = new Movie("USA", "Java Developer: Zero to Hero", "Adventure, Comedy, Thriller",
                "Kuzzat Altay", LocalDate.of(2021, 4, 18));

       obj1.addCasts(casts);

        System.out.println(obj1);

    }
}
/*
 2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */