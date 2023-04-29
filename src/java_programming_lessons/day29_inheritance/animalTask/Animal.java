package java_programming_lessons.day29_inheritance.animalTask;

public class Animal {


    private String name, breed, size, color;
    private int age;
    private char gender;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, String size, String color, int age, char gender) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }


    public void eat(){

        System.out.println(name + " is eating");
    }

    public void sleep(){

        System.out.println(name + " is sleeping");
    }


    public void drink(){

        System.out.println(name + " is drinking water");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
/*
Custom Classes:
	0. Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()

 */