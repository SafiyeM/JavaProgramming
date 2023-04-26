package java_programming_lessons.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Lena");
        names.add("Lena");
        names.add("Max");
        names.add("Valentina");
        names.add("Valentina");
        names.add("Nina");
        names.add("Nina");
        names.add("Mina");
        names.add("Nalan");
        names.add("Max");

        ArrayList<String> nonDuplicate = new ArrayList<>();

        for (String each : names) {


            if (nonDuplicate.contains(each)) {
                continue;
            }
            nonDuplicate.add(each);

        }

        names = nonDuplicate; // to make "names object" we created above referenced, we can reassign new objects' variable's names

        System.out.println(names); // [Lena, Max, Valentina, Nina, Mina, Nalan] -> we do not have duplicated names anymore


    }
}
