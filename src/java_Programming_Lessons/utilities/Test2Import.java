package java_Programming_Lessons.utilities;

// import java_Programming_Lessons.day27_accessModifiers.Data; -> without importing the class we can import static member that we need only

//import static java_Programming_Lessons.day27_accessModifiers.Data.d; -> imports only one static member from the class

import java_Programming_Lessons.day27_accessModifiers.Data;  // for instance objects

import static java_Programming_Lessons.day27_accessModifiers.Data.*; // '*' imports all the static members from Data class (only fo static)
                                                                    // using import provides advantage over the memory usage

public class Test2Import {

    public static void main(String[] args) {


        // System.out.println(Data.d); -> we do not need to call static variable through class name,
        //                                if we import directly

        // if we import all the static members of class, we can call the static variables and methods through the names
        // static methods
        method3();
        method4();

        // static variables
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);

  /*
     // instance variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // instance methods
        method1();
        method2();
 */
     // we need to create first a new object to use instance members of Data class
        Data data = new Data();

        data.method1();
        data.method2();

        System.out.println(data.a);
        System.out.println(data.b);
        System.out.println(data.c);


    }


}
