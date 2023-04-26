package java_programming_lessons.day12_customMethods;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        eligible(35);

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);


        int num3 = 79;
        oddOrEven(num3);


        int num4 = 39;
        oddOrEven(num4);

    }

// The method takes an argument number, and verifies if the number is odd or even
    public static void oddOrEven(int number){

        if (number % 2== 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }


   //create a method that can check if a person eligible to buy alcohol

   public static void eligible(int age){

        if (age >=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }


   }



   // create a method that can check if a number is odd, or even or zero

    public static void oddEvenOrZero(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even");
        } else if (number % 2 != 0) {
            System.out.println(number + "is odd");
        }else {
            System.out.println(number + " is zero");
        }

    }


    //create a method that can calculate the grade of the students
    public static void gradeOfStudents(int score){


        if (score >=90){
            System.out.println(score + " is A");
        } else if (score >=80) {
            System.out.println(score + " is B");
        } else if (score >= 70) {
            System.out.println(score + " is C");
        } else if (score >=60) {
            System.out.println(score + " is D");
        }else {
            System.out.println(score + " is F");
        }
    }


    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)


    //Create a method that can display the initials of a person  (firstName, lastName)



        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */




}
