package java_Practice.day29_inheritance.carTask;

public class TestCarObjects {


    public static void main(String[] args) {


        Toyota toyota = new Toyota();
        toyota.setInfo("Toyota", "Highlander","White", 2023,58_950);
        System.out.println(toyota);

        Honda honda = new Honda();
        honda.setInfo("Honda", "Jazz", "Sand",2023, 40_000);
        System.out.println(honda);

        BMW bmw = new BMW();
        bmw.setInfo("Bmw","The XM", "Sapphire black metallic", 2023, 178_000);
        System.out.println(bmw);

        Audi audi =new Audi();
        audi.setInfo("Audi", "e-Tron GT", "Gray metallic",2023, 107_000 );
        System.out.println(audi);

        Volvo volvo = new Volvo();
        volvo.setInfo("Volvo", "C40 Recharge", "Sage green metallic", 2023, 45_000);
        System.out.println(volvo);

        Mercedes mercedes = new Mercedes();
        mercedes.setInfo("Mercedes", "EQE" , "Black", 2023, 67_000);
        System.out.println(mercedes);





    }
}
