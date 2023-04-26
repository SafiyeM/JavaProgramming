package java_live_review.week2;

public class BestBuy {
    public static void main(String[] args) {


        int tvs= 50;
        System.out.println("someone comes in a buy a tv");

        //they are all the same, subtract 1:
        //tvs-=1; // shorthand operator
        // tvs = tvs -1;
        // tvs --;
        --tvs; // decrement immediately
        System.out.println("number of tvs is now: " + tvs); // 49

        System.out.println("person 2 came in and bought a tv:");
        System.out.println("number of tvs is now: "+ --tvs); // 48

        System.out.println("person 3 came in and put the tv in their cart");
        System.out.println("how many tvs are still in the store" + tvs--); // still 48
        System.out.println("they left, how many in the store: " + tvs); // 47 now. they bought


        System.out.println("The store gets a shipment");
        tvs += 10; // tvs 00 tvs +10; -> the same result adding 10
        System.out.println(tvs); // 57

    }
}
