package java_Live_Review.week11.access.a;

public class Windows extends Computer{

    /*
    Create a class Windows in package access.a
	inherit the Computer class
	make a main method and create a Windows object.
	Check to see which variables are accessible
     */

                 // Access in the same package
    public static void main(String[] args) {


        Windows windows= new Windows();
        System.out.println(windows.os);     // -> public               -> null
        System.out.println(windows.memory); // -> protected            -> 0
        System.out.println(windows.brand);   // default                -> null
        // System.out.println(windows.hasWifi); no access -> private

        System.out.println();
        System.out.println(windows); // Computer{os='null', memory=0, brand='null', hasWifi=false}
        // we are calling toString- So the method is using hasWifi . we still do not have access to it




    }


}
