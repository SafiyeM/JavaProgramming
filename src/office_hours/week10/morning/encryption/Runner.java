package office_hours.week10.morning.encryption;

public class Runner {

    public static void main(String[] args) {



        T2Encryption first = new T2Encryption("Hello World");
        first.modifyNum = 20;
        first.factorNum =2;
        first.encrypt();

        System.out.println(first);

        System.out.println(T2Encryption.decrypt("184 242 256 256 262 104 214 262 268 256 240", 20, 2));

        T2Encryption secret = new T2Encryption("I make cookies with more sugar", 35, 3);
        System.out.println(secret);

        String secretMsg = "324 201 432 396 426 408 201 402 438 438 426 420 408 450 201 462 420 453 417 201 432 438 447 408 201 450 456 414 396 447";

        // I am giving the wrong factor and modify numbers
        System.out.println(T2Encryption.decrypt(secretMsg, 20, 2));

        // I am giving the valid factor and modify numbers
        System.out.println(T2Encryption.decrypt(secretMsg, 35, 3));



    }
}
