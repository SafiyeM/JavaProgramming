package java_programming_lessons.day28_encapsulation.encapsulation;

public class Test {


    public static void main(String[] args) {


        Student student = new Student();

       // student.age= -200; we can not access because it is private instance variable
        // therefore we have getter & setter to access private data from outside its class

        student.setAge(40);
        student.setAge(30);
        student.setAge(35);
        //student.setAge(-200); // invalid age, the program will be terminated and will not execute the other code fragments after this code
        System.out.println(student.getAge());
        // student.setAge(0);  // invalid age, the program will be terminated and will not execute the other code fragments after this code
        //System.out.println(student.getAge());
        student.setAge(24);
        System.out.println(student.getAge());
        System.out.println("Test Completed");


        student.setName("Lucy");
        System.out.println(student.getName());

        //student.setName("12Alia"); invalid name -> program gets terminated
       // System.out.println(student.getName());








    }
}
