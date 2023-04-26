package java_practice.day13_customMethods;

public class Capitalized {
    public static void main(String[] args) {


        System.out.println(title("nalan"));


    }


    public static String title(String str){

        String properCap = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();


        return properCap;
    }



}
/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
    frequencyOfWord("Java java jAvA")  ===> Java
 */