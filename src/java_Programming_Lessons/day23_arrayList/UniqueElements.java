package java_Programming_Lessons.day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {



        ArrayList<String> names = new ArrayList<>();

        names.add("Lena");
        names.add("Lena");
        names.add("Max");
        names.add("Valentina");
        names.add("Valentina");
        names.add("Gretcher");
        names.add("Nina");
        names.add("Nina");
        names.add("Mina");
        names.add("Nalan");
        names.add("Max");

        for (String each : names) {

            if (names.indexOf(each) == names.lastIndexOf(each)){ // if the first occurrence is the last occurrence at the same time-> means unique
                System.out.println(each);
                // break; -> use break if you want to find only first appeared unique name from the list
            }
        }



    }
}
