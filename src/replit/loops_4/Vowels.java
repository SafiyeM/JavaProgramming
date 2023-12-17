package replit.loops_4;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String vowels= "";


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += c;
            }
        }
        System.out.println(vowels);

         /*
          if (vowels.contains(word.substring(i,i+1)) ){
                System.out.print(word.charAt(i));
            }
            */




    }
}
/*
### Use a `loop` to print each vowel( a, e, i, o, u) from the given `word`

Main topics: loops, primitive data types, operators, Scanner, String, if statements

```
Ex:
  Input:
    howdyho

  Output:
    oo
```
```
Ex:
  Input:
    java

  Output:
    aa
```
```
Ex:
  Input:
    apple

  Output:
    ae
```
 */