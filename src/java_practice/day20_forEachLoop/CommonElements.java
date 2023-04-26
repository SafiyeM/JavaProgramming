package java_practice.day20_forEachLoop;

public class CommonElements {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        String commonElements = "";

        for (int num1 : arr1) {

            for (int num2 : arr2) {
                if (num1 == num2 & !commonElements.contains("" + num1)) {
                    commonElements += num2 + " ";
                }
            }

        }
        System.out.println("commonElements = " + commonElements);


    }
}
/*
2. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */