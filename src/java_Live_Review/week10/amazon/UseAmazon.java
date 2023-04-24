package java_Live_Review.week10.amazon;

public class UseAmazon {

    public static void main(String[] args) {


        AmazonAccount account1 = new AmazonAccount("JavaIsCool", "java4lyfe@gmail.com", false);

         //account1.email;  -> can not access because it is private

        System.out.println(account1.getEmail()); // we either assign or print getEmail


       account1.setEmail("javausedtobecool@gmal.com");
        System.out.println(account1.getEmail());

    }



}
