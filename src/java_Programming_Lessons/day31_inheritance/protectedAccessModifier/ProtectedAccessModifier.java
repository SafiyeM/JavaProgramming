package java_Programming_Lessons.day31_inheritance.protectedAccessModifier;

public class ProtectedAccessModifier {

    protected static int a = 100;

    protected static void method1(){

        System.out.println("Protected Method");
    }



    /* protected: Accessibility -> inside the class -> always
                                -> outside the class in the same package -> always
                                -> outside the package if there is a subclass -> yes
                                                       if no subclass         -> no access
     */
}
