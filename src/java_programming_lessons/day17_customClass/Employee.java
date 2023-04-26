package java_programming_lessons.day17_customClass;

public class Employee {



    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

    // easiest way to generate a setInfo method  right click --> generate --> constructor --> select the instance variable
    // then delete class name & add void return method & give the method name setInfo


    //this method helps to set all the attributes of employee object
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;     // parameter name and instance variable name is the same that's why we use -> this. keyword
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    /*

    -->This is constructor-> right click --> generate --> constructor

    public Employee(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }


     */


    //shorcut --> click right --> generate --> toString()
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    // method created for actions of employees
    public void  work(){
        System.out.println(name + " is working");
    }





}



