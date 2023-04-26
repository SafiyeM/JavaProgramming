package java_programming_lessons.day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {   // StudentsGroup Has A Student  -> it means when one class's(Student) instance
                               // being used in another class's(StudentsGroup) instance is known as 'Has Relationship'


    //Attributes -> Instance variables
    public String groupName;
    public int groupId;
    public ArrayList<Student> students;

    //Constructor
    public StudentsGroup(String groupName, int groupId) {  // do not add ArrayList as an argument, it would be challenging for the user
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();

        //in order to use this students object later, we set the size at least : 0,
        // that's why we need to instantiate student's ArrayList here or in attributes part.
        // Everytime when we create an object from this class(StudentsGroup),
        // separate copy of this instance variable will be created at the same time
    }


    // instance return type not static
    // because each object they have their own addStudent method
    public void addStudent(Student student){
        students.add(student);
        //this method takes one student object, and adds it to the arraylist of students
    }


    // overloaded addStudent method with different parameters
    public void addStudent(String name, int age, char gender, String id){

      //  Student student = new Student(name, age, gender, id); or like below
        students.add(new Student(name, age, gender, id));

        // this method takes name, age, gender, id of student info
        // and creates student object by using the given info in parameters
        //then adds the student object to the arraylist student
    }


    public void addStudent(Student[] students){
    this.students.addAll(Arrays.asList(students)); //use 'this.' because we want to call arraylist students instance variable
                                                   // in order to add the array to the list we call addAll method
        // addAll only accepts Collection type, that's why we call asList method and add students array into the list
    }



    public void removeStudent(String id){

        students.removeIf(p -> p.id.equals(id)); // if the students id is equal to this given id, remove the student from the list

        // this method takes the id and then removes the student object with specified id from the arraylist of students
    }


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", ggroupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }


}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed
	                 in the print statement

 */