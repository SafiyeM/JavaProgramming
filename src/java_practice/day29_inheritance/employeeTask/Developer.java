package java_practice.day29_inheritance.employeeTask;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private String programmingLanguage;


    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary, String programmingLanguage) {
        setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> list = new ArrayList<>(List.of("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (list.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        }else{
            System.err.println(programmingLanguage +" = This programming language is invalid");

        }

        }


    public void coding() {

        System.out.println( getJobTitle() + " " + getName() + " is coding in  " + programmingLanguage);
    }

    }

/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement

 */