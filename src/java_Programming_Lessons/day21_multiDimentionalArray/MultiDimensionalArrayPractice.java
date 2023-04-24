package java_Programming_Lessons.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {



        String[] group1 = {"Lucy", "Lena", "James", "Lina"}; //4names;
        String[] group2 = {"Sarah", "Mina", "Rayha"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Irina", "Adelina", "Henry"}; //5 names;
        String[] group4 = {"Mehmet", "Ali"}; //2 names;

        String[][] groups= {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup= groups[i]; // -> i: index number of single dimensional Arrays from multidimensional Array
            System.out.println(Arrays.toString(eachGroup));

            for (int i1 = 0; i1 < eachGroup.length; i1++) {
                String eachStudent= eachGroup[i1];

                System.out.println(eachStudent);
            }


        }

        System.out.println("________________________________________");


        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {

                System.out.println(eachStudent);
            }

        }
        System.out.println("_______________________________________");

        for (int i = groups.length - 1; i >= 0; i--) {
           String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));


            for (int i1 = eachGroup.length - 1; i1 >= 0; i1--) {
              String eachStudent  = eachGroup[i1];

                System.out.println(eachStudent);
            }

        }


        System.out.println("________________________________________");


        // System.out.println(groups); // hashcode!!!

       // System.out.println( Arrays.toString(groups)); // hashcode!!! -> toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY














    }
}
