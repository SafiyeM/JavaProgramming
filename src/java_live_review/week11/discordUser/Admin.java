package java_live_review.week11.discordUser;


public class Admin extends DiscordUser {


    public Admin(String name, String id) {
        super("Admin", name, id);
    }

    public void createChannel(){

        System.out.println(role + " is creating new discord channel");
    }

    @Override
    public void sendMessage(){

        System.out.println( role + name + " is sending announcement" );
    }

}
/*
Create a class Admin

	    - Admin class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

	    - create method:
	        createChannel()
	            Example output: prints Creating new discord channel

	    - override the sendMessage() to print: "Sending announcement"
 */