package java_practice.day05_replit;

public class Test_Study {
    public static void main(String[] args) {

        int score = 0;

        if (score == 0) ;
        {
            score += 50;
        }
        if (score != 0) {
            score += 50;
        }
        System.out.println(score);

        Boolean A = true, B = false;

        if (B) {
            System.out.println("B");

        } else if (A) {
            System.out.println("You failed");
        } else {
            System.out.println("C");
        }

        int num = 10;
        if (--num == 10) {  // num is now 9
            System.out.println("hello Cydeo " + num);
        } else {
            System.out.println("hello World " + num);
        }

        char grade = 'A';
        boolean Passed = grade == 'A' || grade == 'B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if (Passed || Passed2) {
            System.out.println("You have passed");
        } else {
            System.out.println("You failed");
        }


    }
}