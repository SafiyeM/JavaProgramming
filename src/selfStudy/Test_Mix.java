package selfStudy;

import java.util.Arrays;

public class Test_Mix {
    public static void main(String[] args) {

       int [] num1 = new int [3];
        int [] num2 ={1, 2, 3, 4, 5};
        num1 = num2;

        for (int i = 0; i < num2.length; i++) {

            System.out.println(num1[1]);
        }


        int wd = 0;
        String[] days= {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {

            switch (days[i]){

                case "Sat":
                case "Sun":
                    wd -=1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd +=2;

            }
        }

        System.out.println(wd);

        char[] array= {'D', 'C', 'B', 'A'};
        Arrays.sort(array);

        for (char each : array) {
            System.out.println(each + " ");

            if (each=='D'){
                continue;

            }

        }



        int[] arr1= {1,2,3,4};
        int i=0;


        do {
            System.out.println(arr1[i] +" ");
            i++;
        }while (i < arr1.length-1);



    }







}
