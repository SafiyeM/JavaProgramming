package java_Programming_Lessons.day26_statics.studentTask;

public class Student {

    // Attributes:
    public String name;
    public int age;
    public char gender;
    public String id;


    //Constructor:
    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;

        //if we do not use 'this.' keyword, it will not call instance variable
        // instead it calls the same local variable in parameters
    }


    public void study() {

        System.out.println(name + "is studying");

        // this.name -> we do not need here to use 'this.' keyword
        //  because we do not have local variables
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
/*
Warmup tasks:
	1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */