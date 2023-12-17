package java_Practice.day20_forEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 5, 5};


        for (int element : arr) {

            int count = 0;

            for (int each : arr) {
                if (each == element) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(element);
            }

        }

    }
}
/*
4. Write a program that can display the unique elements of an array

			MUST use for each loops

 */