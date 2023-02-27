package day08_ternary_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        int score= 50;
        String result= " ";

        //  it is difficult to use with switch because we need to write 100 switch case

        if (score>= 90){         //false: if score is < 90
            result +="A";
        } else if (score>=80) { //false: if score is < 80
            result += "B";
        } else if (score >=70) { // false: if score is < 70
            result += "C";
        } else if (score>=60) { // false: score is <60
            result +="D";
        }else { // true if score is < 60
            result +="F";
        }

        System.out.println("_______________________________________________");

        // use 12 switch statement and add default

        int number=14;
        String month= "";






    }
}
