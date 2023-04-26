package java_programming_lessons.day08_ternary_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        int score= 90;
        String result= " ";

        //  it is difficult to use with switch because we need to write 100 switch case

        if (score>= 90){        //false: if score is < 90
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
        System.out.println(result);

        System.out.println("_______________________________________________");

        // use 12 switch statement and add default

        int number=5;
        String month= "";

        switch (number){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            default:
                month="Invalid number";

        }

        System.out.println(month);






    }
}
