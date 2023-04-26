package office_hours.week10.evening;

public class Question1 {

    public static void main(String[] args) {
        /*
        shirt is 6 dollar
        t-shirt is 8 dollar
         */
        boolean result=  change(34,3,2); // if we have change we will return false, if not we will return true

        System.out.println(result);
    }

    private static boolean change(int money, int numberOfShirt, int numberOfTshirt) {

        return (money - (numberOfShirt*6+numberOfTshirt*8))==0;

    }
}
