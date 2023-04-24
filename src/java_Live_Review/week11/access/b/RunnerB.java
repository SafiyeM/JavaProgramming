package java_Live_Review.week11.access.b;

public class RunnerB {

    /*
    Create a RunnerB in package access.b
		make a main method and create a Mac object.
		 Check to see which variables are accessible
     */


    //The RunnerB class is located in the same package as the Mac class,
    // which inherits from the Computer class that is located in a different package.
    public static void main(String[] args) {
        Mac mac = new Mac();
        System.out.println(mac.os); // public
       // System.out.println(mac.memory);  // protected is inherited in subclass
        // System.out.println(mac.brand);   // default    -> it is not inherited, because in different package
        //  System.out.println(mac.hasWifi);  // private
        // Mac object does not have any access of instance variables from Computer class

    }



}
