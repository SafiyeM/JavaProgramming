package java_live_review.week13.language;

public class English implements Language{


    @Override
    public void hello() {

        System.out.println("Greetings");
    }

    @Override
    public void bye() {

        System.out.println("Good Bye");
    }
}
