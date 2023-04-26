package java_programming_lessons.day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200; // public access modifier

    protected static int protectedData = 300;  // protected access modifier

    static int defaultData = 400;  // for default access modifier we do not have any keyword such as 'default'

    private static int privateData = 500; // private access modifier



    // Constructor of public
    public AccessModifiers(){

    }




    public static void publicMethod(){

        System.out.println("Public");
    }


    protected static void protectedMethod(){

        System.out.println("Protected");
    }


    static void defaultMethod(){

        System.out.println("Default");
    }


    private static void privateMethod(){

        System.out.println("Private");
    }






    public static void main(String[] args) {

        System.out.println(publicData); // public is accessible within the same class
        System.out.println(protectedData);  // public is accessible within the same class
        System.out.println(defaultData); // default is accessible within the same class
        System.out.println(privateData);  // default is accessible within the same class


        new AccessModifiers(); // we can create object within the same class with :
                               // public access modifier
                               // protected access modifier
                               // default access modifier
                               // private access modifier

        // all accessible within the same class


        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();





    }





}
