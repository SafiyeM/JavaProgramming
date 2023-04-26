package java_programming_lessons.day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

      String[] myGroup= new String[5];


      myGroup[0]= "Gulcin";
      myGroup[myGroup.length-1]= "Asli";

        System.out.println(Arrays.toString(myGroup)); // [Gulcin, null, null, null, Asli]

        myGroup[2]= "Sofia";
        myGroup[3]= "Mina";
        myGroup[1]= "Nalan";

        System.out.println(Arrays.toString(myGroup)); // [Gulcin, Nalan, Sofia, Mina, Asli]


        myGroup[0]= "Hamide"; // replaced & reassigned with Hamide

        System.out.println("______________________________");


        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]); // Asli Mina Sofia Nalan Hamide -> 4, 3, 2, 1, 0

        }

        for (int i = 0; i < myGroup.length; i++) {             // myGroup.fori -> shortcut for iteration

        }

        for (int i = myGroup.length - 1; i >= 0; i--) {        // myGroupforr -> shortcut for reversed order

        }









    }
}
