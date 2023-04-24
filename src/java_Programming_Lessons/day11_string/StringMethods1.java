package java_Programming_Lessons.day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1= "Java Programming"; // literal - forever immutable
                     // String is immutable. You will not be able to change the existence string.
                     // Once the object is created it can not be modified. So new object will be created.
      str1 = str1.toLowerCase(); // that gives us a new String, all lower case version of "Java Programming"
                                // we assigned back to the new value to str1
                               // --> new object has been created "java programming"
        System.out.println(str1);

        /*
        so in total we have two String objects

        String str1= "Java Programming";
       str1 = str1.toLowerCase(); // "java programming";

         */


        String str2= "java programming";
        str2= str2.toUpperCase(); // "JAVA PROGRAMMING"

        System.out.println(str2);

       // String str3 = str2.toUpperCase(); or we can assign it to another variable and keep the original one


        System.out.println("___________________________________________");


        String word= "Wooden Spoon"; //String object is immutable any method we call, they won't be changed
                                     // the value stays the same until we reassign



        word.toUpperCase(); // "WOODEN SPOON"
                            // if we reassign we update it to Upper case method  --> word = word.toUpperCase();

        word.toLowerCase(); //"wooden spoon"
        // if we reassign we update it to Lower case method  --> word = word.toLowerCase();

        System.out.println(word); // it prints first one "Wooden Spoon"
                                  // unless we reassign the other two into the new variable

        // but after we reassign the value to a new variable it prints final value, the last value that we stored
        // into the variable

        word = word.toUpperCase();
        word = word.toLowerCase(); // -->> final value

        System.out.println(word); // wooden spoon


        System.out.println("_________________________");


        String str4= "                      Cydeo School";

       str4=  str4.trim(); // "Cydeo School" --> trims the space (updated -->reassigned)

        System.out.println(str4);


        System.out.println("___________________________________________");

        String sentence1= "Today is Sunday, and we have Java Class";
       int index1= sentence1.indexOf('w');

        System.out.println(index1); // 21 index number of 'w'



        System.out.println("_____________________________________________");


        String s1= "I Love Java Programming";

        int firstA= s1.indexOf('a');

        System.out.println(firstA); //  8 is index number of first 'a'


        int secondA= s1.indexOf("a "); // to find the index number of second 'a'



        String s2= "Java Python JavaScript Cydeo Python";
        int a1= s2.indexOf('a'); // to find index number of first a
        System.out.println(a1); // it prints out the index number 1

       int a2= s2.indexOf("a Python");

        System.out.println(a2); // index number of second a is 3

        int a3= s2.indexOf("avaSc");// 13

        System.out.println(a3);


        System.out.println("____________________________________________");


        String w= "Java";

        System.out.println(w.indexOf('a'));

        //w.lastIndexOf()
        System.out.println(w.lastIndexOf('a')); // to find the last index number of a

        String w2= "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); // last index number of a

        System.out.println(w2.lastIndexOf('p')); //last index number of p














    }
}
