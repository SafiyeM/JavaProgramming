package java_Programming_Lessons.day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default Constructor");

    }

    public ConstructorCalls(int a){
        this(); // use this keyword to call constructor
        // ConstructorCalls(); -> We can NOT call Constructor by its name !!! -> see class notes for more info

        System.out.println("Constructor with int argument");

        //this(); Constructor MUST be at the first step
    }

    public ConstructorCalls(double a){

        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String a){
        this(2.5); // we call double Constructor
        // this();       one constructor can NOT call more than one Constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

        System.out.println("______________");

        method2();


    }

    public static void method1(){

        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");

    }




}
