package java_practice.day16_nestedLoop;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

      while (true){

          System.out.println("Enter the side of the square:");
          double side= input.nextDouble();

          if (side <=0){
              System.err.println("Invalid Entry for the side of the square");
              System.exit(1);
          }

          double area= side * side;
          double perimeter= side *4;


          System.out.println("area of square: " + area);
          System.out.println("perimeter of square: " + perimeter);


          System.out.println("Would you like to calculate another Square? (yes or no)");
          String answer= input.next().toLowerCase();

          while( !(answer.equals("yes") || answer.equals("no")) ){
              System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
              answer = input.next().toLowerCase();
          }

          if(answer.equals("no")){
              System.out.println("Thank you for using Cydeo square calculator app!");
              break;
          }


      }




    input.close();


    }
}
/*
4. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                 the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */