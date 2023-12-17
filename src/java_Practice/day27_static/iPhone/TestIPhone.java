package java_Practice.day27_static.iPhone;

import java.util.Arrays;

public class TestIPhone {
    public static void main(String[] args) {


        Iphone phone1 = new Iphone("14 Pro", "large", "black", 1000);

        System.out.println(phone1);


        phone1.faceTime(234567890);
        phone1.call(321456778);
        phone1.text(1234567890);
        phone1.printOperatingSystem();
        phone1.faceTime("...@gmail.com");

        System.out.println(Iphone.isSmartPhone);
        System.out.println(Iphone.designedIn);
        System.out.println(Iphone.brand);




        Iphone[] phone2 = {new Iphone("14 Pro Max", "large", "gray", 1500),
                           new Iphone("13 Pro ", "mini", "blue", 700)};


        System.out.println(Arrays.toString(phone2));

    }
}
