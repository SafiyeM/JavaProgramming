package java_live_review.week6;

public class Variables {



    int z; // instance variable

    public void m(int z){ // this z is a local variable
        z = z; // this does not assign a value to the instance variable
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.z = 10;
        obj.m(5);
        int z = 19; // this  is a local variable in the main method

//        for(int i = 0; false;){
//
//        }
//        for(int i = 0; false;){
//
//        }

    }
}
