package java_live_review.week11.discordUser;

public class TestDiscord {

    public static void main(String[] args) {


        Student student =new Student("James", "A7", 100);
        student.sendMessage();
        student.sendMessage("Anna");

        DiscordUser.launch();
        Student.launch();

    }
}
