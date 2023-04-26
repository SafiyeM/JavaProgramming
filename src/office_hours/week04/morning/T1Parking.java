package office_hours.week04.morning;

public class T1Parking {
    public static void main(String[] args) {

 /*
    T1Parking [ternary, relational]

    create a program that will define a time variable. Use a 24-hour format.
     Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15

     */
        int time= 8; // let's assume this is always a valid time
        double fee=0.0;

        if (time >= 6 && time <=12){
            fee= 7.50;
        }else { //else if ( (time >= 13 && time <= 23) || (time >= 0 && time <= 5))
            fee= 15;
        }

        System.out.println("fee for parking is: " + fee);


        //I can use else because I am already assuming the time will only be between 0-23


        //ternary solution:

        int time2= 9;
        double fee2= (time >= 6 && time <=12) ? 7.5 : 15;


        System.out.println("fee for parking is: " + fee2);



        // other solution

        double fee3 = (time2 >= 6 && time2 <= 12) ? 7.5
                    : (time2 >= 13 && time2 <= 23) || (time2 >= 0 && time2 <= 5) ? 15
                    : -1;       // --> -1 is used often for invalid result

                     System.out.println(fee3);




    }
}
