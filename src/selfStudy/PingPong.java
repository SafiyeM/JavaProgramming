package selfStudy;

public class PingPong {

    public static void main(String[] args) {


        System.out.println(pingPong(30));

    }


    public static String pingPong(int lastNumber) {

        String result = "";

        for (int i = 1; i <= lastNumber; i++) {

            if (i % 4 == 0 && i % 3 == 0) {
                result += "PingPong ";
            } else if (i % 4 == 0) {
                result += "Pong ";
            } else if (i % 3 == 0) {
                result += "Ping ";
            } else {
                result += i + " ";
            }


        }
        return result;
    }


}
