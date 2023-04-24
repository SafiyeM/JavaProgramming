package java_Programming_Lessons.day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the day number:");

        //int num= new Scanner(System.in).nextInt(); If we don't use the Scanner object more than once,
        // we can use this syntax. So we do not need to close the object. after used it is automatically gone.

        int number= input.nextInt();

        //1. Solution If & Ternary mix

        String day="Invalid number"; // else condition of pre-condition

        if (number>=1 && number <=7){ // pre-condition

            day=     (number==1)? "Monday" :(number==2)? "Tuesday"
                    :(number==3)? "Wednesday" :(number==4)? "Thursday"
                    :(number==5)? "Friday" :(number==6)? "Saturday"
                    : "Sunday";
        }
        System.out.println("The number is: " +day);



      // 2. Solution switch

       /* switch (number){
            case 1:
                System.out.println( number+ " : Monday");
                break;
            case 2:
                System.out.println(number+ " : Tuesday");
                break;
            case 3:
                System.out.println(number+ " : Wednesday");
                break;
            case 4:
                System.out.println(number+ " : Thursday");
                break;
            case 5:
                System.out.println(number+ " : Friday");
                break;
            case 6:
                System.out.println(number + " : Saturday");
                break;
            case 7:
                System.out.println(number+ " : Sunday");
                break;
            default:
                System.out.println("Invalid number");

        }

        */




    input.close(); // scanner close method
    }
}
