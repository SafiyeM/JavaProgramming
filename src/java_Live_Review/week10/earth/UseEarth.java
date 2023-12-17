package java_Live_Review.week10.earth;

import java.util.Arrays;

public class UseEarth {


    public static void main(String[] args) {



        //Earth.northAmerica -> how to access the ArrayList
        Earth.northAmerica.add(new Person("James", 30));
        Earth.northAmerica.addAll(Arrays.asList(
                new Person("Anna", 20),
                new Person("Jane", 24)
        ));



    }
}
