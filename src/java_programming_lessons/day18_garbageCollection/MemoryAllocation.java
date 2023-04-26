package java_programming_lessons.day18_garbageCollection;


import java_programming_lessons.day17_customClass.Employee;

class Car{ // second class -> no memory is allocated for a class


    public String brand;
    public String model;
    public String color;

    // if we have one public class in a class, second is without public access modifier
    // ->always create separate custom class

}




public class MemoryAllocation { //first class -> no memory is allocated for a class
                                // public class must match with our file name (i.e. MemoryAllocation)



    // allocated in stack
    public static void main(String[] args) {

        int a= 100; // -> local variable -> in stack memory

        Car car= new Car();   // car is reference variable of Car object-> allocated in stack
        // stack     heap        // new object in heap memory


        System.out.println("_________________________________");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;


    }

    // allocated in stack
    public static void method1(){
        int b= 200; // -> stack

    }


    // allocated in stack
    public static void method2(){

        String c = "Hello World";                  //  "Hello World"-> literal obj. -> in heap memory and inside String pool
        //  c->stack    heap(String pool)          // c -> local variable -> allocated in stack memory

        String d = new String("Hello World");  // "Hello World" String literal -> String pool
        //   d->stack            new String  -> heap (outside the pool)


    }


}
