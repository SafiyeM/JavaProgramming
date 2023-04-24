package java_Programming_Lessons.day31_inheritance.animal_methodOverriding;

public class Cat extends Animal{



    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }



    // OVERRIDING METHOD
    // * which implementation gets executed depends on from which object we are calling the method
    // * if we call this eat method() from cat object, it is going to execute cats implementation
    // * to understand if it is overridden method we write: ->  @Override

    // * the method we want to override can NOT be private, static and final
    // * access modifiers, return type and method name has to be the same



    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");

        // * super.eat(); ->parents class' eat() methods' calling
        //  but we do not need the same implementation here. We create our own implementation above
    }


   // @Override // * this is optional to write
    public void sleep() {
        System.out.println("Cat "+ getName() + " sleeps 18 hours in a day");
    }


    public void scratch(){
        System.out.println("Cat "+ getName()+ " is scratching");
    }



}
