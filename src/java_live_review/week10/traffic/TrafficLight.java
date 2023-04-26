package java_live_review.week10.traffic;

public class TrafficLight {


    private String color;  // objects are null by default


    public TrafficLight(String color) {
        setColor(color);  // instead of initializing we set the color
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")) {
            this.color = color;     // otherwise it will not being executed
        }
    }
}
/*
TrafficLight [Encapsulation]

	Create a class Traffic Light

	instance variable: color (String)

	the constructor should call the setter method

	encapsulate the class
		in the setter: only set the color if it is green, red, or yellow

 */