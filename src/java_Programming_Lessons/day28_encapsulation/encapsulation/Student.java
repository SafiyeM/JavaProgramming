package java_Programming_Lessons.day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;


    public String getName() { // getter

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) { // setter

        boolean hasDigit = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }

        }
        if (hasDigit){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge(){  // getter READ ONLY

        if (age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }


        return age;
    }

    public void setAge(int age) { // setter WRITE ONLY

        if (age < 1 || age > 100){
            System.err.println("Invalid Age: " + age);
           //return; // exiting method not program
           System.exit(1); // program gets terminated

        }
        this.age = age;
    }




}
