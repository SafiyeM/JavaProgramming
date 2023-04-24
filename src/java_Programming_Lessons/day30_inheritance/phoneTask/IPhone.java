package java_Programming_Lessons.day30_inheritance.phoneTask;

public class IPhone extends Phone { // Iphone is child of Phone Class -> Iphone is APhone

    /*
    to call the parent class' constructor
    -> define a constructor (only a constructor can call another constructor, other methods can not call it.
    And we have to have a constructor in subclass/child class to call parent's constructor)

   This is a calling default constructor of parent class
   public IPhone(){
   super();
   }
     */


    // Constructor of Parent Class // we do not use this. keyword, instead we use 'super' keyword
    public IPhone(String model, String color, String size, double price) {
        super("Apple", model, color, size, price); // we assigned/set brand argument here, because we already know the brand
                                                         // so we must give only the other args everytime we create an obj
    }


    // static attribute
    public static boolean hasApplePay = true;


    //Methods
    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);  // we call getModel() method,
                                          // because instance variable model has private access modifier in parent class


        /*
        we made this method instance because we have an instance variable.
        Static can not accept instances
         */
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with "+ email);

    }



}
/*
2.1 Iphone:
				   	Extra methods:
						faceTime(phoneNumber)
						faceTime(email)
 */