package java_programming_lessons.day26_statics;


public class ConstructorCalls2 {


    public ConstructorCalls2() {
        //  this(3); Constructor can not call or contain itself
        System.out.println("Default");
    }


    public ConstructorCalls2(int a) {
        this(); // calling the default constructor
        System.out.println("int arg");
    }


    public ConstructorCalls2(String a) {
        this(3);
        System.out.println("String arg");
    }

    public static void main(String[] args) {


        ConstructorCalls2 obj1 = new ConstructorCalls2(); // Default constructor will be executed


        System.out.println("____________________________");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10); // Default and int arg

        System.out.println("____________________________");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java"); // Default, int arg String arg


    }


}
