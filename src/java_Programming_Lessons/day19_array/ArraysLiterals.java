package java_Programming_Lessons.day19_array;

import java.util.Arrays;

public class ArraysLiterals {


    public static void main(String[] args) {



        int[] numbers= new int[5]; // -> this is new obj to instantiate the array
        // the elements of this array now [0, 0, 0, 0, 0,] -> we do not know the elements

        int[] nums = {10,20,30,40,30}; //-> Array literal to instantiate the array
        // if we know exactly what elements will be stored, we can use literal


        System.out.println(numbers.length); // -> 5
        System.out.println(nums.length);    // -> 5


        System.out.println("numbers = " + Arrays.toString(numbers)); // numbers = [0, 0, 0, 0, 0]
        System.out.println("nums = " + Arrays.toString(nums)); // nums = [10, 20, 30, 40, 30]


        System.out.println("________________________________________________________");


        //element:          1         2           3           4          5          6          7
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0         1           2           3          4           5         6


        int n= 1;
        System.out.println(days[n+5]); // n-1= M, n+0= T, n+1= W, n+2= Th, n+3=F, n+4= Sat., n+5= Sun


        System.out.println("___________________________________________________________");



        String[] month = {"Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*
        month = new String[12];
        month[0] = "Jan"
        ...
         */

        System.out.println("month = " + Arrays.toString(month) ); //[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]




        System.out.println("----------------------------------------------------------");

        //  int[] numbers2 = new int[100];

        for (int i = month.length - 1; i >= 0; i--) { // descending order == reversed order
            System.out.print(month[i]+ " ");          // Dec Nov Oct Sep Aug Jul Jun May Apr Mar Feb Jan
        }

        System.out.println();












    }
}
