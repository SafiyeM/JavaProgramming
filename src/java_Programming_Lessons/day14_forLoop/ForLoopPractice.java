package java_Programming_Lessons.day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

      /*  for (int i=5; i<=10; i--){ // This condition is always going to be true, wrong iterator gets the loop infinite times executed
            System.out.println("Hello Cydeo"); // --> we need to prevent that by using right condition and right iterator.
            // Condition must be created based on the initialization variable!!! Condition has to involve the value of initialization!
            // Iterator must the condition false, otherwise it executes the code infinite times
        }

       */
                                                         // Statement after infinite loop
        System.out.println("Hello World, how are you?"); //--> it never gets executed if for loop condition never stops to execute


        // to track forward direction is easier than backward direction
        // backward we decrease --> it will start from 10 to 5 (if we do not use >= 5 is excluded)
        for (int i= 10; i >=5; i--){ //i: 10, 9, 8, 7, 6, 5, 4 (and stops (10>=4) condition is false because we go backwards iteration is 4 now)
            System.out.println("Hello cydeo " + i); // 1, 2, 3, 4, 5, 6


            System.out.println();  // java runs top to bottom, after for loop statement it prints out this empty statement


            /*
            Hello cydeo 10    // so we have space between statements

            Hello cydeo 9

            Hello cydeo 8


             */

        }




        for (int i= 10; i >= 5; i--){ //if we use >= operator in this case it will print the statement 6 times not 5 times
        System.out.println(i+ " Hello cydeo");
        }
 /*
         For loop flow -->
        1==> initialize i variable to 10
        2==> check condition --> i >= 5 is true
        3==> execute print statement (code block)
        4==> execute iteration step  --> i--

        first step --> loop check the initialization ==> so i will be set to 10 i=10
        second step --> after initialization loop check the condition ==> (10>=5) if true --> the print statement is executed--> 1 time
        third step --> after print statement execution ==> the iterator will be executed again. i= 10,9 (i will be decreased by one)

        fourth step --> condition will be checked again ==> (9>=5) if true then ==> print statement is executed --> 1, 2 time
        fifth step --> after print statement execution ==> the iterator will be executed again. i= 10,9,8

        six step --> condition will be checked again ==> (8>=5) if true then == print statement is executed --> 1, 2, 3 time
        seventh step --> after print statement execution ==> the iterator will be executed again. i= 10,9,8,7

        eighth step --> condition will be checked again ==> (7>=5) if true then == print statement is executed --> 1, 2, 3,4 time
        ninth step --> after print statement execution ==> the iterator will be executed again. i= 10,9,8,7,6

        10th step --> condition will be checked again ==> (6>=5) if true then == print statement is executed --> 1, 2, 3,4,5 time
        11th step --> after print statement execution ==> the iterator will be executed again. i= 10,9,8,7,6,5

        12th step --> condition will be checked again ==> (5>=5) if true then == print statement is executed --> 1, 2, 3,4,5,6 time
        13th step --> after print statement execution ==> the iterator will not be executed again. i= 10,9,8,7,6,5,  4--> 5>=4 ->False






         */





    }
}
