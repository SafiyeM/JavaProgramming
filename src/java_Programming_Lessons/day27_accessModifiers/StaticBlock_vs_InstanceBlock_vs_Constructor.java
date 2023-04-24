package java_Programming_Lessons.day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {


    // for instance value -> constructor to initialize
    // for static value -> static block
    // for default value for instance-> Instance block -> but we do not use, instead we use constructor


    // CONSTRUCTOR takes argument
    // it depends on an object
    // it gets executed after instance block
    // it can get executed more than one
    public StaticBlock_vs_InstanceBlock_vs_Constructor() {

        System.out.println("Constructor");
    }


    // INSTANCE BLOCK without argument -> only known data
    // it depends on an object
    // once we create an object instance block gets executed first then constructor
    // it can get executed more than one
    {
        System.out.println("Instance block");
    }


    // STATIC BLOCK without argument -> only with known data
    // can not get executed more than once
    // execution does not depend on an object
    // it gets first executed
    // it gets executed only once
    static {
        System.out.println("Static block");
    }


    public static void main(String[] args) { // execution order 2


        System.out.println("Main Method");


        new StaticBlock_vs_InstanceBlock_vs_Constructor(); // object created for instance block and constructor

        /*
        Execution order with first object:
        Static block
        Main Method
        Instance block
        Constructor
           */

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        /*
        Execution order after creating second object:
        Static block
        Main Method
        Instance block
        Constructor
        Instance block
        Constructor

         */


    }


}
