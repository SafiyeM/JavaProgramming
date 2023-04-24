package java_Programming_Lessons.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Emily", 'F', LocalDate.of(1989,2,25));
        people[1].setInfo("Ina", 'F', LocalDate.of(1951,4,4));
        people[2].setInfo("Lina", 'F', LocalDate.of(1878, 11, 23));
        people[3].setInfo("Henry", 'M', LocalDate.of(1973, 9,10));
        people[4].setInfo("Noah", 'M', LocalDate.of(1980, 6,3));




        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        // remove all the person object that has the age > 55
        studentsList.removeIf(p-> p.age > 55);
        System.out.println(studentsList);

        //print name & date of birth of each person object

        for (Person person : studentsList) {
            System.out.println(person.getName() + " - " + person.getBirthDate());
        }















    }
}
