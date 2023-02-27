package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {


        // __________________________Ternary else if _________________________//

        /*
        String result= "";
        if(number>0){
            result="Positive";
        }else if (number<0){
            result="Negative";
        }else {
            result="Zero";
        }
         */

        int number= 100;

       String result= (number>0) ? "positive" :(number<0) ? "negative" : "zero";
        System.out.println(result);


        System.out.println("____________________________________________________");


        /*

        int number=2;
        String day="";

        if (number==1){
            day= "Monday";
        } else if (number==2) {
            day= "Tuesday";
        } else if (number==3) {
            day= "Wednesday";
        }else if (number==4) {
            day= "Thursday";
        }else if (number==5) {
            day= "Friday";
        }else if (number==6) {
            day= "Saturday";
        }else {
            day= "Sunday";
        }

         */


        int n=7;

        String day= (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday"
                   :(n==4)? "Thursday" :(n==5)? "Friday" :(n==6)? "Saturday" :"Sunday";
        System.out.println(day);


        System.out.println("____________________________________________");

       /* int number= 5;
        String month="";


        if (number == 1){
            month="January";
        } else if (number==2) {
            month="February";
        }else if (number==3) {
            month="March";
        }else if (number==4) {
            month="April";
        }else if (number==5) {
            month="May";
        }else if (number==6) {
            month="June";
        }else if (number==7) {
            month="July";
        }else if (number==8) {
            month="August";
        }else if (number==9) {
            month="September";
        }else if (number==10) {
            month="October";
        }else if (number== 11){
            month="November";
        }else {
            month="December";
        }

        */

        int number2= 10;


        String month= (number2==1)? "January" :(number2==2)? "February" :(number2==3)? "March"
                     :(number2==4)? "April"   :(number2==5)? "May"      :(number2==6)? "June"
                     :(number2==7)? "July"    :(number2==8)? "August"   :(number2==9)? "September"
                     :(number2==10)? "October":(number2==11)? "November" :"December";

        System.out.println(month);
























    }

}

