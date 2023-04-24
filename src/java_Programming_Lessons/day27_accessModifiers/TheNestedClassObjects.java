package java_Programming_Lessons.day27_accessModifiers;



public class TheNestedClassObjects {


    public static void main(String[] args) {

        Car obj1 = new Car();  // Car object

        obj1.new CarEngine(); // CarEngine object -> from inner class
        Car.CarEngine obj3 = obj1.new CarEngine(); // -> to assign non-static inner class's object, reference type has to be CarEngine class in Car class

        new Car.StaticInnerClass(); // staticInner object
        Car.StaticInnerClass obj4 = new Car.StaticInnerClass(); // assign staticInner class's object

    }
}
