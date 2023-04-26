package java_programming_lessons.day27_accessModifiers;

public class TestCydeoStudentObjects {


    public static void main(String[] args) {

        System.out.println(CydeoStudent.secretCode); // from static block


        CydeoStudent student1 = new CydeoStudent("Ilaria", 29, 'F');
        CydeoStudent student2 = new CydeoStudent("Alea", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);


        // But statics we should NOT call through the object!!! Access via class name!
        System.out.println(student1.schoolName); // Cydeo School
        System.out.println(student2.schoolName); // Cydeo School


        System.out.println(student1.secretCode); // Wooden School
        System.out.println(student2.secretCode); // Wooden School


    }


}
