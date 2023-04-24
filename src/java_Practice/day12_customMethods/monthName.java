package java_Practice.day12_customMethods;

public class monthName {
    public static void main(String[] args) {
        /*

        3. Create a method named monthName that can display the name of the month based on
        the given number to the method, if the number is invalid, then the method should
        print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
         */

        monthName(6);






    } // main method ending

    public static void monthName(int num) {

        String monthName= "";

        if (num > 1 || num < 12) {

            switch (num){
                case 1:
                    monthName= "January";
                    break;
                case 2:
                    monthName= "February";
                    break;
                case 3:
                    monthName= "March";
                    break;
                case 4:
                    monthName= "April";
                    break;
                case 5:
                    monthName= "May";
                    break;
                case 6:
                    monthName= "June";
                    break;
                case 7:
                    monthName= "July";
                    break;
                case 8:
                    monthName= "August";
                    break;
                case 9:
                    monthName= "September";
                    break;
                case 10:
                    monthName= "October";
                    break;
                case 11:
                    monthName= "November";
                    break;
                case 12:
                    monthName= "December";
                    break;
            }

        } else {
            System.err.println("Invalid Number");
        }

        System.out.println(monthName);

    } // monthName Method beginning




}
