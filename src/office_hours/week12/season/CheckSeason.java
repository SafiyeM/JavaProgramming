package office_hours.week12.season;

public class CheckSeason {


    public static void main(String[] args) {

        Summer summer = new Summer(45, 20);
        Winter winter = new Winter(17, -20);
        Fall fall = new Fall(28, 5);
        Spring spring = new Spring(20, 6);

        summer.activity();
        winter.activity();
        fall.activity();
        spring.activity();


        System.out.println(summer);
        System.out.println(winter);
        System.out.println(fall);
        System.out.println(spring);


    }



}
/*
 Create a class CheckSeason

        create an object of Winter, Summer,
         Fall and Spring and verify if the constructor, toString(),
         and activity() are working properly for each class

 */