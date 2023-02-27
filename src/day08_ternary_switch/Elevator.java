package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        //_______________________Nested If__________________________//

        int floorNumber= 2;
        String result= "invalid floor";

        // 2. Solution --> optimize

        if (floorNumber >=1 && floorNumber <=3 ){ // we deleted else statement of pre-condition and add the print text to the result variable above
             result= "Floor "+ floorNumber +" selected. Companies: "; // if pre-condition is true, print one of the block below

            if (floorNumber ==1){
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber==2) {
                result += "Cydeo, NASA, Intelsat";
            }else {
                result +="Lyft, BofA, Stake house";
            }

        }

        System.out.println(result);


       /* 1. Solution

           if (floorNumber >=1 && floorNumber <=3 ){


            if (floorNumber ==1){
                result= "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNumber==2) {
                result= "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            }else {
                result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else {
            result="invalid floor";
        }

        System.out.println(result);

        */


    }

}
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"

 */