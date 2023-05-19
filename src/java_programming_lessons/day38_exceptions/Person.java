package java_programming_lessons.day38_exceptions;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        if (!(gender == 'M' || gender == 'F')) { // if the gender is invalid
            throw new RuntimeException("Invalid gender"); // throws the runtime exception and crash/terminate the program
        }
        this.gender = gender; // we created a condition to set the gender
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age == 0) {
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) { // if the given age is invalid
            throw new RuntimeException("Invalid age: " + age); // throw runtime exception, and crash the program

            /*
                  System.err.println("Invalid age");
                  System.exit(1);
             *  Exception (throw) is used for indicating that there is an issue within the program
                but the exit method can not indicate, it just terminates the program with specific status code
     */

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
