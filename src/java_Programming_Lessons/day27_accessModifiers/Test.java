package java_Programming_Lessons.day27_accessModifiers;

public class Test {


    public static void main(String[] args) {


        System.out.println(StaticInitializationBlock.a); // as soon as we call the class first time, static block gets executed one time
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("________________________Test Access Modifiers_______________________");


        System.out.println(AccessModifiers.publicData); // public is accessible within the same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within the same package

        System.out.println(AccessModifiers.defaultData);   // default is accessible within the same package

        // System.out.println(privateData); // private is NOT accessible within the same package


        new AccessModifiers(); // -> obj from public access modifier
                               // -> we can create obj within the same package if we have Protected Access Modifier
                               // -> we can create obj within the same package if we have Default Access Modifier
                               // -> we can NOT create obj within the same package if we have Private Access Modifier


        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
       // AccessModifiers.privateMethod();  -> no access





    }
}
