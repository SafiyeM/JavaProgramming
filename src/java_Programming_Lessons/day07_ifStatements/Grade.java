package java_Programming_Lessons.day07_ifStatements;

public class Grade {
    public static void main(String[] args) {

        char grade= 'A';
        String result= "";

        if (grade == 'A'){
            result= "Excellent";
        }
        if (grade == 'B'){
            result= "Excellent";
        }
        if (grade == 'C'){
            result= "Great Job";
        }
        if (grade == 'D'){
            result= "Good";
        }
        if (grade == 'F'){
            result= "Failed";
        }

        System.out.println(result);


    }
}
/*
	2. Create a class named Grade, a char variable named grade is given.
	 write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */