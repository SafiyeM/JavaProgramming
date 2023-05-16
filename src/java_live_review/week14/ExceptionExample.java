package java_live_review.week14;

public class ExceptionExample {

    public static void main(String[] args) {

         try {

             String str = null;
             System.out.println(str.length());
         } catch (NullPointerException e){
             System.out.println("String can not be null");
             System.out.println("Do these steps");
             e.printStackTrace();
         }

        System.out.println("END");
    }
}
