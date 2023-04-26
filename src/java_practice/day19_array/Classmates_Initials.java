package java_practice.day19_array;

public class Classmates_Initials {

    public static void main(String[] args) {

        String[] classmates= {"Harry P","Merry F","Sara S", "Shira C", "Andrea E", "Ingrid A","Joseph C", "Micheal S"};

        for (int i = 0; i < classmates.length; i++) {


                String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(  classmates[i].indexOf(" ") + 1);
                System.out.println(initial);

            }


    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines

 */