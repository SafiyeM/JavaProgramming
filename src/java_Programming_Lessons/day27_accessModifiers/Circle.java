package java_Programming_Lessons.day27_accessModifiers;

public class Circle {


    /*
     instance : multiple copies can be created for multiple objects -> called through object
     static   : there is only one copy of static method or variable -> called from class name
                                   can also be called through the object but not preferable!!!
     if a method or variable can be static, it is better to make them static : less memory allocation/usage
                                                                             : code will be more efficient
    */


    public double radius, diameter;  // instance
    public static double pi = 3.14;  // static because there is only one value and copy of Pi


    public Circle(double radius) {  // this() :  call the constructor in other constructor

        // (double radius, double diameter) user has to provide a diameter argument, if we pass diameter in constructor as an argument

        this.radius = radius;  // we need this because we have a local variable in constructor with the same name of instance variable
        diameter = radius * 2; // do not need 'this' keyword, we already declared and set. we are not calling instance variable
    }


   /* public static double calcArea(){
   return pi* radius * radius; // we can not access instance variable radius or other instance objects, if the method we declared static.
                                // as long as we need to use instance variable we created above,
                                // we need to create the method as an instance, too. NOT STATIC

    }*/

    public double calcArea() {  // instance method belongs to object member and share whatever the object has

        return pi * radius * radius;
    }


    public double calcPerimeter() {

        return diameter * pi;
    }


    public static void printPi() {    // if we make it as an instance, we have to create an object every time we want to use

        System.out.println("PI's value is: " + pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


}
/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the
			 object of circle is passed in the print statement

 */