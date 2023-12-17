package replit.statement_2;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //WRITE YOUR CODE BELOW

        if(num > 0){
            System.out.println("positive");
        }else if (num < 0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");

        }


    }
}
/*
### Use `if statements` to determine if the given `int` `num` is positive, negative, or zero. Only print one of these three options.

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