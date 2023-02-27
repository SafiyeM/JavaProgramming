package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number= 100;

        boolean isEven= number % 2 == 0;// when we divide a number by 2, if the remainder is 0,
        // means the number is even number


        if (isEven) {
            System.out.println( "even number");
        }

        if (!isEven){
            System.out.println("odd number");
        }


        System.out.println("______________________________________");


        if (number % 2 == 0) {
            System.out.println( "even number");

        }

        if (number % 2 != 0) {
            System.out.println("odd number");

        }




    }
}
