package java_programming_lessons.day25_constructor;

public class ConstructorsIntro {


    public ConstructorsIntro(int a) {       // first constructor

        System.out.println("Object is created by using int argument");
    }


    // we can not pass int parameters with second constructor below
    //because in one class we can not have multiple same methods with the same parameters
    public ConstructorsIntro() {              // second constructor

        System.out.println("Object is created by using no argument constructor");
    }

    public  void ConstructorsInfo(){

        System.out.println("deneme");
    }


    /*
    Each time when the object is created, Constructor gets executed separately for each object
     because each object has a different memory. The memory allocation for each object is different.

     Constructor only gets executed, when we create an object!!!
     */
    public static void main(String[] args) {



        ConstructorsIntro obj1 = new ConstructorsIntro(12); // object created by using the constructor with int argument
        ConstructorsIntro obj2 = new ConstructorsIntro();      // object created by using the default constructor

        //ConstructorsIntro obj3 = new ConstructorsIntro("Java"); // object created by using the constructor with String argument
        // compiler error because the constructor with String arg does not exist in this class

        //There are 2 different objects, and they get executed 2 times -> the same reason - because each object has a different memory


    }


}
