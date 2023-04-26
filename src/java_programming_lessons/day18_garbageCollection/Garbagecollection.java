package java_programming_lessons.day18_garbageCollection;

public class Garbagecollection {

    public static void main(String[] args) {


        String s1= "Java";
        s1= null;  //null does not take any memory- it does not refer any object
         // s1 has now no object anymore
        // and "Java" object becomes unreferenced, will be eligible for garbage collection

      //  System.out.println(s1.toUpperCase());               -> nullPointerException
     //   System.out.println(s1.replace(null, " Python"));    -> nullPointerException

        System.out.println(s1);

        String a = ""; // -> this is an object
        String b = null; // -> this is nothing, does not exist

        System.out.println("_______________");

        String str1= "Python";//-> Python is now in garbage collection
        str1= "Cydeo";        // -> new object is "Cydeo"

        System.out.println(str1);


        System.out.println("__________________________________");









    }
}
