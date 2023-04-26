package office_hours.week06;

public class Extra {


    /*

    Swap two character in a String

     */

    public static String swapChars(String str, int firstIndex, int secondIndex){

        String result= "";

        char firstChar= str.charAt(firstIndex);
        char secondChar= str.charAt(secondIndex);


        result += str.substring(0, firstIndex) + secondChar + str.substring(firstIndex + 1, secondIndex) + firstChar + str.substring(secondIndex + 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swapChars("hamburger", 3, 6));
        System.out.println(swapChars("hamburger", 3, 8));
        System.out.println(swapChars("hamburger", 3, 1100));
        System.out.println(swapChars("java", 0, 3));
        System.out.println(swapChars("java", 3, 0));
        System.out.println(swapChars("java", 3, 3));


    }



}
