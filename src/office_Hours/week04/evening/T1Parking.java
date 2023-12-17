package office_Hours.week04.evening;

public class T1Parking {
    public static void main(String[] args) {


        byte time=24;
        double fee=0.0;
        //constraint time should be 0-23

        if (time>=0 && time<=23) {

            // If the time is between 6-12:
            if (time>=6 && time<=12){
                //we will do actions
                fee=7.5;
            } else {
                //we will do some actions

                fee=15;

            }    //else  the other conditions

        }else {
            System.out.println(time + " is not correct");
        }
        System.out.println("fee = " + fee);








    }
}
