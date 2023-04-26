package java_programming_lessons.day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for ( ; condition ; ){
            System.out.println("Hello Cydeo ---> For Loop");
        }

        System.out.println("____________________________________");


        // with while the same condition with for loop, it won't execute because the condition is false

        while (condition){
            System.out.println("Hello Cydeo  ---> While Loop");
        }



        System.out.println("____________________________________");

        /*
        Do-while loop at least once gets executed regardless of condition
         */


        do {
            System.out.println("Hello Cydeo ---> Do-While Loop");
        } while (condition);       // even if the condition is false, it gets executed
                                   // do-while loop-> first executes the statement and then check the condition
                                   // but after checking the condition if it is false, it will not get
                                   // executed again, if true it will repeat to execute.





    }
}
