package selfStudy;

import java.util.Arrays;

public class Test_Arrays {

    public static void main(String[] args) {



        int[] numA= new int[4];
        int[] numB= numA;
        numA= new int[3];

        System.out.println(Arrays.toString(numA));
        System.out.println(Arrays.toString(numB));





    }
}
