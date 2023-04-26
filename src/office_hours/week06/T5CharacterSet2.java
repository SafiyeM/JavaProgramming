package office_hours.week06;

public class T5CharacterSet2 {

    public static String getCharacterSet(int start, int end){
        String result = "";

        for ( ; start <= end ; start ++){       // I don't need to initialize a new variable,
            result += (char) start;                    // instead I am choosing to iterate through the start parameter

        }

        return result;


    }

    public static void main(String[] args) {

        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet(50, 100));


    }

   /* // alternative approach for previous method
    public static String getCharacterSet(String group){

        String allCharacters = "";
        char start;
        char end;

        switch (group.toLowerCase()){
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digits":
            case "numbers":
                start = '0';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return "Invalid group";
        }

        return getCharacterSet(start, end);

    */


}
/*
T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
 */