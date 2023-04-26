package java_programming_lessons.day27_accessModifiers;

public class InstanceBlock {

    {  // instance block
        System.out.println(" Instance block");
    }

    public InstanceBlock(){

        System.out.println("Constructor");
    }

    public static void main(String[] args) {
       // the order of an execution

        // first gets Constructor executed if we do not have instance block, otherwise instance block first
        new InstanceBlock();  // Instance block
                              //Constructor

        new InstanceBlock(); // Instance block
                             //Constructor

        new InstanceBlock();  // Instance block
                              //Constructor


    }




}
