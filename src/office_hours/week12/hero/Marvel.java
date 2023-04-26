package office_hours.week12.hero;

import java.util.ArrayList;

public class Marvel extends SuperHero {

    public Marvel(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    public void callAvengers() {

        System.out.println("calling all Avengers");
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println("by any means necessary");
    }
}
/*
Create a class Marvel
        inherits SuperHero
        make Marvel

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "Marvel"

        create a method callAvengers()
            print: Calling all avengers

        override the protect method()
            print: super_hero protecting by any means necessary

 */