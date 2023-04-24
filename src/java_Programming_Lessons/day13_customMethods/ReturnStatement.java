package java_Programming_Lessons.day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {




        eligible(25);

        eligible(0);

        System.out.println("------------------------------------");



        System.out.println("Test1 Started");

        boolean exit = true;
        if(exit){
            return; // main method gets terminated
            //    System.out.println("Hello");
        }

        System.out.println("Test1 Completed");

        System.out.println("Test2 started");







    }


    public static void eligible(int age){


        if (age < 0|| age > 150){
            System.err.println("invalid age: " +age);
            return; // exits the method
            // if the age is invalid, then this method gets terminated
        }


        if (age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible");
        }








    }



public static int multiplication(int num1, int num2){


        int result= num1 * num2;
        return result; // returns the value when exiting the method




}


}
