package replit.loops_4;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) { // hello

            char each = word.charAt(i);
            System.out.println(each + "");

        }


    }


}
/*
### Use a `loop` to print each letter of the given `word` on a separate line

Main topics: loops, primitive data types, operators, Scanner, String

```
Ex:
  Input:
    hello

  Output:
    h
    e
    l
    l
    o
```
```
Ex:
  Input:
    Zimbabwe

  Output:
    Z
    i
    m
    b
    a
    b
    w
    e
```
 */