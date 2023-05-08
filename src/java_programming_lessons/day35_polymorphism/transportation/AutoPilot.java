package java_programming_lessons.day35_polymorphism.transportation;

public interface AutoPilot extends AutoPark {

    void autoPilot();


    //AutoPilot does not need to implement AutoParks abstract methods


}
/*
3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()
 */