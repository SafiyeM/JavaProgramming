package src.java_Programming_Lessons.day28_encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings;
    public static int numberOfHead;


    public Person(String name) { // allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { // allows us to create Person object just by setting the name & age of the person
        this(name); // constructor calling has to be at first step
        this.age = age;
    }

    public Person(String name, String language) { // allows us to create Person object just by setting the name & language of the person
        this(name);  // first constructor calling
        this.language = language;
    }

    public Person(String name, char gender) { // allows us to create Person object just by setting the name & gender of the person
        this(name);
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        this(name, age);
        //this(gender); // one constructor can not call more than one constructor because  constructor is SPECIAL method
        this.gender = gender; // therefore we assign and set our local variable to instance variable by calling manually
    }


    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;
    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }


    public static void printPlanetName() { //static -> we need only one copy -> less memory usage
        System.out.println(planet);
    }

    public void eat(String food) { // as long as we need instance variables we need to create instance method
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }


    public String toString() {  // this method is instance method and accepts both instance and static
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
Warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */