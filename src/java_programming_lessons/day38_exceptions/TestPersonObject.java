package java_programming_lessons.day38_exceptions;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Viki", 34, 'F');
        System.out.println(person1);




        Person person2 = new Person("Daniel", 32, 'K'); // invalid gender
        // gender is final, and we instantiated it in the constructor of Person Class
        // so the constructor throws the exception, that's why the object will not be created.

        System.out.println(person2);

        try {
            person2.setAge(-25);
        }catch (RuntimeException e){
            e.printStackTrace(); // displays the full details of execution
        }

        System.out.println(person2);
    }

}
