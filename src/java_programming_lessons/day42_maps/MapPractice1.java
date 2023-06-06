package java_programming_lessons.day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        //            name(key)  gender(value)
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");
        // how many female & male employees in the map?
        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

          /* this approach is not the best solution, takes extra steps, we do not need to get the key

        for (String name : employeeMap.keySet()) {  // we iterate the map by the key first
            String gender = employeeMap.get(name);  // then we get the values
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */

        // instead we can only iterate the map by the values

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")){
                countFemaleEmployees ++;
            }else {
                countMaleEmployees++;
            }
        }

        System.out.println("Female Employees: " + countFemaleEmployees); // Female Employees: 8
        System.out.println("Male Employees: " + countMaleEmployees); // Male Employees: 5

        System.out.println("---------------------------------------------");
        // display the names of all the female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender =employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }

         */


        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());

                /*
                Kakalina
                Glad
                Marika
                Ddene
                Selle
                Brigitte
                Desirae
                Ajay
                 */
            }
        }


        System.out.println("---------------------------------------------");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap); // {Kakalina=Female, Glad=Female, Jereme=Male, Bertrando=Male, Winfred=Male,
        // Marika=Female, Ddene=Female, Selle=Female, Orlando=Male, Brigitte=Female, Desirae=Female, Derk=Male, Ajay=Female}









    }

}
