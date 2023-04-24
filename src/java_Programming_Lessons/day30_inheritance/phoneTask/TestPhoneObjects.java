package java_Programming_Lessons.day30_inheritance.phoneTask;

public class TestPhoneObjects {


    public static void main(String[] args) {



        IPhone iphone = new IPhone("IPhone 14 Pro", "Black", "Large", 1000.5 );


        Samsung samsung = new Samsung("Galaxy S22", "White", "Medium", 1100);

        Nokia nokia = new Nokia("Brick", "Pink", "Small", 500);


        iphone.call(123456789);
        samsung.call(987654332);
        nokia.call(123445511);

        iphone.faceTime(123456789);
       // samsung.faceTime(1234567789);

        nokia.selfDefense();
        //iphone.selfDefense();

        samsung.freeze();
        //iphone.freeze();


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);










    }
}
