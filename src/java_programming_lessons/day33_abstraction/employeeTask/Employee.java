package java_programming_lessons.day33_abstraction.employeeTask;

public abstract class Employee {  // abstract class is meant to be a PARENT which provides
                                  // reusable variables and methods to subclasses, like a PROVIDER
                                  // we can never create an object from Employee class after we apply abstract keyword
                                  // because object is a concrete

    private String name;
    private int age;
    private char gender;
    private String id, jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // ABSTRACT method can NOT BE 'STATIC'  'FINAL'  'PRIVATE'
    // It has NOT BODY
    // Abstract method can be created only in ABSTRACT CLASS or in an INTERFACE
    public abstract void work(); // ABSTRACT METHOD (uncompleted method) child class will be responsible of completing the method

    /*
    *it is ABSTRACT method that's why we do not worry about the implementations, we leave it to subclass.
    *This method is meant to be overridden, that is why it does not have body to implement a task
    *It focuses on the essential qualities of smth. not details
  */

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
employeeTask

	Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();

    Teacher:
    	work(){ teaching }


	Developer:
		work() { coding }

	Tester:
		work(){ testing }

	Driver:
		work() { driving }

 */