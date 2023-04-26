package java_live_review.week11.discordUser;


public class Student extends DiscordUser {


    int loveForJava;

    public Student(String name, String id, int loveForJava) {
        super("Student", name, id);
        this.loveForJava = loveForJava;
    }

    @Override
    public void sendMessage() {
        System.out.println("send Message Method");
    }

    public void sendMessage(String name){

        System.out.println(role+ " is sending message to ");
    }

    public static void launch(){ // NOT OVERRIDING; we hide the original by creating a new one
        System.out.println("Student opening");
    }

}
/*
Create a class Student

	    - Student class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Student, name, id)

	    - overload the sendMessage(String name) to accept a String for the chat name
	    	print Sending message to $name
 */