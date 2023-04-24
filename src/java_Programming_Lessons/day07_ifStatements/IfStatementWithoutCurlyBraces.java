package java_Programming_Lessons.day07_ifStatements;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        // IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE // but is is doable, but we do not do! Not good habit!

        int age= 32;

        if (age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }


        System.out.println("___________________________________________");


        if (age >=21) System.out.println("eligible"); // if there is ONLY ONE statement (code fragment) to print,
        else System.out.println("not eligible");     // we can use if statement without curly braces.


        System.out.println("______________________________________________");

        int itemNumber= 1;

        if (itemNumber == 1) { //// if there is MORE than one statement to print, we must use curly braces.
            System.out.println("Eggs");
            System.out.println("Orange");
        } else if (itemNumber == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else {
            System.out.println("Apple");
            System.out.println("Cherry");
        }


        System.out.println("_________________________________________________________");


        int day= 2; // 1~7
        String result="";

        if (day == 1) result= "Monday"; //  System.out.println("Monday");
        else if (day == 2) result= "Tuesday";
        else if (day == 3) result="Wednesday";
        else if (day == 4) result= "Thursday";
        else if (day == 5) result= "Friday";
        else if (day == 6) result= "Saturday";
        else result= "Sunday";
        System.out.println(result);



    }
}
