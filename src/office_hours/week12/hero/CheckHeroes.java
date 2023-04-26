package office_hours.week12.hero;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeroes {


    public static void main(String[] args) {


        Marvel spiderman = new Marvel("Spider Man", "Peter Parker",
                new ArrayList<>(Arrays.asList("Enhanced strength", "agility", "spider-sense")));


        //we create the list first and then pass the list as a parameter with variable name
        // This list represents Tony Stark's superpowers
        ArrayList<String> tonyPowers = new ArrayList(Arrays.asList("powered suit of armor", "flight", "enhanced strength"));
        Marvel ironman = new Marvel("Iron Man", "Tony Stark", tonyPowers);


        ArrayList<String> princessDiana = new ArrayList<>(Arrays.asList("Enhanced strength", "speed", "agility", "durability"));
        DC wonderWoman = new DC("London", "Wonder Woman", "Princess Diana", princessDiana);

        System.out.println(spiderman);
        System.out.println(ironman);
        System.out.println(wonderWoman);

        System.out.println();
        spiderman.callAvengers();
        ironman.callAvengers();

        System.out.println();
        spiderman.protect();
        ironman.protect();
        wonderWoman.protect();

        System.out.println(spiderman.getUniverse());
        System.out.println(ironman.getUniverse());
        System.out.println(wonderWoman.getUniverse());




    }
}
/*
Create a class CheckHeros
    create a main method
    create Marvel and DC objects and test the variables and methods


 data:
    spiderman, peter parker, Marvel, powers: Enhanced strength, agility, and spider-sense
    iron man, tony stark, Marvel, powers: powered suit of armor, flight, enhanced strength
    thor, thor odinson, Marvel, powers: wields hammer, controls lightning, flight
    wonder woman, diana prince, DC, powers: Enhanced strength, speed, agility, durability
    batman, bruce wayne, DC, powers: master detective, martial arts, technical tools
    superman, clark kent, DC, powers: super strength, speed, invulnerability, flight



 */