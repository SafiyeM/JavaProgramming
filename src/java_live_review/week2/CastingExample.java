package java_live_review.week2;

public class CastingExample {
    public static void main(String[] args) {


        int i= 30;
        long l= i;


        long l2= 100; // 100 is by default is int,
        // int is smaller than long, so no problem,
        // it will automatically got o long for the variable
        byte b2= (byte)l2; // we need to cast to byte

        double d3=15.99;
        int i3= (int)d3; // data loss // we cast it into int. it is not anymore decimal (double)
        System.out.println(i3);

        int i4= 1_000_000;
        byte b4= (byte) i4; // the byte can not hold this number, there is data loss

        System.out.println(b4); // 64 // the result is based on some calculation



       // float f5= 10.23; // 10.23 is by default double number. Trying to store a double into float

        float f5 = 10.23f; // this is now float

        int i5= (int)f5;

        System.out.println((double) i5);

        char letter= 'A';
        System.out.println((int) letter);// we cas A into int // so it is 65






    }
}
