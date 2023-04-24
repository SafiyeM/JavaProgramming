package java_Programming_Lessons.day17_customClass;

public class Dog {           // every custom class have to serve the objects

     //______________________________ Custom Class of Dog Objects__________________________//

    // instance objects
    public String name;        //--> Instance variable, NOT static!
    public String breed;     //since it is instance, we can create many names for those objects and set them separately
    public String size;
    public String color;
    public char gender;
    public int age;


                           //local variable name
    public void setInfo(String name, String breed, String size, String color, char gender,int age){

        //on the right sight of the operand = name, breed, ... are arguments
        // on the left side of the operand = name,...  are our instance objects(so we set the argument in to the object)
        this.name= name;    // this keyword is used for calling the instance variable name
        this.breed= breed;   // we are getting all data through the arguments of our method
        this.size= size;
        this.color= color;
        this.gender= gender;
        this.age= age;

        // this is reference class of obj.

        // This method can help us all the info of the dog at once


    }



    // instance methods
    public void eat(){   // only one object to perform this action - for each object it has separate copy
        System.out.println(name + " is eating dog food");

    }

    public void drink(){


        System.out.println(name + " is drinking water");
    }

    // Every Custom Class needs toString to avoid getting hash-code when we print class objects
    // to generate custom method: click right -> click generate -> click toString() and select the objects you want to generate

    public String toString() {  // we generate toString Object in custom class in order to print the objects we created in other class
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
