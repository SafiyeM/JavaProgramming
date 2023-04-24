package office_Hours.week03;

public class AnalyseCode {
    public static void main(String[] args) {

        int a = 8;
        int b = a--;
        System.out.println(a); // 7
        System.out.println(b); // 8

        System.out.println("________________________________________");

        float speed = 20.5f;

        byte num1 = (byte) speed; // we need explicit casting (manually)
        short num2 = (short) speed; // explicit casting
        int num3 = (int) speed; // explicit casting
        long num4 = (long) speed; // explicit casting
        float num5 = speed; // implicit (casted automatically)
        double num6 = speed; // implicit


        int c = 10;
        int d = c-- + 3; // first step -> 10+3= 13 | next -> 13 is assigned to d | third step-> c to subtract 1 -> 9

        System.out.println(c); // 9
        System.out.println(d); // 13


        int z = 9;
        int y = --z * 2; // 8 * 2 = 16  // z=8 it subtracts immediately
        System.out.println(z); // 8
        System.out.println(y); // 16

        System.out.println("__________________");


        int k = 6;
        int l = ++z / 2;  // z+1 = 9 / 2 = 4 int
        System.out.println(k); // 6
        System.out.println(l); // 4


    }
}
/*
T3 AnalyzeCode [unary operators, casting]

    - take a look at this given code and evaluate what the result is for each

    1)
        int a = 8;
        int b = a--; // post decrement

        what is a? //  a is 7  after the line 20
        what is b? // a's first value is assigned to b so b is 8

    2) Take the given speed variable and think about which lines would need explicit casting (manually)
      and which ones are done implicitly (automatically)

        float speed = 20.5f;

        byte num1 = speed;
        short num2 = speed;
        int num3 = speed;
        long num4 = speed;
        float num5 = speed;
        double num6 = speed;
 */