package java_practice.day14_forLoop;


public class Finra {
    public static void main(String[] args) {


        System.out.println(finra(30));

    }


  /*  public  static void finra(){  //-> with void method without returning any value


        String result = "";
        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            }else if(i % 3 == 0){
                result += "FIN ";
            }else{
                result += i +" ";

            }

            System.out.print(result);

            result="";


        }

        System.out.println();
}



   */

    public static String finra(int lastNumber) {  //   --> with return method and parameters

        String result = "";

        for (int i = 1; i <= lastNumber; i++) {

            if ((i % 15 == 0)) {
                result += " FINRA ";
            } else if (i % 5 == 0) {
                result += " FIN ";
            } else if (i % 3 == 0) {
                result += " RA ";
            } else {
                result += i + " ";
            }
            //System.out.println("i: " + i + " result: " + result); -> if you want to see the iteration
        }
        return result;


    }
} /*
        2. Write a method which prints out the numbers from 1 to 100
         but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
         for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers
         which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

         */
