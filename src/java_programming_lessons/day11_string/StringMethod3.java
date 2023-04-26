package java_programming_lessons.day11_string;

public class StringMethod3 {
    public static void main(String[] args) {

        String word= "Java";

       boolean r1=  word.isEmpty(); // because we call isEmpty as boolean method,
                                   // we assign it to a boolean variable

        System.out.println(r1); //false--> we get false because we have characters
                               // in our String it is not empty --> != to 0

        String word1= "";
       boolean r2= word1.isEmpty();

        System.out.println(r2);//true--> we get true because we have an empty value of string


        String word2= "         "; // blank
        boolean r3= word2.isBlank();

        System.out.println(r3); // true --> because we have a blank String


        System.out.println("______________________________");


        String str1= "Cydeo";

        String str2= new String("Cydeo");

        System.out.println(str1.equals(str2)); // if they have same characters it returns true


        String str3= new String("cydeo");

        System.out.println(str2.equals(str3)); // false--> they are not equal str3 is lowercase

        System.out.println("________________________________");

        String s1= "JAVA";
        String s2= "java";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true


        System.out.println("___________________________________________");

        String student= "Hasan Naran Sumeyye Natalia";

        boolean hasAhmed= student.contains("Ahmed");


        System.out.println(hasAhmed); // false--> The String text does not contain Ahmed


        System.out.println("____________________________________");

        String sentence= "My favorite programming language is JAVA";

        boolean hasJava= sentence.toLowerCase().contains("java"); //true --> what happens here is: We call first the lower case of all sentence
                                                            // and then ask if there is a lower case java in the String text
                                                             //  that's why it is true

        System.out.println(hasJava); // true-->


     String name= "Micheal";

     boolean l= name.startsWith("Da");

     System.out.println(l);// false


     String url= "www.cydeo.com";

     boolean isValid= url.startsWith("www.");

     System.out.println(isValid); // true

     boolean t= url.endsWith(".com");

     System.out.println(t);


     String email= "CydeoSchool@gmail.com";

     boolean isGmail= email.endsWith("gmail.com");

     boolean isYahoo= email.endsWith("yahoo.com");

     boolean isHotmail= email.endsWith("hotmail.com");


        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);

















    }
}
