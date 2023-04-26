package java_practice.day09_scanner;
import java.util.Scanner;
public class MiddleNumber {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1= scan.nextInt();

        System.out.println("Enter second number:"); // 140 34 8
        int number2= scan.nextInt();

        System.out.println("Enter third number:");
        int number3= scan.nextInt();

        String middleNumber;

        if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)){
            middleNumber= "middle number is: "+ number1;
        }if ((number2 > number1 && number2 < number3) ||(number2 < number1 && number2 >number3)) {
            middleNumber= "middle number is: "+ number2;
        } else {
            middleNumber= "middle number is: "+ number3;
        }

        System.out.println(middleNumber);





    }
}
