package java_Practice.day12_customMethods;

public class eligibleToVote {

    public static void main(String[] args) {



        /*
        6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote


         */
        eligible(28, false);

    }

    public static void eligible(int age, boolean isAmerican){


        if (age >=18 && isAmerican == true){

            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible");
        }






    }





}
