package java_programming_lessons.day32_finalKeyword;

import java.time.LocalDate;

class Student { //  EXAMPLE of applying final to a CLASS
                // if we apply final to the parent class it can not be inherited.
                // 'final' prevents class to be inherited

    // EXAMPLE of applying final to an INSTANCE
    public final void language(){  // we add final keyword in order to become the method unchangeable

        System.out.println("Java Programming");
    }
}




public final class FinalKeyWord extends Student { // there would be COMPILER ERROR ,if we apply 'final' to the parent class' header

    // we applied final to this class, now it can not be inherited / extended anymore

 /*
 !!! Since we add 'final' keyword to the method language() in parent class, it will never be overridden afterwards
    @Override
   public void language() { -> compile - not allowed to override
        System.out.println("Python Programming");
    }
    */


   /*
   // EXAMPLE of applying final to an STATIC
    //There is no point to apply 'final' keyword to a static method.
    // static methods can never be overridden.

    public final static void read(){
        System.out.println("reading book");
    }
    */


    /*
    // EXAMPLE of applying final to a CONSTRUCTOR -> NO FINAL FOR CONSTRUCTOR

    public final FinalKeyWord() { -> compile error
    }
     */


    public static void main(String[] args) {

        char gender = 'M';

        System.out.println(gender); //'M'
        gender = 'F';  // a new value is stored into the local variable and the old one's gone after this line
        System.out.println(gender); //'F'

        /*
        The variable we created is above changeable.

        If we want the variable unchangeable,
        we add final keyword before data type

         */

        // 'final' can only be assigned one and last time -> UNCHANGEABLE
        final int age= 30;
        System.out.println(age);

        // age= 20; compile error -> final prevents variable being reassigned.


        System.out.println("________________________________________________");

        /*
        There are some information in real life that has to have a constant value like date of birth. We can not change
        ones date of birth. That's why we use for such information 'final' keyword to prevent being changed.
         */
        final LocalDate dateOfBirth = LocalDate.now(); // someone is born now, we can not reassign, the variable
        // dateOfBirth after this line. It becomes unchangeable.

        //dateOfBirth = dateOfBirth.plusYears(1); -> compile error when we try to reassign

        System.out.println(dateOfBirth); //2023-04-30


        System.out.println("________________________________________________");


       /*
       if we would not add final keyword for the method language() in parent class
       This output will be correct:

        new Student().language(); // Java Programming
        new FinalKeyWord().language(); // Python Programming
        */

        // output with final keyword:

        new Student().language(); // Java Programming
        new FinalKeyWord().language(); // Java Programming

        System.out.println("________________________________________________");


        // Ways the object to be eligible for GC
        String name = "James";
        //name = null; // to be eligible for Garbage Collection we can assign null keyword


        // another way: name can be referenced by another object instead "James"
        name = "Daniel";
        System.out.println(name); // Daniel -> James is now eligible for GC


        // if we want to prevent the object being eligible for GB, we apply the variable final keyword


        final String name2 = "Christina";
       // name2 = "Laura"; -> final prevents name2 to be reassigned
        System.out.println(name2);












    }

}
