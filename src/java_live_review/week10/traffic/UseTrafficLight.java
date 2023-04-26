package java_live_review.week10.traffic;

public class UseTrafficLight {

    public static void main(String[] args) {



        TrafficLight trafficLight= new TrafficLight("red"); // red

        System.out.println(trafficLight.getColor());// not valid so not executed
        trafficLight.setColor("brown");
        System.out.println("______________");
        System.out.println(trafficLight.getColor()); // red
        trafficLight.setColor("green");
        System.out.println(trafficLight.getColor()); // green

        System.out.println(new TrafficLight("hello").getColor()); // null - default value we are restricted to assign any other obj
        // creating an object without a reference and accessing the color's getter

    }
}
