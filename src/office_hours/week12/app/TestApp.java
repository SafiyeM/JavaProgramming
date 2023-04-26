package office_hours.week12.app;

public class TestApp {


    public static void main(String[] args) {


        Instagram instagram = new Instagram(3.1);
        instagram.download();
        instagram.postPicture();

        Youtube youtube = new Youtube(4.1);
        youtube.download();
        youtube.watchVideo();


    }
}
