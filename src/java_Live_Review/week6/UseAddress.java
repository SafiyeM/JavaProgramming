package java_Live_Review.week6;

public class UseAddress {

    public static void main(String[] args) {

        Address address1= new Address();

        System.out.println(address1); //Address{street='null', city='null', state='null', zipcode=0, country='null'}
        // Because I have not set it yet


        address1.setInfo("231441 Oak Drive", "Fairfax", "VA", 34022, "Us");

        System.out.println(address1); // 231441 Oak Drive Fairfax, VA 34022 Us

        Address address2 = new Address();
        address2.setInfo("12313 Lane", "Fairfax", "VA", 1323, "US");
        System.out.println(address2);





    }
}
