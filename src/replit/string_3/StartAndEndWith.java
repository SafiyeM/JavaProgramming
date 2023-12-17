package replit.string_3;

import java.util.Scanner;

public class StartAndEndWith {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        boolean a= word.startsWith("a");

        boolean e= word.endsWith("e");

        System.out.println("Starts with a: "+ a+ "\nEnds with e: "+ e);
    }
    }

/*
### Use `String methods` to check if the given `word` starts with the letter `a` and ends with the letter `e`. Print two boolean values to represent each:

> Starts with a: $boolean

> Ends with e: $boolean

Main topics: String manipulation, Scanner, methods, primitive datatypes

```
Ex:
  Input:
    apple

  Output:
    Starts with a: true
    Ends with e: true
```
```
Ex:
  Input:
    air

  Output:
    Starts with a: true
    Ends with e: false
```
```
Ex:
  Input:
    light

  Output:
    Starts with a: false
    Ends with e: false
```
 */