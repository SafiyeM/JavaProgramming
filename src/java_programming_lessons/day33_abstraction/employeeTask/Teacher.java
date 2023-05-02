package java_programming_lessons.day33_abstraction.employeeTask;

public class Teacher extends Employee {



    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }




    // method overriding with abstract method
    // access modifier has to be same or more visible
    // we do not add abstract keyword because we need to have a body to apply implementation in its body, otherwise we can not.
    // Parent's classes abstract method is a MUST for subclass(non-abstract) to override in order to avoid COMPILE ERROR
    public void work() {
        System.out.println(getName() + " is teaching");
    }

}
