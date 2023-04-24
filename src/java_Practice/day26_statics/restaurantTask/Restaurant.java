package java_Practice.day26_statics.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers; //= new ArrayList<>(); // we can initialize also here but not preferred
    public ArrayList<Chef> chefs;     // by default this is null



    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();          // or initialize in constructor
        chefs = new ArrayList<>();             // this is now an empty list

    }

    // accepts a server object and adds it to the Servers ArrayList
    public void hireServer(Server server){

        servers.add(server);
    }

    //accepts an array of Server objects and adds all of them to the Servers ArrayList
    public void hireServer(Server[] servers){

        this.servers.addAll( Arrays.asList(servers));
        /*
        Since the parameter name "chefs" is the same as the instance attribute name "chefs",
         it is necessary to use the "this" keyword to specify that we want to add the elements
         to the instance attribute and not to the parameter.
         */
    }

    // accepts a chef object and adds it to the Chefs ArrayList
    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    // accepts an array of Chef objects and adds all of them to the Chef ArrayList
    public void hireChef(Chef[] chefs){

        this.chefs.addAll(Arrays.asList(chefs));
    }

    //  removes the chef with the matching ID from the arraylist of chef
    public void terminateChef(int employeeID){

        chefs.removeIf(p-> p.employeeID == employeeID);
    }

    //removes the server with the matching ID from the arraylist of server
    public void terminateServer(int employeeID){

        servers.removeIf(p-> p.employeeID == employeeID);
    }



    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfServers=" + servers.size() +
                ", numberOfChefs=" + chefs.size() +
                '}';
    }
}
/*
4.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object.
	                 No need to print the whole list of Servers or Chefs.
	                 Print the number of Servers and Chefs alongside the other information


 */