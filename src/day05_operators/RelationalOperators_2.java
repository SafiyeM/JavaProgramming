package day05_operators;

public class RelationalOperators_2 {

    public static void main(String[] args) {

        //___________________ == equal // != not equal________________//

        //__________________ equal == _____________________//

        System.out.println(1000 == 2000);// false

        System.out.println("Java" == "Java"); // true

        System.out.println("java" == "JAVA"); // false // they do not have the same String of text

        System.out.println("Muhtar" == "Good Guy");// false

        System.out.println(true == false); // false
        System.out.println(true == true); // true

        System.out.println("_______________________________");

        //__________________ not equal operator != _____________________//


        System.out.println(1000 != 2000);// true

        System.out.println("Java" != "Java"); // false

        System.out.println("java" != "JAVA"); // true

        System.out.println("Muhtar" != "Good Guy");// true

        System.out.println(true != false); // true
        System.out.println(true != true); // false

    }
}
