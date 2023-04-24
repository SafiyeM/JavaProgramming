package java_Programming_Lessons.day31_inheritance;


class A{

    public  int a = 100;

    // parent class hide its variable and will not get executed because child class has also variable with the same name
    // child class will not inherit this variable
}


public class FieldHiding extends A{

    public int a = 300;


    public static void main(String[] args) {

        System.out.println(new FieldHiding().a); // 300



    }
}
