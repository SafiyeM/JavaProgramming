package replit.statement_2;

import java.util.Scanner;

public class FindMiddleNumber {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1= scan.nextInt();

        System.out.println("Enter second number:");
        int number2= scan.nextInt();

        System.out.println("Enter third number:");
        int number3= scan.nextInt();

        int middleNumber;

        if((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)){
            middleNumber= number1;

        }else if((number2 > number1 && number2 < number3) ||(number2 < number1 && number2 >number3)){
            middleNumber= number2;

        } else{
            middleNumber= number3;

        }

        System.out.println("middle number is: "+middleNumber);


    }
}
/*
### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

```
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```

Main topics: if statements, primitive variables, operators, Scanner


**Example Flows:**

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34
```
 */