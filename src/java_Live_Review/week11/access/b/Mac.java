package java_Live_Review.week11.access.b;

import java_Live_Review.week11.access.a.Computer;

public class Mac extends Computer {


    /*
	Create a class Mac in package access.b
		inherit the Computer class
		make a main method and create a Mac object.
		Check to see which variables are accessible
     */
    public static void main(String[] args) {


        Mac mac = new Mac();
        System.out.println(mac.os); // public
        System.out.println(mac.memory);  // protected
       // System.out.println(mac.brand);   // default    -> it is not inherited, because in different package
       //  System.out.println(mac.hasWifi);  // private  -> it is not inhereted, only within the class


    }


}
