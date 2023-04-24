package java_Programming_Lessons.utilities;

import java_Programming_Lessons.day27_accessModifiers.AccessModifiers;
import java_Programming_Lessons.day27_accessModifiers.Data;

public class TestAccessModifiers {

    public static void main(String[] args) {


        System.out.println("____________________Test Static and Instance_____________________");
        System.out.println(Data.d); // static variable
        System.out.println(Data.f);
        System.out.println(Data.e);

        Data.method3(); // static method
        Data.method4();

        Data obj = new Data(); // for instance members

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


        System.out.println("________________________Test Access Modifiers_____________________");

        System.out.println(AccessModifiers.publicData);  // public is always accessible in different packages
        // System.out.println(AccessModifiers.protectedData); protected is NOT always  accessible in different packages
        //System.out.println(AccessModifiers.defaultData); default is NOT be accessible in different packages
        // System.out.println(privateData); // private is NOT accessible in different packages


        new AccessModifiers();  // -> object from public access modifier
        // -> we can Not create obj in different packages if we have Protected Access Modifier
        // -> we can Not create obj in different packages if we have Default Access Modifier
        // -> we can NOT create obj in different packages if we have Private Access Modifier


        AccessModifiers.publicMethod();
        // AccessModifiers.protectedMethod(); -> no access
        // AccessModifiers.defaultMethod();   -> no access
        // AccessModifiers.privateMethod();   -> no access


    }


}
