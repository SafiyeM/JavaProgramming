package java_Programming_Lessons.day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {



        //______________ Implicit Casting ________________

        byte a = 15;

        short b = a;

        System.out.println(b);

        int c = a; // implicit casting
        long d = 3000L;
        float f = d;

        System.out.println(d);


        // ______________ Explicit Casting _____________

        int x = 100;
        byte y = (byte)x;
        System.out.println(x);

        float z = 20.8F;
        short q = (short)z; // z=20.8;
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1; // n1= 2.5;
        System.out.println(n2);


        System.out.println("_________________________________________________");

        int num = 500;
        byte result= (byte) num; // explicit casting

        System.out.println(result);


        int r = 50000;
        short t= (short) r;

        System.out.println(t);

        System.out.println("_________________________________________________");


        double u = 3000.5;
        int p= (int) u; // explicit casting

        System.out.println(p);

        int o= 100;
        double d1 = o;

        System.out.println(d1);




    }
}
