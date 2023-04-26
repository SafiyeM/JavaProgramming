package java_practice.day29_inheritance.employeeTask;

public class Driver extends Employee{



    public void driver(){

        System.out.println(getName() + " is driving");
    }

}
/*
4. Create a custom Class named Driver
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				driving()
				toString(): prints driver object info when the object is passed in the print statement
 */