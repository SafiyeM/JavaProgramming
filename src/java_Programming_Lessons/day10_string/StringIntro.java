package java_Programming_Lessons.day10_string;

import java.util.Scanner;

//import java.lang.String; -->> we do not import, it is imported implicitly.
//import java.lang.System; -->>             --""--
public class StringIntro {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); // by using scanner, we have to give import statement manually
        String str= "Java";    // String and System statements are implicitly imported.
                               // we do not need to write --> import java.lang.String

        System.out.println(str = str.substring(0)); // or (beginIndex0, 3+1) or 4

        System.out.println(str.repeat(4));

        System.out.println(str.contains("Python"));

        System.out.println(str.startsWith("Ja"));

        System.out.println(str.endsWith("va"));


    }
}
