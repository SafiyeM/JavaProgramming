package java_Programming_Lessons.day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {


        System.out.println(sum(20, 70));
        System.out.println(sum(40, 50, 80));

        System.out.println(sum(1.4, 5.4));
        System.out.println(sum(1.5, 1.5, 1.5));

        System.out.println(sum(10, 20.0));





    }


    public static int sum(int n1, int n2){

        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3){

       // return n1+n2+n3;
        return sum(n1,n2)+n3;



    }

    public static int sum(int n1, int n2, int n3, int n4){

      //  return n1+n2+n3+n4;
        return sum(n1, n2, n3) + n4;

    }

public static double sum(double n1, double n2){

        return n1+n2;
}

public static double sum(double n1, double n2, double n3){

        return sum(n1, n2) +n3;
}


public static double sum(double n1, double n2,double n3, double n4 ){

        return sum(n1, n2, n3) +n4;
}


}
