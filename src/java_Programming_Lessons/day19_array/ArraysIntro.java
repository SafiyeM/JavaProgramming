package java_Programming_Lessons.day19_array;
import java.util.Arrays;

public class ArraysIntro {


    public static void main(String[] args) {

                 // "_____________________Arrays________________________" //

        // same data type, multiple elements can be stored in one variable with array
        int score1= 85;
        int score2= 75;
        int score3= 70;
        int score4= 60;
        int score5= 80;

        System.out.println("_______________________");

        // to make it efficient, we store all the score elements in an array variable.

        int[] scores= new int[5]; // index: 0 ~ 4

        System.out.println( Arrays.toString(scores));
        // [0, 0, 0, 0, 0] -> if we print before we have not assigned any value yet, it prints default value



        String[] grades= new String[6]; // index: 0 ~ 5

        System.out.println( Arrays.toString(grades));
        // [null, null, null, null, null, null] -> all elements of grades by default null before assigning any value



        // For all the non-primitives -> 'null' is default value
        // For integer numbers -> '0' is default value
        // For floating numbers -> '0.0' is default value

        System.out.println("_______________________________-");

        scores[0]= 80;
        scores[1]= 75;
        scores[2]= 70;
        scores[3]= 60;
        scores[4]= 89;

        //scores[5]= 50; -> indexOutOFBounds

        System.out.println( Arrays.toString(scores)); // [80, 75, 70, 60, 89] ->  assigned values

        System.out.println(scores[2]); // 70

        System.out.println("______________________________________");

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }


        System.out.println("_____________________________-");

        System.out.println( scores[scores.length-1] ); // last index of scores array element -> 89











    }
}
