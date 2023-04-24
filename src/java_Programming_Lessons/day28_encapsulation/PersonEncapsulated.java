package java_Programming_Lessons.day28_encapsulation;

import java.time.LocalDate;


public class PersonEncapsulated {


    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public PersonEncapsulated(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }
    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be null/empty/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }
    public void setAge(int age) {
        if (age <0 || age > 120){
            System.err.println("Age can not be less than zero or greater than 120");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {

        return gender;
    }
    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender");
        }

    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {

        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println(" Date of Birth can not be after today's date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


    /*
    Variables:
    name, age, gender, dateOfBirth

    name:
         Write: can not be null/empty/blank
         REad: if name is not, return "Unknown" instead

     age:
         Write: age can not be less than zero or greater than 120

     gender:
         Write: gender can only be 'M' or 'F'

      dateOfBirth:
         Write: can not be after today's date

         Add constructor that can set all the fields

         AddtoString()


     */
}
