package replit.arrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int[] expanded = new int[6];

        expanded[0] = nums[0];
        expanded[1] = nums[1];
        expanded[1] = nums[2];

        System.out.println(Arrays.toString(expanded));


    }
}
/*
### Given an `int []` `nums` create a new array that is an expanding version of `nums`.
 The new array will hold double the elements, and the original elements from `nums` should
 be stored at the beginning of the new array.
 You can assume the size of `nums` will be 3.

#### Note: The loop used in the given code is to dynamically create the int array.
 You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.

Main topics: arrays, primitive data-types, concatenation, index, operators

Example:
```
Input:
  [4, 5, 6]

Output:
  [4, 5, 6, 0, 0, 0]
```
Example:
```
Input:
  [3, 100, 140]

Output:
  [3, 100, 140, 0, 0, 0]
```
 */