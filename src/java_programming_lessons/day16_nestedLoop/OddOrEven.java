package java_programming_lessons.day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

                          //______________Nested Loop__________________//


        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")){ // this loop could run infinite times if the answer yes
         // or while(true)

            // to determine even odd number
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if(number %2==0 ){
                System.out.println(number+ " is an even number");
            }else{
                System.out.println(number+ " is an odd number");
            }

            // next step ask user yes or no
            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();

             // But user can give also another invalid answer
            // To get rid of this bug, we create another while loop if the user gives invalid data

            while( !(answer.equals("yes") || answer.equals("no")) ){        // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }

           // the loop can run infinite times this code is to stop the loop

            if(answer.equals(("no"))){
                break;
            }

         } // end of while loop


    }
}