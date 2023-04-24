package java_Programming_Lessons.day26_statics.studentTask;

public class TestObjects {


    public static void main(String[] args) {


        Student student1 = new Student("Sara", 21, 'F', "A16");
        Student student2 = new Student("Nina", 24, 'F', "B34");
        Student student3 = new Student("Max", 22, 'M', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};
        // because we created array addStudents method, so we can add students into the group1 arraylist

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        //System.out.println(group1); //we set now only group name and id that's why we do not have any students yet

        group1.addStudent(student1);
        group1.addStudent(students); // we passed array of students object
        System.out.println(group1); // StudentsGroup{groupName='Java Turtles', groupId=1, number of students=5}


        group1.addStudent("Lina", 30, 'F', "B55");
        System.out.println(group1); //StudentsGroup{groupName='Java Turtles', groupId=1, number of students=6}


        group1.removeStudent("E27");
        group1.removeStudent("D43");
        System.out.println(group1); // 4 students left


        for (Student eachStudent : group1.students) {
            System.out.println(eachStudent.name + " : " + eachStudent.id);
        }

        System.out.println("___________________________________");

        // add students into the groups

        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);
        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);
        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);


        StudentsGroup[] groups = {group1, group2, group3, group4};

        // iterate this array that contains all the groups and display all names of the students






    }
}
/*

	3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */