package java_Practice.day13_customMethods;

public class isOddOrEven {
    public static void main(String[] args) {


        System.out.println(isOdd(45));

        System.out.println(isEven(30));

    }

    public static boolean isOdd(int number){


        if (number %2 != 0){
            return true;
        } else {
            return false;
        }
        // 1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false

    }






    public static boolean isEven(int number){

       return !isOdd(number);


       // 2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false

    }


}
