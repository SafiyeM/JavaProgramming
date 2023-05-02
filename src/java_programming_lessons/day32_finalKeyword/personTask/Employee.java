package java_programming_lessons.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person {


    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
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


    public void work(){
        System.out.println(getName() + " is working");
    }

/* It is not allowed to override because breath method in parent class final
    public void breath(){

    }
 */

    @Override
    public String toString() {
        return getClass().getSimpleName()+ ": " +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary ;
    }
}
