package java_practice.day12_customMethods;

public class Day {
    public static void main(String[] args) {
        /*

4. Create a method named day that can display the name of the day based on the given number to the method,
 if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
         */

        weekOfDays(6);


    }

    public  static void weekOfDays(int number){


        if(number >=1 && number <=7){

            switch (number){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

        }else {
            System.err.println("Invalid Number");
        }




    }




}
