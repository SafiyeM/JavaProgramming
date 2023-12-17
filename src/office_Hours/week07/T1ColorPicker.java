package office_Hours.week07;

import java.util.Scanner;

public class T1ColorPicker {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int colors = 1;
        String selected = "Here are the colors you picked: ";

        while(colors <= 3){

            System.out.println("Enter color " + colors);
            String currentColor = input.nextLine().toLowerCase().trim();

            if(!selected.contains(currentColor)){ // true is the color is unique - String doesn't have that color yet
                selected += currentColor + ", ";
                colors++;
                System.out.println(currentColor + " added");
            } else {
                System.out.println(currentColor + " is already selected, please try again");
            }

        }

        System.out.println(selected.substring(0, selected.length() - 2));

       /* Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;
        while(isTrue) {
            String colorsGroup = "";

            System.out.println("Please enter color1");
            System.out.print("\t>");
            String color1 = scanner.next().toLowerCase().trim();
            colorsGroup += color1;
            System.out.println(color1 +  " is already selected");

            // colorsGroup = "red";
            System.out.println("Please enter color2");
            System.out.print("\t>");
            String color2 = scanner.next().toLowerCase().trim();

            while (colorsGroup.contains(color2)) {
                System.err.println("The color you've entered already exist");
                System.out.println("Please enter another color");
                System.out.print("\t>");
                color2 = scanner.next().toLowerCase().trim();
            }   // "red, "               ""+ ", "+ black
            // colorsGroup = colorsGroup + color2
            colorsGroup += ", " + color2;
            System.out.println(color2 +  " is already selected");
            // "red, black"

            // colorsGroup = "red, black "
            System.out.println("Please enter color3");
            System.out.print("\t>");
            String color3 = scanner.next().toLowerCase().trim();

            while (colorsGroup.contains(color3)) {
                System.err.println("The color you've entered already exist");
                System.out.println("Please enter another color");
                System.out.print("\t>");
                color3 = scanner.next().toLowerCase().trim();
            }

            colorsGroup += ", " + color3;
            System.out.println(color3 +  " is already selected");
            // colorsGroup = "red, black, purple"
            System.out.println("Here are the colors you picked: " + colorsGroup);

            System.out.println("Would you like to do it once more");
            String answer = scanner.next().toLowerCase().trim();

            while(!( answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer");
                System.out.println("Please enter Yes/No");
                answer = scanner.next().toLowerCase().trim();
            }

            // isTrue = true
            if(answer.equals("no")){
                isTrue = false; // System.exit(1) -- return;
            }
        }


        */

    }
}

/*
T1ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already.
     If the color is unique add it to the final selection otherwise tell the user the colors should be
     unique and allow them to reenter a different color. The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange
 */