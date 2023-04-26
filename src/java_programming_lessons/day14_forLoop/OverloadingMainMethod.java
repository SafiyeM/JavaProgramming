package java_programming_lessons.day14_forLoop;

public class OverloadingMainMethod {
    public static void main(String[] args) {

        System.out.println('A');

        // Main method can be overloaded but main method is not supposed to be overloaded
        //because other overloaded main methods can not run or execute java files. There is no point to overload!




    }

    public static void main(int[] args){

        System.out.println('B');

    }

    public static void main(double[] args){

        System.out.println('C');

    }

    public static void main(boolean[] args){

        System.out.println('D');


    }



}
