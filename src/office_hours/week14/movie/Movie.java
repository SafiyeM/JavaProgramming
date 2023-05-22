package office_hours.week14.movie;

public final class Movie {

    private String title;
    private int rating;
    private int minute;
    private int year;

    public Movie(String title, int rating, int minute, int year) {
        this.title = title;
        this.rating = rating;
        this.minute = minute;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", minute=" + minute +
                ", year=" + year +
                '}';
    }
}
/*
    - Create a final class Movie
        create the following instance variables:
            title, rating(out of 5), duration(minutes), year

        create a constructor to initialize all the variables

        encapsulate the class

        create a toString to print the information of the Movie
 */