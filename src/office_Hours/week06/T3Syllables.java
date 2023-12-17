package office_Hours.week06;

public class T3Syllables {
    public static void main(String[] args) {

        System.out.println(countSyllables("Ja-va"));
        System.out.println(countSyllables("ball"));
        System.out.println(countSyllables("ham-bur-ger"));
        System.out.println(countSyllables(""));



    }

    public static int countSyllables(String str){  //ham- bur-ger

        int count= str.isEmpty() ? 0: 1; //for all words 1 will be the starting value, expect for when the str is empty it will be 0

        // temp variable (we begin from 1 because if we have word with only one syllable)

        for (int i = 0; i < str.length(); i++) {  //or--> i <= str.length()-1

            if (str.charAt(i) == '-'){
                count ++; // ->  adds a number in to it, when new syllable is added. increment
            }

        }

        return count;    // return str.isEmpty() ? 0 : syllables;

    }



}
/*
T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        apple -> 1
        ham-bur-ger -> 3
        de-liv-er-y -> 4

 */