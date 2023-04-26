package office_hours.week05.morning;

public class T4Reverse {
    public static void main(String[] args) {
        /*
        T4Reverse [String, index]

	Create a program that will have a String that is always 5 characters long.
	 Reverse that given String and print the reverse version

	ex:
		input: hello
		output: olleh

		input: java
		output: avaj

         */


        String str= "hello";
        String reverse= str.charAt(4) + ""+ str.charAt(3) +str.charAt(2)+ str.charAt(1)+ str.charAt(0);

        System.out.println(reverse);

        int index= str.length()-1; // our last index
        String reverse2=  str.charAt(index--) + ""+ str.charAt(index--) +str.charAt(index--)+ str.charAt(index--)+ str.charAt(index--);

        System.out.println(reverse2);

    }
}
