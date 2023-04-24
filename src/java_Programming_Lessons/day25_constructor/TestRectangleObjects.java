package java_Programming_Lessons.day25_constructor;

public class TestRectangleObjects {


    public static void main(String[] args) {

     /*  Rectangle rectangle1 = new Rectangle(); // Rectangle() -> default constructor (defined by compiler by default)

        System.out.println(rectangle1); // Rectangle{length=0.0, width=0.0, area=0.0} -> we have not set the infos yet

        rectangle1.setInfo(12,6);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(6,3);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(14,7);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(10,5);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(9,4);

      */

        /* By passing parameter in constructor that we created, we make it mandatory for the user to provide
         the length and width of the rectangle object. Otherwise, it will not be created.
         */

        Rectangle rectangle1 = new Rectangle(12,10);
        Rectangle rectangle2 = new Rectangle(6,3);
        Rectangle rectangle3 = new Rectangle(14,7);
        Rectangle rectangle4 = new Rectangle(10,5);
        Rectangle rectangle5 = new Rectangle(9,4);

        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);
        System.out.println("rectangle4 = " + rectangle4);
        System.out.println("rectangle5 = " + rectangle5);





    }




}
