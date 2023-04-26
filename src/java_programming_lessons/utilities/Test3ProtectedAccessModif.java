package java_programming_lessons.utilities;

import java_programming_lessons.day31_inheritance.protectedAccessModifier.ProtectedAccessModifier;

public class Test3ProtectedAccessModif extends ProtectedAccessModifier {


    // Test3ProtectedAccessModif is a subclass

    public static void main(String[] args) {


        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();


        /*
        Protected Access M. can not be accessed from other packages.
        If we want to access there is a precondition.
        Pre-Condition: It has to be in the subclass

        This class is subclass of ProtectedAccessModifier class

         */

    }
}
