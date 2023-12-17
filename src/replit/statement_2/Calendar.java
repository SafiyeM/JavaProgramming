package replit.statement_2;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE BELOW:

        // or without print statement
        // String month;
        //-> month= "January";


        switch (monthNum){
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number");



        }


scan.close();
    }
}
/*

### Use a `switch statement` to display the month name when given an `int` `monthNum`. If an invalid `monthNum` is given print `Invalid month number`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter month number:
  5
  May
```
```
Ex:
  Enter month number:
  1
  January
```
```
Ex:
  Enter month number:
  20
  Invalid month number
```

 */