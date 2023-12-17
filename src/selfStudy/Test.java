package selfStudy;

public class Test {

    public static void main(String[] args) {



        int[] items = {2, 7, 3, 5, 8, 9};
        int arr1 = items[0];
        for (int i = 0; i < items.length; i++) {

            if(items[i] > arr1)
                arr1 = items[i];

        }
        System.out.println(arr1);

        System.out.println("_____________________________________");

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int j = 3;
        System.out.println(arr[ j-1]);  // 3  -> j-1= 3-1 represents 2. index number and prints the value of it

        System.out.println("___________________________________");

        String s1 = "Welcome to Java";
        System.out.println(s1.substring(3, 3)); // empty
        System.out.println(s1.indexOf("o")); // 4

        System.out.println("___________________________________");

        String s= "Java String Quiz";
        //System.out.println(s.charAt(s.toUpperCase().length())); IndexOutOfBoundsException we need to add -1
        System.out.println(s.charAt(0)); // J


        System.out.println("_____________________________________");





    }
}
