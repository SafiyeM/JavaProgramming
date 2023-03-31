package java_Programming_Lessons.day10_string;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {


        /*
        Warmup Task
        	2. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name ( nextLine() )
	        2.2 Enter your age ( nextByte())
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name ( nextLine() )
	        2.5 Enter your job title ( nextLine() )
	        2.6 Enter your salary (nextDouble() )

	        Display:
	            Employee's name
	            Employee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your age:");
        byte age= scan.nextByte();

        System.out.println("Enter your gender (f or m):");
        char gender= scan.next().charAt(0);

        scan.nextLine();

        System.out.println("Enter your company name:");
        String companyName= scan.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle= scan.nextLine();

        System.out.println("Enter your salary:");
        double salary= scan.nextDouble();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = $" + salary);







    }
}
