package java_programming_lessons.day35_polymorphism.transportation;

public interface AutoPark {


    // we need interfaces for additional methods because abstract class can not provide all the methods
    // every single subclass that needs it. Abstract class provides only common methods.


    // we need to initialize here because it is final and constructor is not allowed in interface
    boolean hasAutoPark = true; // public, static, final and abstract keywords are given by default
    void autoPark();

}

/*
2. Create an interface named AutoPark

				abstract methods:
					autoPark()
 */