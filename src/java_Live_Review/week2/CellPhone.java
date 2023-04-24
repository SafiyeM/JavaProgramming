package java_Live_Review.week2;

public class CellPhone {

    public static void main(String[] args) {

        String     brand= "Apple",
                   model= "IPhone X",
                   color= "Black";
        double     price= 1200.99;
        int        storage= 128;
        boolean    hasCamera= true;
        char       simType= 'A';

        String camera= "";


        if (hasCamera){
            camera = "It has a camera";
        }


        System.out.println("We have a brand new " +model+ " from " +brand+
                "\nIt comes in the color " +color+ " and has "+storage+ "GB memory" +
                "\n"+ camera + " and operates with the \"" + simType+ "\" type sim" +
                "\nGet your own " +model+ " for only $" +price );

        System.out.println("_______________________________________________________");

        System.out.println("We have a brand new " +model + " from " +brand);
        System.out.println("It comes in the color " +color+  " and has "+storage+ "GB memory");
        System.out.println("Has a camera: " + hasCamera+ " and operates with the \"" + simType+ "\" type sim" );
        System.out.println("Get your own " +model+ " for only $" +price );


        System.out.println("______________________________________________________");



        /*  // as a variable
        String ad= "We have a brand new " +model+ " from " +brand+
                "\nIt comes in the color " +color+ " and has "+storage+ "GB memory" +
                "\n"+ camera + " and operates with the \"" + simType+ "\" type sim" +
                "\nGet your own " +model+ " for only $" +price ;
                 System.out.println(ad); */





    }
}
/*

CellPhone [variables, concatenation]

	Declare and assign the following variables:
		brand, model, color, price, storage, has camera, sim type (A, B, or C)

	Print out an advertisement post about the phone in this format:
		-> For extra practice also create this advertisement in a reusable way

		ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A.
		The output would be:

		We have a brand new IPhone X from Apple
		It comes in the color Black and has 128GB memory
		It has a camera and operates with the "A" type sim
		Get your very own IPhone X for only $1200.99
 */