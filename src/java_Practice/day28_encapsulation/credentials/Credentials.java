package java_Practice.day28_encapsulation.credentials;

public class Credentials {


    private String username,
                   password;


    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)){
            System.err.println("password "+ password + " is not strong");
            System.exit(1);
        }

        this.password = password;
    }

    //  This is an implementation of a strong password checker
    public boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // has Upper case letter
        boolean r3 = false;  // has lower case letter
        boolean r4 = false;  // has Digit
        boolean r5 = false; // has Special Character

        for (char each : password.toCharArray()) { //  The method checks each character in the password using a for-each loop,

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{
                r5 = true;
            }

            //method sets the corresponding boolean r2, r3, r4, and r5 to true,
            // if the character satisfies the corresponding criterion.
        }

        return  r1 && r2 && r3 && r4 && r5;
        // Finally, the method returns true if all five boolean are true, and false otherwise.
    }


    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


/*
5. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()

 */