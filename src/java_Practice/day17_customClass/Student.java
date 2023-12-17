package java_Practice.day17_customClass;

public class Student {


    // Attributes
    public String name;
    public char gender;
    public int age;
    public String studentID;
    public char grade;
    public boolean isFullTime;



    //Actions

    public void setInfo(String name, char gender, int age, String studentID, char grade, boolean isFullTime){

        this.name= name;
        this.gender= gender;
        this.age= age;
        this.studentID=studentID;
        this.grade=grade;
        this.isFullTime=isFullTime;





    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }



    public void study(){


        System.out.println( name + " is studying ");
    }


    public void code(){

        System.out.println(name + " is coding");
    }


    public void sleep(){

        System.out.println(name + " is sleeping");
    }


    public static void main(String[] args) {


        Student student1= new Student();
        student1.setInfo("Safiye M.", 'F', 40, "A467", 'A', true);


        Student student2= new Student();
        student2.setInfo("Hamide P.", 'F', 33, "B345", 'A', true);


        System.out.println(student1);
        student1.study();
        student1.code();
        student1.sleep();


        System.out.println(student2);
        student2.study();
        student2.code();
        student2.sleep();









    }


}
/*
2. Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */