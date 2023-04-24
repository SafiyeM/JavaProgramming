package java_Programming_Lessons.day29_inheritance.encapsulation;

public class TestStudentObject {

    public static void main(String[] args) {


        Student student1 = new Student("Leila", 35,'F','A',"MIT");

        System.out.println(student1);

        // student1.schoolName ="Harvard"; private access modifier, we need setter -> setSchoolName
        student1.setSchoolName("Harvard");
        System.out.println(student1.getSchoolName());  // read data with getter

        student1.setGrade('B');
        System.out.println(student1);






    }
}
