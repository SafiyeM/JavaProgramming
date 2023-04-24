package java_Practice.day08_ternarySwitch;

public class CydeoBatches {
    public static void main(String[] args) {


        String batchType= "US morning";

        // Solution 1: use if statement

        if (batchType== "US morning"){
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");

        } else if (batchType== "US evening") {
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");

        } else if (batchType== "EU") {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");

        } else {
            System.out.println("Invalid batches");
        }

        System.out.println("________________________________________________");



       //Solution 2: use switch statement
        String result;

        switch (batchType){
            case "US morning": result="Class times are 10-5 EST. M, T, Th, F."      ; break;
            case "US evening": result="Class times are 7-10 EST. M, T, W, Th, S, S" ; break;
            case "EU":         result="Class times are 10-5 EST. M, T, W, Th, F."   ; break;
            default:           result="Invalid Batch";
        }
        System.out.println(result);



        System.out.println("_________________________________________");


        // Solution 3: Ternary
        String result2;


        result2= (batchType== "US morning")?"Class times are 10-5 EST. M, T, Th, F."
                :(batchType== "US evening")?"Class times are 7-10 EST. M, T, W, Th, S, S"
                :(batchType== "EU")?"Class times are 10-5 EST. M, T, W, Th, F."
                :"Invalid Batch";
        System.out.println(result2);





    }
}
/*
        10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 3: use if & switch statements mixed
         */
