package office_hours.week14.movie;

public final class Amazon extends StreamingSite{


    public Amazon(double subscriptionAmount, int moviesAvailable) {
        super("www.amazon.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscription to amazon prime");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Playing " + movie.getTitle() + " on amazon video");
    }

    @Override
    public void pause() {
        System.out.println("Paused with space");
    }
}
/*
- Create a final class Amazon
        inherit the StreamingSite class and implement all the methods
 */