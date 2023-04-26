package java_programming_lessons.day11_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence= "I love Python, Python is the best programming language, and Python is in high demand";

        sentence= sentence.replace("Python", "Java");

        System.out.println(sentence);


        System.out.println("_________________________");

        String word ="Java";


        word=  word.replace('a','e');  // "" this also works

        System.out.println(word);// Jeve


        System.out.println("----------------------------------");


        String sentence2= "I love Java, Java is cool";

       // sentence2= sentence2.replace("Python", "Java"); // replace all Javas

        sentence2= sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2); // I love Python, Java is cool --> we replace only first


        System.out.println("_______________________");

        String sentence3 ="Java is fun, Java is cool, Java is amazing";

       sentence3= sentence3.replaceFirst(", Java",", Python");

        System.out.println(sentence3);


        System.out.println("________________________________________");

        String sentence4= "I love Java Programming";

        sentence4= sentence4.substring(7, 10+1);

        System.out.println(sentence4);

        System.out.println("________________________________________");

        String sentence5= "Today is Sunday, Tomorrow is Monday";
                         //0123456789....14
      sentence5= sentence5.substring(9, 14+1);
        System.out.println(sentence5); //We get substring Sunday


        System.out.println("__________________________________");

        String email= "CydeoSchoolJavaProgramming@gmail.com";
       //                                 from-->@     . -->till . (from beginning index till ending index)

        int beginning= email.indexOf('@') + 1;
        int ending= email.lastIndexOf('.');

        String domain= email.substring(beginning, ending);

        System.out.println(domain);


        System.out.println("_____________________________________");

        String sentence6= "I love Java Programming";


       // String r1= sentence6.substring(7,sentence6.length()); --> we do not nee to add length wenn we want
        // until the end of the sentence. It is enough to write only the beginning index number

        String r1= sentence6.substring(7);
        System.out.println(r1); //--> this prints also Java Programming


        System.out.println("________________________________");

        String sentence7= "Today is Sunday, Tomorrow is Monday";


         String tomorrow= sentence7.substring(sentence7.lastIndexOf(' ')+1);
         // we add +1 because we want to create substring beginning from M of monday not from space ' '
        // String tomorrow= sentence7.substring(29);
        System.out.println(tomorrow);


        System.out.println("_________________________________");

        String sentence8 = "I study at Cydeo School";
        //                  012345678910 11 is the index number of C

        String schoolName =sentence8.substring(11); // to get Cydeo School

        System.out.println(schoolName);


        System.out.println("_____________________________________");



        String str = "Python";

       String result=  (str +"\n").repeat(10); // calls the Python 10 times and assign it to the result variable
                   //  (str +"\n") we concatenate \n to our string so we can see the Python in 10 different lines

        System.out.println(result);

























    }
}
