package java_programming_lessons.day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {



         /*
         we want Dog() object to store into dog1 variable , so we use Dog data type
          */

        Dog dog1 = new Dog(); // Class Name - Object Name - Keyword - Constructor

        dog1.name= "Max";
        dog1.breed= "Husky";
        dog1.gender= 'M';
        dog1.age= 4;
        dog1.size= "Large";
        dog1.color= "Gray";


        dog1.eat();
        dog1.drink();

        System.out.println(dog1); // The objects come from the custom class Dog


        Dog dog2= new Dog();

        dog2.name= "Bella";
        dog2.breed= "Golden Retriever";
        dog2.gender= 'F';
        dog2.age= 2;
        dog2.size= "Small";
        dog2.color= "Gold";

        dog2.eat();
        dog2.drink();


        System.out.println(dog2);

        /*
         For dog3 object we use setInfo Method in order
         not to set all objects one by one as the objects above.
         So All the arguments are all set at once in a method.

      */
        Dog dog3 = new Dog();

        dog3.setInfo("Loki", "Husky", "middle", "white", 'F', 3);

         dog3.eat();
         dog3.drink();
        System.out.println(dog3);


        Dog dog4= new Dog();

        dog4.setInfo("Rhodos", "Bulldog", "small", "black", 'M', 3  );

      dog4.eat();
      dog4.drink();





    }

}
