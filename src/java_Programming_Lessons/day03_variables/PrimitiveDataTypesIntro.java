package java_Programming_Lessons.day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // Datatype variableName= Data; // This is our Syntax to assign the data into the variables with a proper datatype

        // byte a= "Java";(This is compiler error) byte ONLY accepts integer values(-128 ~ 127)
        // byte a= 20.5; byte can not take decimal numbers
        // byte a= 2000; out of Byte's range (-128~ 127)

        byte a= 20;  // no compiler error because it's within the range of byte


        // price of the car is $17500

        short price= 17500;             // range of short = -32,768 to 32,767
        System.out.println("price");    // to call the variable we do not use double quotes ("")
                                        // because it is a String of text
        System.out.println(price);      // without double quotes ()


        // salary is $95000

        int salary= 95000;             // range of int = -2,147,483,648 to 2,147,483,647
        System.out.println(salary);


        // int n= 9_999_999_999; // It's out of int's range. That's why we use long for this big numbers

        // long n= 9_999_999_999; // compiler error- because int is the preferred data type for integer numbers
                               // in order to force the compiler as a value of long, we need to add L or l at the end.

        long n= 9999999999L;

        System.out.println(n);

        // gpa is 3.5
        double gpa1= 3.5; // double is the preferred data type of all decimal numbers

        // float gpa2= 3.5; // compiler error- because double is preferred data type for decimal numbers
                            // in order to assign double number to float, we can force the compiler,
                            // and we add F or f at the end of the data

        float gpa2= 3.5F;









    }
}
