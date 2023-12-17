package replit.methods_6;

import java.util.Scanner;

public class ProfitOrLoss {

    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW

        if (buyPrice == sellPrice){
            return "no loss";
        } else if (buyPrice > sellPrice) {
            return "loss";
        }else {
            return "profit";
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}
/*
### Finish the method called `profit()` that will take two `int` arguments and
 returns a String saying if there is a `profit`, a `loss`, or `no loss`.
  The first argument is the `buyPrice` value and the second argument is the `sellPrice` value.
   There is a profit if the sell price is more than the buy price.

#### This is a `return` method with two `int` parameters

Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:
```
  profit(100,1500)

output:
  profit
```
Example:
```
  profit(20, 5)

output:
  loss
```
Example:
```
  profit(100,100)

output:
  no loss
```

 */
