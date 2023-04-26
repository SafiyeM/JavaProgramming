package java_practice.day27_static.cydeoStudents;

public class TestCydeoStudent {
    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Leila","SDET", 'F', 35, 9087, 12);
        CydeoStudent student2 = new CydeoStudent("Nergis", "Java Developer", 'F', 29, 2345, 7);

        student1.attendClass();
        student1.study();
        System.out.println(CydeoStudent.programmingLanguage);
        CydeoStudent.printSecretCode();
        CydeoStudent.printSchoolName();


        student2.attendClass();
        student2.study();


        System.out.println(student1);
        System.out.println(student2);

    }
}
