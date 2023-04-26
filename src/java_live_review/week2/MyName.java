package java_live_review.week2;

public class MyName {

    public static void main(String[] args) {

        System.out.println(5+3); // 8

        System.out.println(5+3 + "hello"); // 8hello// here before String, it makes addition
        System.out.println("Java" +1+2); //Java12 //here after string digits are not anymore digit they are characters
        System.out.println("Java" + (1+2)); //so 1+2=3 //within () it#s addition


        int age= 30;
        String month= "March";
        String str= "In " + month + " you will turn " +age;

        System.out.println(str);

        System.out.println(month + 4+1 ); // string + int+int so concatenation

        // Task: create a char variable for every character in your name,
        //think about all the ways you can print your name.



        char    s= 'S',
                a= 'A',
                f= 'F',
                i= 'I',
                y= 'Y',
                e= 'E';

        //1. IT's another way to write single letter in the same line with char variable

       // System.out.print();

        System.out.print(s);
        System.out.print(a);
        System.out.print(f);
        System.out.print(i);
        System.out.print(y);
        System.out.print(e);

        System.out.println();

        //2. Other way

        System.out.println(""+s+a+f+i+y+e); // if we add String, it allows us to print the characters

        //System.out.println(s+a+f+i+y+e);// adds the numbers of the character of the name


        //System.out.println(s+a+f+i+y+e+ ""); // It is added the first characters and doesn't print as characters









    }
}
