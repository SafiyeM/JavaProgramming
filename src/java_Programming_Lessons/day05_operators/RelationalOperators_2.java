package java_Programming_Lessons.day05_operators;

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



        int score = 0;

        if (score == 0){
            score +=50;
        } if (score !=0){
            score +=50;
        }
        System.out.println(score); // 100


        int num =10;
        System.out.println(num);
        if (-- num == 10){
            System.out.println("Hello Cydeo" +num);
        }else {
            System.out.println("Hello World " +num);
        }

        int num1= 9;
        if (num1 ++ == 10){
            System.out.println( "Hello World "+ num1);
        }else {
            System.out.println("Hello Universe " +num1);
        }






    }
}
