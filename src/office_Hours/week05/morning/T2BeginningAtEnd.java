package office_Hours.week05.morning;

public class T2BeginningAtEnd {
    public static void main(String[] args) {

        /*
        T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false

         */


        String str= "educated";

        String begin= str.substring(0,2); // 2 is not included

        System.out.println(str.endsWith(begin));

















    }
}
