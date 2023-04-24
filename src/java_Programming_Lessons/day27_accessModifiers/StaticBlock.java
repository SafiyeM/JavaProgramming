package java_Programming_Lessons.day27_accessModifiers;

public class StaticBlock {


    public StaticBlock(){  // After main method constructor's objects will be executed -> Third execution
        System.out.println("Constructor"); // this get executed three times, because we created three object below
    }

    public static void main(String[] args) { // after static block below mein method will be executed -> Second execution

        System.out.println("main block");

        // the static block execution does not depend on the object, and it will be executed only once
        // the constructor will be executed not the static one
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();


    }


    static { // static block will be first executed -> First execution

        System.out.println("static block");
    }



}
