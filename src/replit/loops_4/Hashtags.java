package replit.loops_4;

import java.util.Scanner;

public class Hashtags {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

        for (int i= 0; i < n; i++){
            System.out.print("#");

        }




    }
}
/*
### Use a `loop` to print a hashtag `#` for `n` times. The `n` value is how many hashtags should be on the same line, in the output.

Main topics: loops, primitive data types, operators, Scanner, String

```
Ex:
  Input:
    3

  Output:
    ###
```
```
Ex:
  Input:
    5

  Output:
    #####
```
 */