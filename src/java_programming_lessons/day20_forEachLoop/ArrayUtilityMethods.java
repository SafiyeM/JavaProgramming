package java_programming_lessons.day20_forEachLoop;

import java.util.Arrays;

public class ArrayUtilityMethods {


    public static void main(String[] args) {
        int[] score= {70, 80, 90, 100};

        System.out.println(Arrays.toString(score));

        String result= Arrays.toString(score);

        System.out.println(result);

        System.out.println("__________________________________________________");


        int[] a1= {1, 2, 3, 4, 5};
        int[] a2= {1, 2, 3, 4, 5};

       boolean r1= Arrays.equals(a1, a2);

        System.out.println(r1); // true


        char[] ch= {'A', 'B', 'C'};
        char[] ch2= {'A', 'C', 'B'};

       boolean r2= Arrays.equals(ch,ch2);

        System.out.println(r2); // false -> different order


        String[] s1= {"A", "B", "C"};
        String[] s2= {"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2)); //false


        int[] nums= {100, 80, 90,70, 88, 99,3,4,5,6,2,500,1000};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); //[2, 3, 4, 5, 6, 70, 80, 88, 90, 99, 100, 500, 1000]

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1] );


        System.out.println("---------------------------------------");

        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1); //b1 = {A, B, C}
        Arrays.sort(b2); //b2 = {A, B, C}

        System.out.println( Arrays.equals(b1, b2) );

        System.out.println("---------------------------------------");

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------");


        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );  // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) { // with for-loop we get all the elements of n2 array and
            n3[j]= n2[i];                                            // assign to the remaining indexes of n3
        }

        System.out.println(Arrays.toString(n3));// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]


        System.out.println("----------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch1, 20 ); //[A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch1, 2, 5);     // excludes ending index -> [C, D, E]

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch1, 2, ch1.length);//-> till last element of ch1

        System.out.println(Arrays.toString(result3));                // [C, D, E, F, G]








    }
}
