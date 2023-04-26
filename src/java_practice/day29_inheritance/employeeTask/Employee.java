package java_practice.day29_inheritance.employeeTask;

public class Employee {

    /*
    employeeTask:
	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 - 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement
     */


    private String name;
    private char gender;
    private int age;
    private String id, jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
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

    public char getGender() {
        return gender;
    }

    //  gender can only be 'M' or 'F'
    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.out.println("gender can only be 'M' or 'F'");
            System.exit(1);

        }

        }


    public int getAge() {
        return age;
    }

    //age can not be negative
    //age MUST be between 18 - 65
    public void setAge(int age) {
        if(age < 0){
            System.err.println("age can not be negative");
            return;
        }

        if (age < 18 || age > 65 ){
            System.out.println("age MUST be between 18 - 65");
            System.exit(1);
        }
        this.age = age;
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

    // salary can not be negative
    public void setSalary(double salary) {

        if (salary < 0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
