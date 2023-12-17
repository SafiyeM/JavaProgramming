package java_Practice.day26_statics.cydeoStudentTask;

import java_Practice.day26_statics.cydeoStudentTask.CydeoStudent;

public class TestCydeoStudent {
    public static void main(String[] args) {




        CydeoStudent student1 = new CydeoStudent("Mehmet", 39, 'M', "12A", 'A', 16, 3);

        CydeoStudent student2 = new CydeoStudent("Hamide", 29, 'F', "12B", 'A', 29, 4);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();

    }
}
