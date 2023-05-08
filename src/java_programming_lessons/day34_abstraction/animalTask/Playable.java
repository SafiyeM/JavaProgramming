package java_programming_lessons.day34_abstraction.animalTask;

public interface Playable {


    // This is an INTERFACE
    // we can create only STATIC & FINAL variable


   // public - is default access modifier. We do not need to apply, redundant for interface members
    // it is redundant also for static and final keyword to use.
    boolean isFriendly = true; // this variable is by default static and final

    // public abstract void play(); we do not need to give keywords
    void play();  // by default abstract




/*
    // with static method we can only use PUBLIC and PRIVATE access modifiers
    private static void main(String[] arg){
        System.out.println(isFriendly);

       // isFriendly= false; we can not reassign -> It is FINAL
    }


    // in the Interface we are not allowed INSTANCE METHOD
    public void method1(){
    }


    // if a subclass which inherits this Interface also needs instance method, that has a common
    // instance method, we can give default method in the interface instead instance method
    // So we can see default as an instance method
    default void method1(){ // public is by default given no need to apply

    }

 */

}
