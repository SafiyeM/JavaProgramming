package office_Hours.week10.evening;

public class Question2 {


    public static void main(String[] args) {

        /*
        we will have a method it will return true if the first and last letter is same
         */

        boolean res= sameLetter("dede");
        System.out.println(res); // false

    }

    private static boolean sameLetter(String word) {
        return word.charAt(0)==word.charAt(word.length()-1);
    }
}
