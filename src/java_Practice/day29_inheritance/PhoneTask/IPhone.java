package java_Practice.day29_inheritance.PhoneTask;

public class IPhone extends Phone{

    public void faceTime(long phoneNumber){

        System.out.println(getBrand()+ getModel() + " is face-timing with " + phoneNumber);
    }

    public void faceTime(String email){

        System.out.println(getBrand() + getModel() + " is face-timing with " + email);
    }



}
/*
1. Create a named IPhone:

				Methods:
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

 */