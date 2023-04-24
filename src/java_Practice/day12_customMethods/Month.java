package java_Practice.day12_customMethods;

public class Month {
    public static void main(String[] args) {


        /*
        5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days



         */
        month("June");




    }

public static void month(String month){



            switch (month){

                case "Monday":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    System.out.println(month + " has 31 Days");
                    break;

                case "April":
                case "June":
                case "September":
                case "November":
                    System.out.println(month + " has 30 Days");
                    break;

                case "February":
                    System.out.println(month + " has 28 Days");
                    break;
                default:
                    System.err.println(month + " is invalid data");
        }





}



}
