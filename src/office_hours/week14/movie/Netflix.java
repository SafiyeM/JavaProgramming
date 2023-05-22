package office_hours.week14.movie;

public final class Netflix extends StreamingSite{


    public Netflix(String region, double subscriptionAmount, int moviesAvailable) {
        super("www.netflix.com/" + region, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe for " + subscriptionAmount);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Starting " + movie.getTitle());
    }

    @Override
    public void pause() {
        System.out.println("PAUSED");
    }
}
/*
 Create a final class Netflix
        inherit the StreamingSite class and implement all the methods

 */