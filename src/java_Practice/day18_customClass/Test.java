package java_Practice.day18_customClass;

public class Test {
    public static void main(String[] args) {

        Contact name1= new Contact();

      name1.setInfo("Marry M", "019826534352", "marrym@gmail.com");
      name1.Call();
      name1.sendEmail();
      name1.sendMessage();

        System.out.println(name1);


     Offer offer1= new Offer();

     offer1.setInfo("Frankfurt", "Deutsche Bank", "SDET", 60_000, true, true, true, true);

        System.out.println(offer1);



    }
}
