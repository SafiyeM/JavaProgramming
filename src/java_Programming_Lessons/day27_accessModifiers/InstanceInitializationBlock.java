package java_Programming_Lessons.day27_accessModifiers;

public class InstanceInitializationBlock {


    public String name;
    public int age;

 /*   {
 // we can still initialize instance variables, but we can not store different names and age, etc.
     therefore constructor is better choice to set different values separately for instance variables
     Only default values can be set to the name and age

        name = "James";
        age = 20;
    }
  */
    // Constructor
    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


      /*  InstanceInitializationBlock obj1= new InstanceInitializationBlock();
          InstanceInitializationBlock obj2= new InstanceInitializationBlock();

        System.out.println(obj1); -> with instance block initialization, it prints default value for every obj -> James , 20
        System.out.println(obj2); -> James , 20
       */


        // for initializing those instance variable, we set constructor, so that we can pass different argument for each object
        InstanceInitializationBlock obj1= new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj1.name); //-> James
        System.out.println(obj2.name); //-> Aaron


    }







}
