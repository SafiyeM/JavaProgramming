package java_live_review.week13.building;

import java.util.ArrayList;
import java.util.Arrays;

public class RealEstate {

    public static void main(String[] args) {


        House house1 = new House("McLean", 300_000, 4); // reference of itself

        System.out.println(house1.location);
        System.out.println(house1.price);
        System.out.println(house1.numberOfResidents);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();

        System.out.println();

        Building building1 = house1; // upcasting = automatic

                                                   // defines which implementation will be executed
        //accessibility on the reference type  <->  execution happens on the object side
        Building house2 = new House("Chicago", 250_000, 5); // reference of super class
        System.out.println(house2.location);
        System.out.println(house2.price);
        System.out.println(((House) (house2)).numberOfResidents); // Building reference doesn't have access to this variable
        System.out.println(house2);
        house2.pay();
        ((HasBackYard)(house2)).mowLawn();

        House house3 = (House)house2; // downcasting -> Building -> House

        ArrayList<Building> allBuildings = new ArrayList<>(Arrays.asList(

                house1, house2, house3,
                new OfficeBuilding("FairFax" , 10_000_000, 30),
                new OfficeBuilding("LA", 100_000_000, 4),
                new House("Maine", 80_000,2)
        ));

        for (Building each :allBuildings) {
            each.pay();
        }

        for (Building each :allBuildings) {
            System.out.println(BuildingUtil.rent(each));

        }


        System.out.println("___________________________________________");

        Building max = allBuildings.get(0);

        System.out.println(max);
        for (Building each :allBuildings) {
            if (each.price > max.price){
                max =each;
            }
        }

        System.out.println(max);
        System.out.println("___________________________________________");
        ArrayList<Building> toFilter =new ArrayList<>(allBuildings);
        toFilter.removeIf(p -> p.price >= 1_000_000);
        System.out.println(toFilter);

        System.out.println("___________________________________________");

        System.out.println(BuildingUtil.search("McLean"));


    }

}
/*
- create a class RealEstate
		create a main method

		create an ArrayList of Building
			-> this can hold objects of House, Apartment, & OfficeBuilding

		create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

		mini tasks:

			- Search for a Building in a specific location
			- Iterate through and show the rent of all the buildings
			- Find the most expensive Building, print all its information
			- Find the least expensive Building, print all its information
			- Filter all the Buildings in one location(ex search for buildings in Chicago)
			- Filter all the Buildings within a certain price range

 */