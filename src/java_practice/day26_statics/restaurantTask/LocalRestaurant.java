package java_practice.day26_statics.restaurantTask;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        //Make a Restaurant object
       Restaurant restaurantA = new Restaurant("Max Sample", "LA", 4);


       // Create an array of servers with their information set.
       Server[] servers ={
                           new Server("Max K.", 34,17.0, true, LocalDate.of(2022,10,1)),
                           new Server("Andrea M.", 23, 20.0, true, LocalDate.of(2022, 9, 1) ),
                           new Server("Thomas S.", 55, 12.0, false, LocalDate.of(2023, 2,2)),
                           new Server("Elizabeth A.", 28, 14, false, LocalDate.of(2023, 3,3)) };


       //Create an array of chefs with their information set.
       Chef[] chefs ={
                      new Chef("Martin K.", 123, 25.0, true),
                      new Chef("Maria H.", 124, 20.0, false),
                      new Chef("Claudia G." , 111, 25.0, true) };

       //Add those initial servers to the ArrayList of Servers in the Restaurant object
       restaurantA.hireServer(servers);

       // Add those initial chefs to the ArrayList of Chefs in the Restaurant object
       restaurantA.hireChef(chefs);

       // Print your whole restaurants information
        System.out.println(restaurantA);

        // Restaurant{owner='Max Sample', location='LA', numberOfStars=4, numberOfServers=4, numberOfChefs=3}



        restaurantA.terminateChef(111);
        System.out.println(restaurantA);  // numberOfChefs = 2 now


        restaurantA.hireChef(new Chef("Maria", 112,20,false));
        System.out.println(restaurantA); // numberOfChefs = 3  again

    }


}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */