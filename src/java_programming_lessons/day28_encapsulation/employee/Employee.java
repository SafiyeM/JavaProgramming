package java_programming_lessons.day28_encapsulation.employee;

public class Employee {

    private String name;

    private int age;

    private String jobTitle;

    private double salary;

    // Constructor
    public Employee(String name, int age, String jobTitle, double salary) {

        setName(name); // we call the setter to set the variables
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
        // this.salary = salary; it assigns the arg. to the instance variable,
        // but before assigning this, we have some conditions to check, which are given in the setter.
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {


        if (age < 16){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title of hte employee can not be empty or blank");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public String getName() {
        if(name == null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not empty or blank");
            System.exit(1);
        }


        this.name = name;
    }

    public double getSalary() { // getter-> READ-> no parameter -> just for READING the data/value
        return salary;
    }

    public void setSalary(double salary) {  // setter-> WRITE-> has to pass one argument in order to update the instance variable (i.e. salary)
        // we need to give new value as an argument and assigned to the instance variable

        if (salary < 0) {
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }

        this.salary = salary;

    }



    public String toString() {
        return "Employee: " +
                "name= '" + getName()+ '\'' +
                ", age= " + getAge() +
                ", jobTitle= '" + getJobTitle()+ '\'' +
                ", salary= " + getSalary() ;
    }
}
