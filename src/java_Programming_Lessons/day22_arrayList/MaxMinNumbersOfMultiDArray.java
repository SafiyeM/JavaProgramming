package java_Programming_Lessons.day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};


        int max = array[0][0]; // we assume that array's first single dimensional array and first element of this array is max number
        int min = array[0][0];

        for (int[] each1D : array) { // it gives all int arrays and store in each1D variable

            for (int eachElement : each1D) {  // it gives all elements in each1D and store in eachElement variable

                if (eachElement > max) {
                    max = eachElement;
                }

                if (eachElement < min) {
                    min = eachElement;
                }

            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minumum number is: " + min);


    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two-dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */