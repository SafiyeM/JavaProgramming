package office_Hours.week08;

import java.util.Arrays;

public class T2BeginningEnd {
    public static void main(String[] args) {

   String[] names=  {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
   String same= "";

       for (String each : names) {
            if (each.endsWith(each.substring(0,1).toLowerCase())){
                same += each + "<>";
            }
        }

        if(same.isEmpty()){
            System.out.println("No names found");
            return;
        }

        String[] sameArr = same.split("<>");

        System.out.println("Count: " + sameArr.length);
        System.out.println("Names: " + Arrays.toString(sameArr));





         /* int count = 0;
        for (String name : names) {
            name = name.toLowerCase();
            if (name.charAt(0) == name.charAt(name.length() - 1)) {
                count++;
            }
        }

        System.out.println(count);
         */


    }
}
/*
T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values.
     Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array

 */