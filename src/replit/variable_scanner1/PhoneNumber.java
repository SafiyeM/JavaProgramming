package replit.variable_scanner1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();

        //WRITE YOUR CODE BELOW:

        System.out.println("Calling number (" + areaCode + ")-" + localNumber);

//other approach:
        // String phoneNumber= "(" +areaCode+ ")-"+localNumber);
        //System.out.println("Calling number " +phoneNumber);
    }
}
/*
### In this task, you will need to use multiple variables and combine them together into a phone number.
```
  For example it will be something like this:
    (222)-3334444
```

1. Given two `int` variables `areaCode` and `localNumber` that are assigned a value from Scanner, combine them together into a phone number in the following format:

```
  (areaCode)-localNumber
```

Print this final message:
```
  Calling number $phoneNumber
```

```
Ex:

  Input:
    222
    3334444

  Output:
    Calling number (222)-3334444
```


Main topics: variables, primitive datatypes, Scanner, concatenation

 */