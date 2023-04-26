package java_practice.day05_replit;

import java.util.Scanner;

public class Replit_Statement_Practice {
    public static void main(String[] args) {

        //-------------------------------Replit----------------------//
     /*  1. Greater Number

      ### Use an `if statement` to determine if the given number `a` is greater than the other given number `b`.
     Print out which is the biggest in the following format:

#### $number is greater

#### Note: The two given numbers will not be equal

        Main topics: if statements, primitive variables, concatenation, operators

```
        Ex:
        Input:
        1
        2

        Output:
        2 is greater
```
```
        Ex:
        Input:
        7
        4

        Output:
        7 is greater
```

      */

        int num1 = 7;
        int num2 = 4;

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }

        System.out.println("____________________________________________________________");

        //2. Odd or Even

        /*
        ### Use an `if statement` to determine if the given `int` `number` is even or odd. Print the following message:

#### $number is even_or_odd

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    10

  Output:
    10 is even
```
```
Ex:
  Input:
    33

  Output:
    33 is odd
```

Note: The number 0 will not be an input

         */


        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        System.out.println("___________________________________________________________");

        //3.Positive, Negative or Zero
/*
`int` `num` is positive, negative, or zero. Only print one of these three options.

#### Note: Can be done with 3 separate if statement or a multi-branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    1

  Output:
    positive
```
```
Ex:
  Input:
    -6

  Output:
    negative
```
```
Ex:
  Input:
    0

  Output:
    zero
```
 */

        int number2 = 12;

        if (number2 > 0) {
            System.out.println("positive");
        } else if (number2 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        System.out.println("_______________________________________________________");
        // 4. Blackjack
        /*
### Use `if statements` to help the Blackjack dealer determine who won.
 There will be an `int` `house` value and an `int` `player` value.
  Use the following rules of blackjack to print out the result:

> - if the `player` score is bigger than `21`, the result is `player bust`
> - if the `player` score is equal to the `house` score, the result is `its a tie`
> - if the `player` score is equal to `21`, the result is `player win`
> - if the `house` score is bigger than the `player` score, the result is `player lose`
> - if the `player` score is bigger than the `house` score, the result is `player win`

#### Note: Can be done with separate if statement or a multi-branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    8
    21

  Output:
    player win
```
```
Ex:
  Input:
    10
    7

  Output:
    player lose
```
```
Ex:
  Input:
    4
    4

  Output:
    its a tie
```
```
Ex:
  Input:
    10
    25

  Output:
    player bust
```
```
Ex:
  Input:
    7
    12

  Output:
    player win
```
         */

      /*
      > - if the `player` score is bigger than `21`, the result is `player bust`
> - if the `player` score is equal to the `house` score, the result is `it is a tie`
> - if the `player` score is equal to `21`, the result is `player win`
> - if the `house` score is bigger than the `player` score, the result is `player lose`
> - if the `player` score is bigger than the `house` score, the result is `player win`

       */
        int house = 1;
        int player = 17;

        if (player > 21) {
            System.out.println("player bust");
        } else if (player == house) {
            System.out.println("It is a tie");
        } else if (player == 21) {
            System.out.println("player win");
        } else if (house > player) {
            System.out.println("player lose");
        } else {
            System.out.println("player win");
        }

        System.out.println("____________________________________");

        // 5. Apartment Leasing
        /*
        ### Use `if statements` to find the cost of leasing an apartment based on the number of bedrooms.
         Use the `numberOfBedrooms` variable and these rates to get the final price:

> - 1 bedroom: 1100
> - 2 bedroom: 1850
> - 3 bedroom: 2550

#### Note: If an invalid bedroom number is given no price is displayed

#### Note: Can use multiple if statements or a multi-branch if statement

Main topics: if statements, primitive variables, concatenation, operators

**Example Flows:**
```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
1
One Bedroom Selected
Starting Price: 1100
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
3
Three Bedroom Selected
Starting Price: 2550
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
5
Sorry, we do not offer that many bedrooms

```
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Cydeo Apartments!" +
                "\nHow many bedrooms are you looking for?");
        int numberOfBedrooms = input.nextInt();

        if (numberOfBedrooms == 1) {
            System.out.println("One bedroom selected\nStarting price: $1100");
        } else if (numberOfBedrooms == 2) {
            System.out.println("two bedroom selected\nStarting price: $1850");
        } else if (numberOfBedrooms == 3) {
            System.out.println("Three bedroom selected\nStarting price: $2550");
        } else {
            System.out.println("Sorry, we do not offer that many bedrooms ");
        }

        System.out.println("_____________________________________________________");

        // 6. Grades

        /*
        ### Use `if statements` to determine if the given `int` `grade` is a passing grade.
         Use the following ranges to determine the result:


> - if the grade is bigger than or equals to `90` output `excellent`
> - if the grade is bigger than or equals to `70` and smaller than `90` output `good`
> - if the grade is bigger than or equals to `60` and smaller than `70` output `pass`
> - if the grade is smaller than `60` output `fail`

#### Note: Can be done with 4 separate if statement or a multi-branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    93

  Output:
    excellent
```
```
Ex:
  Input:
    70

  Output:
    good
```

```
Ex:
  Input:
    46

  Output:
    fail
```
```
Ex:
  Input:
    80

  Output:
    good
```

         */


        int grade = 70;

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("Good");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("______________________________________________________________________");

        // 7. Vehicle Year

        /*
        ### SDET Motors Inc. is recalling all vehicles from model years:

 > - 1995-1998,
 > - 2001-2002,
 > - 2004-2006,
 > - 2015-2017

### Given the `vehicleYear` determine if the vehicle is being recalled or not

> If the year is from included in the recall year list print:
  `Your vehicle needs to be recalled!`

> If the year is not one of the recall years print:
`Your vehicle is fine, enjoy!`

Main topics: if statements, primitive variables, operators

**Example Flows:**
```
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
```
```
Enter vehicle's year:
2002

Your vehicle needs to be recalled!
```
```
Enter vehicle's year:
2018

Your vehicle is fine, enjoy!
```


         */


        System.out.println("Enter Vehicle Year:");
        int vehicleYear = input.nextInt();

        String result1 = "Your vehicle is fine, enjoy!";
        String result2 = "Your vehicle needs to be recalled!";

        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            System.out.println(result2);
        } else if (vehicleYear >= 2001 && vehicleYear <= 2002) {
            System.out.println(result2);
        } else if (vehicleYear >= 2004 && vehicleYear <= 2006) {
            System.out.println(result2);
        } else if (vehicleYear >= 2015 && vehicleYear <= 2017) {
            System.out.println(result2);
        } else {
            System.out.println(result1);
        }


        System.out.println("____________________________________________________");

        // 8. Middle number

        /*
        ### Using `if statements` and `Scanner` write a program that will read three number inputs.
         Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

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


        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        if ((firstNumber > secondNumber && firstNumber < thirdNumber) || (firstNumber < secondNumber && firstNumber > thirdNumber)) {
            System.out.println("middle number is: " + firstNumber);
        } else if ((secondNumber > firstNumber && secondNumber < thirdNumber) || (secondNumber < firstNumber && secondNumber > thirdNumber)) {
            System.out.println("middle number is: " + secondNumber);
        } else {
            System.out.println("middle number is: " + thirdNumber);
        }


        input.close();

    }
}
