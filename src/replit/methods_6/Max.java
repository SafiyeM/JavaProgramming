package replit.methods_6;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));

    }


    public static int max(int x, int y){
        // WRITE YOUR METHOD BELOW


        if (x>y){
            return x;
        }else {
            return y;
        }

        // Ternary approach : x > y ? x : y;


    }


    }

/*
### Finish the method called `max()` that will take two `int` arguments and
returns the number that is the biggest between them.

#### This is a `return` method with two `int` parameters

Main topics: methods, Scanner, primitive data types, operators, if statements

Example:
```
  max(1, 10)

output:
  10
```
Example:
```
  max(11, 5)

output:
  11
```
 */



