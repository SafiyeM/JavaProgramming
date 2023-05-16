package java_live_review.week14.bank;

public class MultipleExample {

    public static void main(String[] args) {


        try {

        }catch (StringIndexOutOfBoundsException e){

        }catch (NullPointerException e){

        }catch (ArrayIndexOutOfBoundsException e){

        }

        // variation

        try {

        }catch (IndexOutOfBoundsException e){

        }

        // variation

        try {

            int[] a = {1, 3, 4};

        }catch (NullPointerException | IndexOutOfBoundsException e){

        }


    }

}
