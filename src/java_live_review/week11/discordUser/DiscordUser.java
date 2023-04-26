package java_live_review.week11.discordUser;

import java.time.LocalDate;

public class DiscordUser {

    String role, name, id;
    LocalDate createdDate;

    public DiscordUser(String role, String name, String id) {
        this.role = role;
        this.name = name;
        this.id = id;
        createdDate = LocalDate.now();
    }

    public void sendMessage(){

        System.out.println(role+ " is sending message to class chat");
    }

    public void joinDiscord(String discordUrl){

        System.out.println("Joining Discord Url: " + discordUrl);
    }


    public static void launch(){
        System.out.println("connecting to server");
    }

    @Override
    public String toString() {
        return  name + "#" + id+ "\nRoles:"+ role + "\nAccount created:" + createdDate;

    }
}
/*
	Create an DiscordUser class

	    - create variables:
	        role, name, id
	        variable: account creation date

	    - create constructor to initialize the variables

	    - create a method sendMessage()
	    	prints: "Sending message to class chat"

	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"

	    - override toString()
 */