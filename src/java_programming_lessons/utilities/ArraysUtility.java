package java_programming_lessons.utilities;

import java.util.Arrays;

public class ArraysUtility {



    // we do not need any objects, so we created the method static
    // we call it through the class name



    // Overloaded merge Methods
   public static int[] merge(int[] arr1, int[] arr2){

       int[] arr3= new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain
       // all the elements of arr1 & arr2

       int k=0; // it is for tracking the index number of arr3

       for (int i = 0; i < arr1.length; i++, k++) { // i: index number of arr1 from 0-till last index number
           // everytime 'i' increased, 'k' is also increased -> we add elements of add1 to add3
           arr3[k]= arr1[i];
       }


       for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
           // everytime 'i' increased, 'k' is also increased -> we add elements of add2 to add3
           arr3[k]= arr2[i];

       }

       return arr3;

   }


   

    public static double[] merge(double[] arr1, double[] arr2){



        double[] arr3= new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain
        // all the elements of arr1 & arr2

        int k=0; // it is for tracking the index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i: index number of arr1 from 0-till last index number
            // everytime 'i' increased, 'k' is also increased -> we add elements of add1 to add3
            arr3[k]= arr1[i];
        }


        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            // everytime 'i' increased, 'k' is also increased -> we add elements of add2 to add3
            arr3[k]= arr2[i];

        }

        return arr3;

    }



    public static char[] merge(char[] arr1, char[] arr2){



        char[] arr3= new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain
        // all the elements of arr1 & arr2

        int k=0;   // it is for tracking the index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i: index number of arr1 from 0-till last index number
            // everytime 'i' increased, 'k' is also increased -> we add elements of add1 to add3
            arr3[k]= arr1[i];
        }


        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            // everytime 'i' increased, 'k' is also increased -> we add elements of add2 to add3
            arr3[k]= arr2[i];

        }

        return arr3;

    }



    public static String[] merge(String[] arr1, String[] arr2){



        String[] arr3= new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain
        // all the elements of arr1 & arr2

        int k=0; // it is for tracking the index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i: index number of arr1 from 0-till last index number
            // everytime 'i' increased, 'k' is also increased -> we add elements of add1 to add3
            arr3[k]= arr1[i];
        }


        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            // everytime 'i' increased, 'k' is also increased -> we add elements of add2 to add3
            arr3[k]= arr2[i];

        }

        return arr3;

    }




// Overloaded reverse Methods

    public static int[] reverse(int[] array){

        int[] reversedArray = new int[array.length];
        //size of the new reverserArray needs to be equal the size of the given array

        for (int i = array.length - 1, j=0; i >= 0; i--) { // or we can write the iteratiton here j++
            reversedArray[j++]  = array[i];
        }
        return reversedArray;

}


    public static double[] reverse(double[] array){

        double[] reversedArray = new double[array.length];
        //size of the new reverserArray needs to be equal the size of the given array

        for (int i = array.length - 1, j=0; i >= 0; i--) { // or we can write the iteratiton here j++
            reversedArray[j++]  = array[i];
        }
        return reversedArray;

    }
    

    public static char[] reverse(char[] array){

        char[] reversedArray = new char[array.length];
        //size of the new reverserArray needs to be equal the size of the given array

        for (int i = array.length - 1, j=0; i >= 0; i--) { // or we can write the iteratiton here j++
            reversedArray[j++]  = array[i];
        }
        return reversedArray;

    }


    public static String[] reverse(String[] array){

        String[] reversedArray = new String[array.length];
        //size of the new reverserArray needs to be equal the size of the given array

        for (int i = array.length - 1, j=0; i >= 0; i--) { // or we can write the iteratiton here j++
            reversedArray[j++]  = array[i];
        }
        return reversedArray;

    }



    //Overloaded addElement Methods
    public static int[] addElement(int[] array, int elements){

        int[] new_Array = Arrays.copyOf(array, array.length +1); // it contains arrays length and + 1 more element
        new_Array[new_Array.length-1]= elements;
        return new_Array;



    }


    public static double[] addElement(double[] array, double elements){

        double[] new_Array = Arrays.copyOf(array, array.length +1); // it contains arrays length and + 1 more element
        new_Array[new_Array.length-1]= elements;
        return new_Array;

    }


    public static String[] addElement(String[] array, String elements){

        String[] new_Array = Arrays.copyOf(array, array.length +1); // it contains arrays length and + 1 more element
        new_Array[new_Array.length-1]= elements;
        return new_Array;

    }



    public static char[] addElement(char[] array, char elements){

        char[] new_Array = Arrays.copyOf(array, array.length +1); // it contains arrays length and + 1 more element
        new_Array[new_Array.length-1]= elements;
        return new_Array;

    }




    // Overloaded contains Methods

    public static boolean contains(int[] array, int element){

    // method in order to check if one element contains in array

        for (int each : array) {      // each elements in array
            if (each == element){
                return true;
            }
        }
        return false;
    }




    public static boolean contains(double[] array, double element){

        // method in order to check if one element contains in array

        for (double each : array) {      // each elements in array
            if (each == element){
                return true;
            }
        }
        return false;
    }


    

    public static boolean contains(char[] array, char element){

        // method in order to check if one element contains in array

        for (char each : array) {      // each elements in array
            if (each == element){
                return true;
            }
        }
        return false;
    }




    public static boolean contains(String[] array, String element){

        // method in order to check if one element contains in array

        for (String each : array) {      // each elements in array
            if (each.equals(element)){
                return true;
            }
        }
        return false;
    }

    /*

     // array = { 10, 20, 30, 40} , 2  ===> {10, 20, 40}

    public static int[] remove(int[] array, int index){


    }

     public static int[] removeDup(int[] array){


}


     */


}

