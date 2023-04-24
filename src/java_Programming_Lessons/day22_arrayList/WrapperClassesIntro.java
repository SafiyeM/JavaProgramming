package java_Programming_Lessons.day22_arrayList;

public class WrapperClassesIntro {


    public static void main(String[] args) {


        int a1 = 10;       // primitive
        Integer a2 = 10;  // -> Wrapper Class

        System.out.println("_____________________________________________");

        int b1 = 100;
        Integer b2 = b1; // Autoboxing

        // compiler converts primitive into wrapper class implicitly -> auto boxing
        // once it is converted, we can use it in other data structures -> Collection or Map

        // Long b3= b1; -> Compiler error because long is not dedicated wrapper class for int primitive data type
        // If we need to convert b1 primitive to an object, the only wrapper class we can use is Integer

        char ch1 = 'A';
        Character ch2 = ch1; //Autoboxing

        boolean hasA = true; // Autoboxing
        Boolean hasA2 = hasA;

        System.out.println("_____________________________________________");


        Integer n1 = 20;
        int n2 = n1;  // Unboxing

        // even it works to convert into other primitives, it is better to use its own primitive
        //  long n3= n1;
        //  double n4= n1;


        Character e1 = 'Z';
        char e2 = e1;

        System.out.println(e2);  // Z

        //even though unboxing is possible, we should not convert into other primitive rather than its own primitive
        // because the value will be changed completely. It will be a number, rather than a character.
        int e3 = e1;
        long e4 = e1;

        System.out.println(e3); // 90
        System.out.println(e4);  // 90


    }
}
