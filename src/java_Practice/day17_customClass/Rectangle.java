package java_Practice.day17_customClass;

public class Rectangle {


    public double length;
    public double width;


    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateArea(){

        return width * length;

    }

    public double calculatePerimeter(){

        return 2* (width +length);
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area="+ calculateArea()+
                ", perimeter="+ calculatePerimeter()+
                '}';
    }


    public static void main(String[] args) {


        Rectangle rectangle1= new Rectangle();
        rectangle1.setInfo(12.0, 4.0);

        Rectangle rectangle2= new Rectangle();
        rectangle2.setInfo(18.0,8.0);


       // System.out.println(rectangle1);
       // System.out.println(rectangle1.calculateArea());
      //  System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.toString());

      //  System.out.println(rectangle2);
        //System.out.println(rectangle2.calculateArea());
        //System.out.println(rectangle2.calculatePerimeter());
        System.out.println(rectangle2.toString());


    }


}
/*
3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object

 */