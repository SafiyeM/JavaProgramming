package selfStudy;

public class Test_String {
    public static void main(String[] args) {





        /*  String s= "abchdkla";
        System.out.println(s.charAt(s.length())); // String Index Out of bounds exception

       */

        String name= "   chuck norris  ";
        name= name.trim().toUpperCase();
        name= name.charAt(0)+"." + name.charAt(name.indexOf(" ")+1)+ ".";
        System.out.println(name);




        String str1= "java";
        String str2= new String ("java"); // not equal

        if (str1.equalsIgnoreCase( str2)){   //--> true - equals
            System.out.println("equals");
        }else {
            System.out.println("not");
        }

        String s1= "abc";
        String s2= "abc";

        System.out.println("s1 == s2: " + s1==s2); // --> false

        System.out.println("s1 == s2: " + s1.equalsIgnoreCase(s2)); // --> s1 == s2: true

        System.out.println("______________________________");




    }

}
