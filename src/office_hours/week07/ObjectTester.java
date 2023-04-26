package office_hours.week07;

public class ObjectTester {


    public static void main(String[] args) {



        Recipe salmon = new Recipe();
        salmon.setInfo("Salmon", "Salmon, Lemons, Salt", 2, 19.99);

        System.out.println(salmon);
        System.out.println(salmon.costPerPerson());

        Recipe eggs = new Recipe();
        eggs.setInfo("Fired Egg", "Eggs, oil, salt, pepper", 4, 34.80);
        System.out.println(eggs);
        System.out.println(eggs.costPerPerson());


        System.out.println("__________________________________________________");



        SportsTeam bulls= new SportsTeam();
        bulls.setInfo("chicago Bulls", 25, "Billy Donovan", "15:10", "UK", 10000000);

        System.out.println(bulls);



        SportsTeam united = new SportsTeam();
        united.setInfo("Manchester United", 25, "Eric Ten Hag", "20:10", "UK", 10000000);

        System.out.println(united);

        for(int i = 0; i < 10; i++){
            united.joinFanClup();
        }

        System.out.println(united);


    }
}
