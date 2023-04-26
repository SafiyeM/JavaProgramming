package office_hours.week12.hero;

import java.util.ArrayList;

public class DC extends SuperHero {


    String city;

    public DC(String city, String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
        this.city = city;
    }


    @Override
    public void protect() {
        super.protect();
        System.out.println("with honour");
    }
}
/*
 Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

 */