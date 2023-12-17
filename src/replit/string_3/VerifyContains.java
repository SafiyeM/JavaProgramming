package replit.string_3;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        boolean isTrue= sentence.contains(word);
        System.out.println(isTrue);

        //or we can just ask it directly without boolean variable
        // System.out.println(sentence.contains(word));

    }
}
/*
### Use `String methods` to verify if the given `sentence` contains the given `word`. The values of `sentence` and `word` will be inputs from a Scanner, but you only need to interact with the String variables. Output a `boolean value, true or false`.

Main topics: String manipulation, Scanner, methods, primitive datatypes

```
Ex:
  Input:
    Word: AirPods

    Sentence: Did you just get some AirPods for Christmas?

  Output:
    true
```
```
Ex:
  Input:
    Word: quiz

    Sentence: How many times did you retake the test?

  Output:
    false
```


 */