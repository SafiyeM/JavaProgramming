package java_programming_lessons.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {


    private String name; // default value null

    // we have compiler error if we apply final to instance and static variable and do not assign any value to it
    // because there is no default value for final
    private final char gender;
    private final int age;  // do NOT initialize final here because it will give only one value for all the objects
    private final LocalDate dateOfBirth;



    public static final int numberOfHead;
    // it is required to initialize STATIC FINAL variable in static block
    static {  // we set before we use, otherwise we can not use
        numberOfHead = 1;
    }


    // it is required to initialize instance FINAL in CONSTRUCTOR in order to avoid error
    // Since we can not generate Setter for final variables and if we want to give condition to set them,
    // we need to make it in Constructor

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);

        if( !(gender == 'M' || gender == 'F')){   // condition to check before setting the gender
            System.out.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;


        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        //              current year         -        birth year -> age will be set based on dateOfBirth
        // we set the age after the dateOfBirth is set.
        // if we set the dateOfBirth, we do not need to pass argument for age

    }

    // although all the instance variables with private access modifier, we can only set name variable!
    // final variables can not be set(can not be changed), however they can be READ only
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /*
    We can NOT generate SETTER for FINAL
     COMPILER ERROR -> can not assign a value to final variable 'gender'
    public void setGender(char gender){
        this.gender = gender;
    }
     */


    public void eat(){
        System.out.println(name + " is eating");
    }

    public  void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    // this method can NOT be OVERRIDDEN -> Implementation becomes unchangeable for any subclasses
    public final void breath(){
        System.out.println(name + " is breathing");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+ ": " +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth;
    }
}
/*
variables:
      name, gender, age, dateOfBirth
      numberOfHead

methods:
     eat();
     drink();
     sleep();
     breath();


 */