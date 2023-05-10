package java_live_review.week13.building;

public class BuildingUtil {

    public static double rent(Building building){

        if (building instanceof House){
           return building.price / 360 * 2;
        } else if (building instanceof OfficeBuilding) {
            return building.price / 1000;
        } // note: we didn't create the Apartment


        return -1;// if building is not a House or OfficeBuilding it returns -1
    }


    public static Building search(String location){
      if (location.equals("Great Falls")){
          return new House("Great Falls", 500_000, 4);
      } else if (location.equals("McLean")) {
          return new OfficeBuilding("McLean", 3_000_000,6);
      }
      return null;
    }




}
/*
- create a class BuildingUtil

		create a static method Rent(Building obj)
			return: double
			parameters: Building type

			implementation:
				if the Building is House type
					return price / 360 * 2

				if the Building is Apartment type
					return price / 600

				if the Building is OfficeBuilding type
					return price / 1000

		create a static method search(String location)
			return: Building
			parameters: String location

			implementation
				if the location is Great Falls return a House object with:
					location: Great Falls
					price: 500_000
					number of residents: 4

				if the location is FairFax return an Apartment object with:
					location: FairFax
					price: 750_000
					month for lease: 6

				if the location is McLean return an OfficeBuilding object with:
					location: McLean
					price: 3_000_000
					number of floors: 6

 */