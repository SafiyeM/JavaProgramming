package java_Programming_Lessons.day21_multiDimentionalArray;

public class RemoveExtraSpaces {

    public static void main(String[] args) {



        String str = "  Hello world      I      love      Java    ";

       // str= str.trim();

       // System.out.println(str);//"Hello world      I      love      Java" trimmed spaces at the beginning and end

        String[] words= str.split(" ");

        str="";

        for (String each : words) {
            if (!each.isEmpty()){
                str += each + " ";
            }
        }

        str= str.trim(); // to remove last space
        System.out.println(str); // Hello world I love Java











    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */