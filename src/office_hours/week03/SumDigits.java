package office_hours.week03;

public class SumDigits {
    public static void main(String[] args) {

        int     num= 567;

        System.out.println(num % 10);// num % 10 -> allows me to get the last digit

        System.out.println( num / 10 ); // 10 will get rid of the last digit

        int sum = 0;
        sum += num % 10; // 567 -> % 10 = 7
        // full version: sum = sum + num % 10
        num /= 10; // 567 / 10 = 56
        // num = num / 10;
        sum += num % 10; // 56 % 10 -> 6  || sum = 7 + 6
        num /= 10; // 56 / 10 -> 5
        sum += num % 10; // 5 % 10 -> 5
        num /= 10; // 5 / 10 -> 0
        System.out.println(sum);



    }
}

/* other approach:
int number = 675,
                lastNumber = number % 10,
                secondNumber = number / 10 % 10,
                firstNumber = number / 100 % 10,
                sum = lastNumber + secondNumber + firstNumber;

        if (number >= 100 && number <= 999) {
            System.out.println(firstNumber + "+" + secondNumber + "+" + lastNumber + "=" + sum);
            System.out.println("The sum of the digits in " + number + " is " + sum);
        } else {
            System.out.println("Invalid entry. Range must be between 100-999.");
 */

/*
T2SumDigits [variables, arithmetic & shorthand operators]

    Create a program that will define an int number that ranges from 100 to 999.
     Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12
 */