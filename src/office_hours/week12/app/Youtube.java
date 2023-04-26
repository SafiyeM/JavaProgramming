package office_hours.week12.app;

public class Youtube extends App {


    public Youtube(double version) {
        super(version);
    }

    public void watchVideo(){

        System.out.println("watching java tutorial from " + name);
    }


}


/*
 Create a class Youtube

        - Youtube class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            watchVideo()
                Example output: prints Watching java tutorial
 */