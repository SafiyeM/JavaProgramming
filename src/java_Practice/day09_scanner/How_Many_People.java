package java_Practice.day09_scanner;

import java.util.Scanner;

public class How_Many_People {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int number_Of_People = scan.nextInt();
        scan.close();


            if (number_Of_People < 3) {
                System.out.println("Live with less than 3 people");
            } else if (number_Of_People >= 3 && number_Of_People <= 6) {
                System.out.println("Live with 3 - 6 people");
            } else {
                System.out.println("Live with more than 6 people");

            }


        //2. Solution single if

          /*  if (number_Of_People<3){
                System.out.println("Live with less than 3 people");
            }
            if (number_Of_People>=3 && number_Of_People <=6) {
                System.out.println("Live with 3-6 people");
            }
            if (number_Of_People > 6){
            System.out.println("Live with more than 6 people");
            }

           */


        scan.close();
    }

}

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */