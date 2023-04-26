package java_programming_lessons.day27_accessModifiers;

public class StaticInitializationBlock {


    // if we have one step to set the static variables, then we can set here. i.e -> public static int a = 100;
    public static int a ;
    public static double b ;
    public static String c ;

    // public static ExcelSheet sheet; If we have variable that needs more than one step to set
    // we need a block of code in order to set this static variable. Those steps we can write codes in the static block

    static { // a static block is also called static initialization block -> it is the best choice to initialize static variables

        a = 100;
        b = 20.5;
        c = "Java";
    }

  /*  public StaticInitializationBlock() { // we do NOT use constructor to initialize the static variables.
        a= 100;
        b= 20.5;
        c= "Java";
    }
   */


/*
    we should NOT be using any method to initialize the static variables.

      public static void main(String[] args) {

        a = 100;
        b = 20.5;
        c = "Java";
    }  This main method will not get executed in other classes. We need to initialize in a static block

  We can not use the data properly in other classes
     */










}
