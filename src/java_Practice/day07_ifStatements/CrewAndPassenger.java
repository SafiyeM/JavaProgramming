package java_Practice.day07_ifStatements;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int number = 50;
        String result = "Total: ";

        if (number == 50 || number == 75 || number == 100) {  // number: 50, 75, 100


            if (number == 50) {
                result += "50 ==> 20 crew, 30 passenger";
            } else if (number == 75) {
                result += "75 ==> 25 crew, 50 passenger";
            } else {
                result += "100 ==> 30 crew, 70 passenger";
            }


        } else {
            result = "invalid number";
        }

        System.out.println(result);


    }
}

/*
3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number),
   determine how many need to be crew members and how many can be passengers.
   Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */