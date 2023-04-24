package java_Programming_Lessons.day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {


        maxNumber(10_000, 30_000);
        maxNumber(10,10);



        initialsOfPerson("Sofia", "Mer"); // S.M



    }

    // create a method that can print the maximum number between two numbers,
    // if both are equal then it prints "Equal", (num1, num2)
public  static  void maxNumber(double num1, double num2){
        if (num1>num2){
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number" );
        }else {
            System.out.println("Equal");
        }



}



    //Create a method that can display the initials of a person  (firstName, lastName)

    public  static void initialsOfPerson(String firstName, String lastName){

        String initial= firstName.charAt(0) + "."+ lastName.charAt(0);
        System.out.println("initial is: " + initial);






    }
        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */






}
