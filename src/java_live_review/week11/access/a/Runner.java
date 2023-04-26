package java_live_review.week11.access.a;

public class Runner {

    public static void main(String[] args) {


        /*
        make a class Runner in package access.a
		make a main method and create a Windows object.
		Check to see which variables are accessible based on their access modifier
         */


        //The Runner class is in the same package with Windows class which inherits
        // Computer class that is also in the same package

        Windows windows= new Windows();

        System.out.println(windows.os);     // -> public
        System.out.println(windows.memory); // -> protected
        System.out.println(windows.brand);   // default
        //System.out.println(windows.hasWifi); //no access -> private

        System.out.println();
        System.out.println(windows);


    }
}
