package java_Live_Review.week2;

public class Operator {
    public static void main(String[] args) {



        int age= 10;
        age++;
        System.out.println(age);// 11

        System.out.println(age++); // the purpose of this line is just to print age first,
        // after this line then updates by adding 1

        System.out.println(age);// it is updated 12


        int num= 5;
        System.out.println(++num); // it changes the value immediately so num is 6 now
        System.out.println(num++); // num++ 6 // post increment


        int x= 15;
        int y= x++;
        System.out.println("x " +x); // 15-> 16
        System.out.println("y " +y); // 15


        int z= 90;
        int w= --z; //because this is a pre decrement we subtract 1 right away
        System.out.println("z " +z); // z= 90 -> 89
        System.out.println("w "+w); // w= 89


        int a= 3;
        int b= 5;
        a++; // a is in the next line 4
        int c= a+b; // 4+5=9
        System.out.println(c);

        /*

        a++;
        int c= a+b;

        is the same
        int c= ++a + b;
         */

    }
}
