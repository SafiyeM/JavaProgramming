package java_live_review.week6;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("anna")); // true
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); //false


    }

    //begin= 0 -> 1 -> 2 -> 3
    //end= 6 -> 5 -> 4
    public static boolean isPalindrome(String str){ /// racecar

        for(int begin = 0, end = str.length() - 1; begin < str.length() / 2; begin++, end--){ // or end > str.length() /2
            if(str.charAt(begin) != str.charAt(end)){ // the characters are different
                return false;
            }
        }

        return true;
    }



    // this way you don't need to separate variables, but you can use math to help read values from the last index.
    // Everytime i is updated by 1 it will be subtracted from the last index
    public static boolean isPalindrome2(String str){

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }

    // reverse the given String by starting the i from the last index and decrementing each iteration.
    // concatenates the characters being red from the end into the reverse String and the reverse is the same as the original
    // str it will return true otherwise false.
    public static boolean isPalindrome3(String str){

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }




}
/*
    [IQ] Palindrome [method, String, loop]

    create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
    A palindrome is when the characters being read from the beginning match the characters being read from the end.
     In other words, it can be thought as the reverse of a word being the same as the original word

        Ex:
            racecar
            true

            anna
            true

            abc
            false

            abcba
            true
     */