package java_Programming_Lessons.day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public  int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;


    // constructor
    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

      /*   schoolName = "Cydeo School";
           secretCode = "Wooden Spoon";

      We should not set those static variables in the Constructor, because if we create 100 student objects from this class,
        this code fragment will be 100 times repeated. We need only one time
       */

    }

    // static block/ static initialization block
    static { // this code gets executed one time as soon as the class is loaded, regardless of how many objects will be created.
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }





}
