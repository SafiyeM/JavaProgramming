package office_Hours.week06;

public class T1Army {
    public static void main(String[] args) {

        eligibleForArmy(16,true,true);



    }


    public static void eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen){


        if (age >= 18 && age <= 35 && hasDiploma && isCitizen){
            System.out.println("You are qualified to join the Army");
        }else {
            System.err.println( " You are NOT qualified to join the Army");


            if (age < 18){
                System.err.println(age + " is less than our minimum age");
            } else if (age>35){
                System.err.println(age+ " is more than our maximum age");
            }


            if (!hasDiploma){
                System.err.println("You must have a high school doloma");
            }


            if (!isCitizen){
                System.err.println("You must be a citizen");
            }


        } // End of else



    } // method ends
}
/*
T1Army [methods, conditional]

    Create a method that will determine if you are eligible to join the army. It will be a void method that accepts 3 parameters:
     age, has a high school diploma, and is a citizen

    to be eligible to join you must be between the age of 18-35, have a diploma, and must be a citizen
        if you are eligible print: You are qualified to join the Army

        if you are not eligible print all the reasons why you cannot join
            (it can be any combination of conditions, even all of them could not be met)

    Ex:
        (25, true, true) -> You are qualified to join the Army

        (45, true, true) -> You are NOT qualified to join the Army:
                            45 is more than our maximum age

        (16, false, false) ->   You are NOT qualified to join the Army:
                                16 is less than our minimum age
                                You must have a high school diploma
                                You must be a citizen

 */

/*
public static void eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen) {

        String message = "";
        String messageNo= "";

                /*if we use or || operator one of the condition is true then it returns true.
                        // age = 55;
                        55                 true         true
                true    ||    false    &&   true     &&       true
                        true                true            true

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen) {
                message += "You are qualified to join the Army";
                System.out.println(message);
                } else {
                messageNo += "You are NOT qualified to join the Army:\n";

                if ((age < 18)) {
        messageNo += age + " is less than our minimum age\n";
        } else if ((age > 35)) {
        messageNo += age + " is more than our maximum age\n";

        // !false
        if (!hasDiploma) {
        messageNo += "You must have a high school diploma;\n";
        }
        if (!isCitizen) {
        messageNo += "You must be a citizen";
        }
        }
        System.err.println(messageNo);
 */