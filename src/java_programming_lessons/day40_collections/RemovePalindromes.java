package java_programming_lessons.day40_collections;

import java_programming_lessons.utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {


    public static void main(String[] args) {

        // Palindrome with Iterator
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic","nalan", "radar", "kayak", "reviver", "racecar", "madam")
        );

         Iterator<String> it = names.iterator();

         while (it.hasNext()){
           String each = it.next();
           
           String reverse = "";

             for (int i = each.length()-1; i >= 0; i--) {
                 reverse += each.charAt(i);
             }

             if (each.equalsIgnoreCase(reverse)){
                // names.remove(each);  -> we do not call remove() from the collection in the loop
              it.remove();               // call remove() from the iterator
             }
         }

        System.out.println(names); // [Java, Python, Cydeo, Car]


        System.out.println("________________________________________________");

        // Palindrome with removeIf() method

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
        //if the reverse version of the String equals to the original String
        //  names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );

        System.out.println(names2); // [Java, Python, Cydeo, Car]





    }
}
