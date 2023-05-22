package office_hours.week14.movie;

public abstract class StreamingSite implements PlayMovie, HasSubscription{

    String url;
    double subscriptionAmount;
    int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    abstract void pause();

}
/*
- Create an abstract class StreamingSite
        implement the PlayMovie & HasSubscription interfaces - don't need to implement the methods

           create the following instance variables:
            url, subscription amount, movies available(int)

        create a constructor to initialize all the variables

        create an abstract method:
            pause()
 */