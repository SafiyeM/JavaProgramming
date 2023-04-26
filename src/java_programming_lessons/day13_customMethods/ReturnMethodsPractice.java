package java_programming_lessons.day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {


        System.out.println( isOdd(100));


        int num = 200;

        if (isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }






/*
Ask and practice!!!
 */


    }
public static boolean isOdd(int num){
        //return (num % 2  != 0) ? true : false;

    if (num %2 != 0){ // because it is odd
           return true;
        }
            return false;



    /*
1. Create a method named isOdd,
 that can return true if a number is an odd number,
 otherwise returns false

 */


}


public static boolean isEven(int num){
        return !isOdd(num);

        // return (num % 2 == 0)? true : false; --> another way to express the number is even



    /*
    2. Create a method named isEven, that can return true
     if a number is an even number, otherwise returns false
     */
}


public static int max(int num1, int num2){

   // return num1 > num2 ? num1 : num2;

    if(num1 > num2){
        return num1;
    }else{
        return num2;
    }

/*
3. Create a method named max,
that can return the maximum number between two numbers
 */





}


public static int min(int num1, int num2){
       return num2 < num1 ? num2 : num1;






       /*
3. Create a method named min,
that can return the minumum number between two numbers
 */


}






}

