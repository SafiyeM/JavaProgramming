package java_programming_lessons.day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

                 // ________________pre Increment/Decrement____________________//

         int x = 10; // x is operand here

        System.out.println( ++x ); // this is pre increment ==> x will be 11 in this case
                                   // because increment operator ++ is before the operand x
        System.out.println(x); // in the memory the value of x changed to 11

        //-----------------Pre increment means: it changes the value by 1 immediately


        System.out.println("__________________________");

        int y= 100;

        System.out.println(--y); // y will be 99 because pre decrement operator --
                                // decreased the value by 1 immediately, next time when we call y operand
                               // the value will be 99 until we change it.

        // ______________________Post Increment/Decrement_______________________//

        int a = 50;
        System.out.println( a++ );// you will get 50 on the console ==>
                                 // It does not change the value immediately
        System.out.println(a); // You will get 51 ==> it changes the value by 1

        System.out.println("_____________________");

        int b = 25;
        System.out.println( b-- );// It is 25 at first step
        System.out.println(b); // it is 24 now. The value is decreased.

        int n = 30;
        int m = n++; // post increment ==> it will give the value 30

        System.out.println("the value of m:" +m); // the value at fist the same 30
        System.out.println("the value of n:" +n); // but next step the value changed 31 eventually


        int z= 60;
        int q= z--; // q is 60 now. The old value of z assigned at first step to q.
                   // As a second step the value of z will be decreased by 1 and will be 59.

        System.out.println("the value of q:" +q);
        System.out.println("the value of z:" +z);

       // (Hamidenn sorusu)
        q= z--; // whenever you assign the value of z to q it will decrease by 1

        System.out.println(q);// 59
        System.out.println(z); // 58










    }
}
