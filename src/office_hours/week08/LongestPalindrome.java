package office_hours.week08;

public class LongestPalindrome {


    public static void main(String[] args) {


        String[] array=   {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

        String longest= "";

        for (String each : array) {
            String reverse="";

            for (int i =each.length()-1; i >= 0; i--) {
              reverse+= each.charAt(i);
            }

            if (reverse.equals(each) && reverse.length() > longest.length()){
                longest = each;
            }

        }
        if (longest.isEmpty()){
            System.out.println("No Palindrome found");
        }else {
            System.out.println(longest);
        }


    }
}
/*
T4LongestPalindrome [array, loop, String]

    Create a program that will define a String array of words. Find the longest palindrome String from that array.
     If no palindrome is found print: No Palindrome Found

    Ex:
        {java, long word, civic, apple, racecar, mom, anna, really long word}
        longest palindrome is: racecar

        {abc, hello, world, java}
        No Palindrome Found

 */